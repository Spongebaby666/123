package com.example.zombiehealth;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class ZombieCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    public ZombieCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§c/zombiehealth <reload|status>");
            return true;
        }

        String subcommand = args[0].toLowerCase();

        if (subcommand.equals("reload")) {
            plugin.reloadConfig();
            sender.sendMessage("§aZombieHealth plugin reloaded!");
            return true;
        }

        if (subcommand.equals("status")) {
            // Count zombies in all worlds
            int zombieCount = 0;
            for (var world : Bukkit.getWorlds()) {
                for (var entity : world.getEntities()) {
                    if (entity.getType() == EntityType.ZOMBIE) {
                        zombieCount++;
                    }
                }
            }
            sender.sendMessage("§a═══════════════════════════════");
            sender.sendMessage("§aZombieHealth Plugin Status");
            sender.sendMessage("§aVersion: 1.0.0");
            sender.sendMessage("§aTotal Zombies: §f" + zombieCount);
            sender.sendMessage("§aAll zombies spawn with §c100 HP");
            sender.sendMessage("§a═══════════════════════════════");
            return true;
        }

        sender.sendMessage("§cUnknown subcommand. Use /zombiehealth <reload|status>");
        return true;
    }
}
