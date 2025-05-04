package dev.dvoa.moresounds.sounds;

import dev.dvoa.moresounds.MoreSounds;
import dev.dvoa.moresounds.utils.helpers.MoreResourceHelper.Location;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MoreSoundsSoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, MoreSounds.MOD_ID);

    public static Supplier<SoundEvent> INTERFERENCE = registerSoundEvent("item.interference");
    public static Supplier<SoundEvent> BIPBIP = registerSoundEvent("item.bipbip");
    public static Supplier<SoundEvent> SMALL_MOTOR = registerSoundEvent("item.small_motor");
    public static Supplier<SoundEvent> BOTTLED_INK_SLOSH = registerSoundEvent("item.bottled_ink.slosh");
    public static Supplier<SoundEvent> METAL_BOX_EMPTY = registerSoundEvent("item.metal.box_empty");
    public static Supplier<SoundEvent> METAL_BOX_FULL = registerSoundEvent("item.metal.box_full");
    public static Supplier<SoundEvent> CARDBOARD_BOX = registerSoundEvent("item.cardboard.box");
    public static Supplier<SoundEvent> ZIP = registerSoundEvent("screen.zip");

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = Location.getResource(MoreSounds.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
