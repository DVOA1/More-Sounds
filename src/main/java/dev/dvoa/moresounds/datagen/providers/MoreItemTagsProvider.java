package dev.dvoa.moresounds.datagen.providers;

import dev.dvoa.moresounds.MoreSounds;
import dev.dvoa.moresounds.utils.helpers.MoreResourceHelper.Keys;
import dev.dvoa.moresounds.utils.helpers.MoreResourceHelper.Location;
import dev.dvoa.moresounds.utils.tags.MoreTags;
import dev.dvoa.moresounds.utils.helpers.MorePatternHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MoreItemTagsProvider extends ItemTagsProvider {
    public MoreItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MoreSounds.MOD_ID, existingFileHelper);
    }

    private void appendPattern(IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> appender, String pattern){
        for(String path: MorePatternHelper.expand(pattern)){appender.addOptional(Location.getResource(path));}
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
                .addOptional(Location.getResource("computercraft:pocket_computer_advanced"))
                .addOptional(Location.getResource("computercraft:pocket_computer_normal"))
                .addOptionalTag(MoreTags.Items.COMPUTERS);

        tag(MoreTags.Items.BOATS)
                .addOptional(Location.getResource("sophisticatedstorageinmotion:storage_boat"))
                .addOptionalTag(MoreTags.Items.MINECRAFT_BOATS);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> bott_viscous = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.BOTTLED_VISCOUS)
                .addOptional(Location.getResource("supplementaries:antique_ink"))
                .addOptional(Location.getResource("occultism:purified_ink"))
                .addOptional(Location.getResource("the_bumblezone:royal_jelly_bottle"));

        appendPattern(bott_viscous, "irons_spellbooks:(common|epic|legendary|rare|uncommon)_ink");

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
                .addOptionalTag(MoreTags.Items.SPELLBOOK)
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

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> leather_things = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.LEATHER_THINGS)
                .addOptional(Location.getResource("sophisticatedbackpacks:backpack"))
                .addOptional(Location.getResource("ars_elemental:curio_bag"))
                .addOptional(Location.getResource("ars_elemental:caster_bag"))
                .addOptional(Location.getResource("minecraft:bundle"))
                .addOptional(Location.getResource("ars_additions:handy_haversack"))
                .addOptional(Location.getResource("actuallyadditions:void_sack"))
                .addOptional(Location.getResource("actuallyadditions:travelers_sack"))
                .addOptionalTag(MoreTags.Items.BACKPACK_UPGRADES)
                .addOptionalTag(MoreTags.Items.STORAGE_UPGRADES);

        appendPattern(leather_things, "sophisticatedbackpacks:(copper|diamond|gold|iron|netherite)_backpack");

        tag(MoreTags.Items.BOWS)
                .addOptionalTag(Tags.Items.TOOLS_BOW)
                .addOptionalTag(Tags.Items.TOOLS_CROSSBOW);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> std_equip = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.STANDARD_EQUIP)
                .addOptionalTag(Tags.Items.TOOLS_SPEAR)
                .addOptionalTag(MoreTags.Items.JUST_HAMMERS)
                .addOptionalTag(MoreTags.Items.RINGS)
                .remove(Location.getResource("minecraft:trident"));

        appendPattern(std_equip, "mekanismtools:(bronze|lapis_lazuli|osmium|refined_glowstone|refined_obsidian|steel)_(axe|hoe|paxel|pickaxe|shield|shovel|sword)");
        appendPattern(std_equip, "mekanismtools:(diamond|gold|iron|stone|wood)_paxel");
        appendPattern(std_equip, "deeperdarker:resonarium_(axe|boots|chestplate|helmet|hoe|leggings|pickaxe|shovel|sword)");
        appendPattern(std_equip, "industrialforegoing:infinity_(backpack|drill|hammer|launcher|saw)");

        tag(MoreTags.Items.NETHERITE_EQUIP)
                .addOptionalTag(MoreTags.Items.ADV_ARMOR)
                .addOptionalTag(MoreTags.Items.ADV_TOOLS);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> skulk_equip = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.SCULK_EQUIP)
                .addOptional(Location.getResource("deeperdarker:reinforced_echo_shard"))
                .addOptional(Location.getResource("deeperdarker:warden_carapace"))
                .addOptional(Location.getResource("deeperdarker:heart_of_the_deep"));

        appendPattern(skulk_equip, "deeperdarker:warden_(axe|boots|chestplate|helmet|hoe|leggings|pickaxe|shovel|sword)");

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> cardboard = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.CARDBOARD)
                .addOptional(Location.getResource("mekanism:cardboard_box"))
                .addOptional(Location.getResource("create:cardboard"));

        appendPattern(cardboard, "create:cardboard_package_(10x12|10x8|12x10|12x12)");
        appendPattern(cardboard, "create:cardboard_(boots|chestplate|helmet|leggings|sword)");

        tag(MoreTags.Items.MAGIC_ITEMS)
                .addOptional(Location.getResource("apotheosis:potion_charm"));

        tag(MoreTags.Items.FILLED_SACKS)
                .addOptional(Location.getResource("gag:time_sand_pouch"));
    }
}