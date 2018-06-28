package ru.mineclass.falloutmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mineclass.falloutmod.register.BlocksRegister;
import ru.mineclass.falloutmod.register.ItemRegister;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }


    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        BlocksRegister.registerRender();
        ItemRegister.registerRender();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
