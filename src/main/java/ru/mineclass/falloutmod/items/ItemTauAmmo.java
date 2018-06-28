package ru.mineclass.falloutmod.items;


import net.minecraft.item.ItemArrow;

public class ItemTauAmmo extends ItemArrow {
    public static final String NAME = "tauammo";

    public ItemTauAmmo() {
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setMaxStackSize(50);
        getDefaultInstance(1000);
    }

    private void getDefaultInstance(int i) {
    }


}
