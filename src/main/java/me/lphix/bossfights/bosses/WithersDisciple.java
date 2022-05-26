package me.lphix.bossfights.bosses;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;

public class WithersDisciple extends Boss{
    private final Component displayName = Component.text("Wither's Disciple", NamedTextColor.GRAY);
    private final double initialHealth = 100;

    public WithersDisciple(Location location){
        init(location);
    }

    private void init(Location location) {
        super.mob = location.getWorld().spawn(location, WitherSkeleton.class, b ->{
            b.customName(displayName);
            b.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(initialHealth);
        });
    }
}
