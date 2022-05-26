package me.lphix.bossfights.listeners;

import me.lphix.bossfights.inventory.BossMenu;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {
    @EventHandler
    public static void onPlayerInteract(PlayerInteractEvent e){
        if(!(e.getItem() == null)){
            return;
        }
        if(!(e.getItem().getType().equals(Material.MAGMA_CREAM))){
            return;
        }
        e.getPlayer().openInventory(new BossMenu().getInventory());
    }
}
