package com.github.fdx.sky.pool;

import org.bukkit.Material;

/** @author FlashDaggerX */
public class Treasure {
    public enum ItemValue {
        NIL(0), LESS(1.5), NORMAL(1.0), GREAT(0.5), GREATEST(0.25);

        public double rarity;
        ItemValue(double rarity) { this.rarity = rarity; }

        public ItemValue fromRarity(double val) {
            // Scroll through item values and see if they match. 
            // Return Nil otherwise.
            for (ItemValue v : values()) { if (v.rarity == val) return v; }
            return ItemValue.NIL;
        }
    }

    public Material material;

    public ItemValue worth;
    public double quantity;
    
    public Treasure(Material material, ItemValue worth) {
        this.material = material;
        this.worth = worth;
        this.quantity = 1;
    }

    public Treasure(Material material, ItemValue worth, int quantity) {
        this.material = material;
        this.worth = worth;
        this.quantity = quantity;
    }
}
