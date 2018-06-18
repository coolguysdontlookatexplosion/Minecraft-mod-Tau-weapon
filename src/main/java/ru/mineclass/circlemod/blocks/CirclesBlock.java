package ru.mineclass.circlemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CirclesBlock extends Block {
    public CirclesBlock(String name) {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
    }
}
