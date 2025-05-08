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

        add(MoreSoundsSoundRegistry.BOTTLED_INK_SLOSH, SoundDefinition.definition()
                .with(
                        sound("more_sounds:inks/slosh01", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:inks/slosh02", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:inks/slosh03", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:inks/slosh04", SoundDefinition.SoundType.SOUND),
                        sound("more_sounds:inks/slosh05", SoundDefinition.SoundType.SOUND)
                )
                .subtitle("subtitles.item.ink_slosh")
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
