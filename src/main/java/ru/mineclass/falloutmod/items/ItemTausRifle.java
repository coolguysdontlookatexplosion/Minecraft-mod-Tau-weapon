package ru.mineclass.falloutmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;

public class ItemTausRifle extends ItemBow {
    private static final String NAME = "tausrifle";

    public ItemTausRifle() {
        super();
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setFull3D();
        setCreativeTab(CreativeTabs.COMBAT);

    }



}
