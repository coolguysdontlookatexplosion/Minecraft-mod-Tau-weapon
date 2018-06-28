package ru.mineclass.falloutmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mineclass.falloutmod.register.BlocksRegister;
import ru.mineclass.falloutmod.register.ItemRegister;




public abstract class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        BlocksRegister.register();
        ItemRegister.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
