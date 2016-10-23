package pietlafrite.jacta.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue1 = false;
        boolean configValue2 = false;

        try {
            configuration.load();
            configValue1 = configuration.get(Configuration.CATEGORY_GENERAL, "A config Value example", true, "Comment to be completed").getBoolean(true);
            configValue2 = configuration.get("Keybindings", "A config Value example", true, "Comment to be completed").getBoolean(true);
        }
        catch (Exception e){

        }
        finally {
            configuration.save();
        }
        System.out.println("configValue1 is now set to :"+ configValue1);
        System.out.println("configValue2 is now set to :"+ configValue2);
    }
}
