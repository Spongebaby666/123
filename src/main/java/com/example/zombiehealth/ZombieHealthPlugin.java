package com.example.zombiehealth;

import org.bukkit.plugin.java.JavaPlugin;

public class ZombieHealthPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register event listener
        getServer().getPluginManager().registerEvents(new ZombieListener(this), this);
        
        // Register command executor
        getCommand("zombiehealth").setExecutor(new ZombieCommand(this));
        
        getLogger().info("ZombieHealth plugin has been enabled!");
        getLogger().info("All zombies will now spawn with 100 health points!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ZombieHealth plugin has been disabled!");
    }
}
