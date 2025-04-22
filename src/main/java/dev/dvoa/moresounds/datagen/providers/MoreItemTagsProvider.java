package dev.dvoa.moresounds.datagen.providers;

import dev.dvoa.moresounds.MoreSounds;
import dev.dvoa.moresounds.utils.helpers.MoreResourceHelper.Keys;
import dev.dvoa.moresounds.utils.helpers.MoreResourceHelper.Location;
import dev.dvoa.moresounds.utils.tags.MoreTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.p3pp3rf1y.sophisticatedstorageinmotion.init.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MoreItemTagsProvider extends ItemTagsProvider {
    public MoreItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MoreSounds.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@Nullable HolderLookup.Provider provider) {
        tag(MoreTags.Items.BIPBIP)
                .replace(false)
                .addOptional(Location.getResource("mekanism:robit"))
                .addOptional(Location.getResource("shrink:shrinking_device"))
                .addOptional(Location.getResource("advancedperipherals:colony_integrator"))
                .addOptional(Location.getResource("shrink:shrinking_device"))
                .addOptional(Location.getResource("justdirethings:portalgun"))
                .addOptional(Location.getResource("justdirethings:portalgun_v2"))
                .addOptionalTag(MoreTags.Items.COMPUTERS);

        tag(MoreTags.Items.BOATS)
                .add(ModItems.STORAGE_BOAT.getKey());

        tag(MoreTags.Items.BOTTLED_INKS)
                .addOptional(Location.getResource("supplementaries:antique_ink"))
                .addOptional(Location.getResource("occultism:purified_ink"))
                .addOptional(Location.getResource("irons_spellbooks:common_ink"))
                .addOptional(Location.getResource("irons_spellbooks:uncommon_ink"))
                .addOptional(Location.getResource("irons_spellbooks:rare_ink"))
                .addOptional(Location.getResource("irons_spellbooks:epic_ink"))
                .addOptional(Location.getResource("irons_spellbooks:legendary_ink"));

        tag(MoreTags.Items.GENERIC_WRENCHES)
                .addTag(Tags.Items.TOOLS_WRENCH)
                .addOptionalTag(MoreTags.Items.WRENCHES)
                .addOptional(Location.getResource("advancedperipherals:computer_tool"))
                .remove(Location.getResource("pneumaticcraft:pneumatic_wrench"))
                .remove(Location.getResource("ae2:nether_quartz_wrench"))
                .remove(Location.getResource("ae2:certus_quartz_wrench"));

        tag(MoreTags.Items.GLASS)
                .addTag(Tags.Items.GLASS_BLOCKS)
                .addTag(Tags.Items.GLASS_PANES);

        tag(MoreTags.Items.INTERFERENCE)
                .addOptional(Location.getResource("mekanism:pellet_antimatter"))
                .addOptional(Location.getResource("mekanism_extras:alloy_spectrum"))
                .addOptional(Location.getResource("mekanism_extras:enriched_spectrum"))
                .addOptional(Location.getResource("modern_industrialization:singularity"))
                .addOptional(Location.getResource("ae2:singularity"))
                .addOptional(Location.getResource("advanced_ae:shattered_singularity"))
                .addOptional(Location.getResource("ae2:quantum_entangled_singularity"));

        tag(MoreTags.Items.PAPERS)
                .addOptionalTag(MoreTags.Items.COMMON_PAPERS)
                .add(Keys.Items.getResourceByID("minecraft:filled_map"))
                .add(Keys.Items.getResourceByID("minecraft:map"))
                .addOptional(Location.getResource("irons_spellbooks:scroll"))
                .addOptional(Location.getResource("supplementaries:slice_map"))
                .addOptional(Location.getResource("twilightforest:ore_map"))
                .addOptional(Location.getResource("twilightforest:magic_map"))
                .addOptional(Location.getResource("twilightforest:maze_map"));

        tag(MoreTags.Items.METAL_PLATES)
                .addOptionalTag(MoreTags.Items.COMMON_METAL_PLATES)
                .remove(Location.getResource("create:cardboard"));

    }
}