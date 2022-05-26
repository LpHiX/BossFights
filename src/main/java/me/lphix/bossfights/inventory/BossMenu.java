package me.lphix.bossfights.inventory;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class BossMenu implements InventoryHolder {

    private Inventory inventory;

    public BossMenu(){
        inventory = Bukkit.createInventory(this, 54, Component.text("Boss Menu", NamedTextColor.DARK_GREEN));
        init();
    }

    private void init() {
        for (int i = 0; i < 54; i++){
            ItemStack fillerItem = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
            ItemMeta fillerMeta = fillerItem.getItemMeta();
            fillerMeta.displayName(Component.text(" "));
            fillerItem.setItemMeta(fillerMeta);
            inventory.setItem(i, fillerItem);
        }
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }
}
