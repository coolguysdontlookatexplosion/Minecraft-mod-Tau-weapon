package ru.mineclass.falloutmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRad extends Block {

    public static final String NAME = "radblock";

    public BlockRad() {
        super(Material.ROCK);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setLightLevel(100);
        setHardness(5);

    }
}
