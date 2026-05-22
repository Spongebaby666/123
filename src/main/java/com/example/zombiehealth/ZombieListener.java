package com.example.zombiehealth;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ZombieListener implements Listener {

    private final JavaPlugin plugin;

    public ZombieListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onZombieSpawn(EntitySpawnEvent event) {
        // Check if the spawned entity is a zombie
        if (event.getEntity().getType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();
            
            // Set zombie health to 100
            zombie.setHealth(100);
            
            // Optional: Set max health to 100 as well
            zombie.getAttribute(org.bukkit.attribute.Attribute.MAX_HEALTH).setBaseValue(100);
            
            plugin.getLogger().fine("Zombie spawned with 100 health at: " + zombie.getLocation());
        }
    }
}
