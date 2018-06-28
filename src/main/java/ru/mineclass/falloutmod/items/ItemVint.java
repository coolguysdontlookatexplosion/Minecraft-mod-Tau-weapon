package ru.mineclass.falloutmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemVint extends ItemFood {
    public static final String NAME = "vint";

    public ItemVint() {
        super(1, .5f, false);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(CreativeTabs.FOOD);
        setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);

        player.addPotionEffect(
                new PotionEffect(Potion.getPotionById(1), 250));
    }
}