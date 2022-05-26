package me.lphix.bossfights.listeners;

import me.lphix.bossfights.bosses.WithersDisciple;
import me.lphix.bossfights.inventory.BossMenu;
import me.lphix.bossfights.managers.BossManager;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {
    @EventHandler
    public static void onInventoryClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        Zombie zombie = p.getWorld().spawn(p.getLocation(), Zombie.class);
        if(!(e.getClickedInventory() == null)){
          return;
        }
        if(e.getClickedInventory().getHolder() instanceof BossMenu){
            e.setCancelled(true);
            switch(e.getSlot()){
                case 1:
                    BossManager.spawn(WithersDisciple.class);
                    break;
                default:
                    break;
            }
        }
    }
}
