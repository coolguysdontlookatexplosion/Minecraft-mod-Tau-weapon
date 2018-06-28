package ru.mineclass.falloutmod.register;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.mineclass.falloutmod.items.ItemTauAmmo;
import ru.mineclass.falloutmod.items.ItemTausRifle;
import ru.mineclass.falloutmod.items.ItemVint;

public class ItemRegister {
    static Item item = new ItemVint();
    static Item item1 = new ItemTausRifle();
    static Item item2 = new ItemTauAmmo();
    static Item[] items = {
            item,
            item1,
            item2,


    };

    public static void register() {
        setRegister(items);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(items);
    }

    private static void setRegister(Item[] items) {
        ForgeRegistries.ITEMS.registerAll(items);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item[] items) {
        for (Item item : items)
            Minecraft
                    .getMinecraft()
                    .getRenderItem()
                    .getItemModelMesher()
                    .register(item, 0,
                            new ModelResourceLocation(
                                    item.getRegistryName(), "inventory"));

    }
}
