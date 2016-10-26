package pietlafrite.jacta;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import pietlafrite.jacta.handler.ConfigurationHandler;
import pietlafrite.jacta.init.ModBlocks;
import pietlafrite.jacta.init.ModItems;
import pietlafrite.jacta.proxy.IProxy;
import pietlafrite.jacta.reference.Reference;
import pietlafrite.jacta.utility.LogHelper;


@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = "pietlafrite.jacta.client.gui.GuiFactory")
public class Jacta
{
    @Mod.Instance(Reference.MOD_ID)
    public static Jacta instance;

    @SidedProxy(clientSide="pietlafrite.jacta.proxy.ClientProxy", serverSide="pietlafrite.jacta.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("PreInitialization complete !");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization complete !");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInitialization complete !");
    }
}
