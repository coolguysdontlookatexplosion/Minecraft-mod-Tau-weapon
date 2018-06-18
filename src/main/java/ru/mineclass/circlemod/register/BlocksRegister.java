package ru.mineclass.circlemod.register;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;
import ru.mineclass.circlemod.blocks.CirclesBlock;

public class BlocksRegister {
    public static CirclesBlock block = new CirclesBlock("Lol");

    private static final Block[] blocks = {
            block
    };

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(blocks);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (final Block block : blocks) {
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    public static void registerModels() {

    }
}
