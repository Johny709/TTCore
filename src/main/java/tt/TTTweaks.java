package tt;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = TTTweaks.MOD_ID, name = TTTweaks.MOD_NAME, version = TTTweaks.VERSION, acceptableRemoteVersions = "*")
public class TTTweaks {
    public static final String MOD_ID = "tttweaks";
    public static final String MOD_NAME = "TTTweaks";
    public static final String VERSION = "1.0";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", MOD_NAME);
    }


}
