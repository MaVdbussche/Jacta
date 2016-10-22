package pietlafrite.jacta;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import pietlafrite.jacta.proxy.IProxy;
import pietlafrite.jacta.reference.Reference;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class jacta
{
    @Mod.Instance(Reference.MOD_ID)
    public static jacta instance;

    @SidedProxy(clientSide="pietlafrite.jacta.proxy.ClientProxy", serverSide="pietlafrite.jacta.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
