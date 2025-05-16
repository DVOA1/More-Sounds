package dev.dvoa.moresounds.datagen.providers;

import dev.dvoa.moresounds.MoreSounds;
import dev.dvoa.moresounds.sounds.MoreSoundsSoundRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class MoreSoundDefProvider extends SoundDefinitionsProvider {

    public MoreSoundDefProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, MoreSounds.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        add(MoreSoundsSoundRegistry.INTERFERENCE, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/interference", SoundDefinition.SoundType.SOUND)

                )
                .subtitle("subtitles.item.interference")
        );

        add(MoreSoundsSoundRegistry.BIPBIP, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/bipbip", SoundDefinition.SoundType.SOUND)

                )
                .subtitle("subtitles.item.bipbip")
        );

        add(MoreSoundsSoundRegistry.SMALL_MOTOR, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/small_motor", SoundDefinition.SoundType.SOUND)

                )
                .subtitle("subtitles.item.small_motor")
        );

        add(MoreSoundsSoundRegistry.BOTTLED_VISCOUS_SLOSH, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/viscous/slosh01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/viscous/slosh02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/viscous/slosh03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/viscous/slosh04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/viscous/slosh05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.viscous_slosh")
        );

        add(MoreSoundsSoundRegistry.METAL_BOX_EMPTY, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/metal/box/empty01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/empty02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/empty03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/empty04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/empty05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.metal_box_empty")
        );

        add(MoreSoundsSoundRegistry.METAL_BOX_FULL, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/metal/box/full01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/full02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/full03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/full04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/metal/box/full05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.metal_box_full")
        );

        add(MoreSoundsSoundRegistry.CARDBOARD_BOX, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/cardboard/cardboard01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/cardboard/cardboard02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/cardboard/cardboard03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/cardboard/cardboard04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/cardboard/cardboard05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.cardboard")
        );

        add(MoreSoundsSoundRegistry.MAGIC, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/magic/hum01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/magic/hum02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/magic/hum03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/magic/hum04", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.magic_hum")
        );

        add(MoreSoundsSoundRegistry.FILLED_SACK, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/filled_sack/move01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/filled_sack/move02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/filled_sack/move03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/filled_sack/move04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/filled_sack/move05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.filled_sack")
        );

        add(MoreSoundsSoundRegistry.NIGHT_VISION, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/night_vision", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.night_vision")
        );

        add(MoreSoundsSoundRegistry.DARK_MAGIC, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/dark/breath01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/dark/breath02", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.dark_breath")
        );

        add(MoreSoundsSoundRegistry.BONE_EQUIP, SoundDefinition.definition()
                .with(
                        sound("more_sounds:item/equip/bone/equip01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/equip/bone/equip02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/equip/bone/equip03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/equip/bone/equip04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:item/equip/bone/equip05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.equip_bone")
        );

        add(MoreSoundsSoundRegistry.ZIP, SoundDefinition.definition()
                .with(
                        sound("more_sounds:screen/zip/zip01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:screen/zip/zip02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:screen/zip/zip03", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.screen.zip")
        );
    }
}
