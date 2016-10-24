package pietlafrite.jacta.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import pietlafrite.jacta.reference.Reference;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue1 = false;

    public static void init(File configFile)
    {
        if (configuration == null){
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase((Reference.MOD_ID))){
            loadConfiguration();
        }
    }

    public void loadConfiguration()
    {
        testValue1 = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Comment to be added");
        if(configuration.hasChanged()){
            configuration.save();
        }
    }
}
