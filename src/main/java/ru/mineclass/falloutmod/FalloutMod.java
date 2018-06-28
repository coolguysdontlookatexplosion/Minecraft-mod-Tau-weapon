package ru.mineclass.falloutmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import ru.mineclass.falloutmod.proxy.CommonProxy;

@Mod(modid = FalloutMod.MODID,
        name = FalloutMod.NAME,
        version = FalloutMod.VERSION)
public class FalloutMod {

    public static final String MODID = "falloutmod";
    public static final String NAME = "Fallout Mod";
    public static final String VERSION = "0.1-dev";

    private static Logger logger;

    @SidedProxy(clientSide = "ru.mineclass.falloutmod.proxy.ClientProxy",
            serverSide = "ru.mineclass.falloutmod.proxy.ServerProxy")
    private static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) { proxy.init(event); }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
