package dev.dvoa.moresounds;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(MoreSounds.MODID)
public class MoreSounds {
    public static final String MODID = "more_sounds";
    public static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}