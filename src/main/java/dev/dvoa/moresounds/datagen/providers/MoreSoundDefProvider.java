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
                        sound("more_sounds:interference", SoundDefinition.SoundType.SOUND)

                )
                .subtitle("subtitles.item.interference")
        );

        add(MoreSoundsSoundRegistry.BIPBIP, SoundDefinition.definition()
                .with(
                        sound("more_sounds:bipbip", SoundDefinition.SoundType.SOUND)

                )
                .subtitle("subtitles.item.bipbip")
        );

        add(MoreSoundsSoundRegistry.SMALL_MOTOR, SoundDefinition.definition()
                .with(
                        sound("more_sounds:small_motor", SoundDefinition.SoundType.SOUND)

                )
                .subtitle("subtitles.item.small_motor")
        );

        add(MoreSoundsSoundRegistry.BOTTLED_VISCOUS_SLOSH, SoundDefinition.definition()
                .with(
                        sound("more_sounds:viscous/slosh01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:viscous/slosh02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:viscous/slosh03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:viscous/slosh04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:viscous/slosh05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.viscous_slosh")
        );

        add(MoreSoundsSoundRegistry.METAL_BOX_EMPTY, SoundDefinition.definition()
                .with(
                        sound("more_sounds:metal/box/empty01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/empty02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/empty03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/empty04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/empty05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.metal_box_empty")
        );

        add(MoreSoundsSoundRegistry.METAL_BOX_FULL, SoundDefinition.definition()
                .with(
                        sound("more_sounds:metal/box/full01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/full02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/full03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/full04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:metal/box/full05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.metal_box_full")
        );

        add(MoreSoundsSoundRegistry.CARDBOARD_BOX, SoundDefinition.definition()
                .with(
                        sound("more_sounds:cardboard/cardboard01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:cardboard/cardboard02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:cardboard/cardboard03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:cardboard/cardboard04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:cardboard/cardboard05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.cardboard")
        );

        add(MoreSoundsSoundRegistry.MAGIC, SoundDefinition.definition()
                .with(
                        sound("more_sounds:magic/hum01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:magic/hum02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:magic/hum03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:magic/hum04", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.magic_hum")
        );

        add(MoreSoundsSoundRegistry.FILLED_SACK, SoundDefinition.definition()
                .with(
                        sound("more_sounds:filled_sack/move01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:filled_sack/move02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:filled_sack/move03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:filled_sack/move04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:filled_sack/move05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.filled_sack")
        );

        add(MoreSoundsSoundRegistry.ZIP, SoundDefinition.definition()
                .with(
                        sound("more_sounds:zip/zip01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:zip/zip02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:zip/zip03", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.screen.zip")
        );
    }
}
