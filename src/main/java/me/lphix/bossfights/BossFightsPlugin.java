package me.lphix.bossfights;

import me.lphix.bossfights.listeners.PlayerInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossFightsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerInteractListener(), this);
        Bukkit.getLogger().info("[BossFights] Enabling!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[BossFights] Disabling!");
    }
}
