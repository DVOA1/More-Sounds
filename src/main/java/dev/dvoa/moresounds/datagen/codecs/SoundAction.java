package dev.dvoa.moresounds.datagen.codecs;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;

import java.util.List;


public record SoundAction(
        List<String> keys,
        ResourceLocation soundEvent,
        double pitch,
        double volume
) {
    public static final MapCodec<SoundAction> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Codec.STRING.listOf().fieldOf("keys").forGetter(SoundAction::keys),
            ResourceLocation.CODEC.fieldOf("soundEvent").forGetter(SoundAction::soundEvent),
            Codec.DOUBLE.optionalFieldOf("pitch", 1.0).forGetter(SoundAction::pitch),
            Codec.DOUBLE.optionalFieldOf("volume", 1.0).forGetter(SoundAction::volume)
    ).apply(inst, SoundAction::new));
}
