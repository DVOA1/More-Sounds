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
                .addOptional(Location.getResource("computercraft:pocket_computer_advanced"))
                .addOptional(Location.getResource("computercraft:pocket_computer_normal"))
                .addOptionalTag(MoreTags.Items.COMPUTERS);

        tag(MoreTags.Items.BOATS)
                .addOptional(Location.getResource("sophisticatedstorageinmotion:storage_boat"))
                .addOptionalTag(MoreTags.Items.MINECRAFT_BOATS);

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

        tag(MoreTags.Items.LEATHER_THINGS)
                .addOptional(Location.getResource("sophisticatedbackpacks:backpack"))
                .addOptional(Location.getResource("sophisticatedbackpacks:copper_backpack"))
                .addOptional(Location.getResource("sophisticatedbackpacks:iron_backpack"))
                .addOptional(Location.getResource("sophisticatedbackpacks:gold_backpack"))
                .addOptional(Location.getResource("sophisticatedbackpacks:diamond_backpack"))
                .addOptional(Location.getResource("sophisticatedbackpacks:netherite_backpack"))
                .addOptionalTag(MoreTags.Items.BACKPACK_UPGRADES)
                .addOptionalTag(MoreTags.Items.STORAGE_UPGRADES);

        tag(MoreTags.Items.BOWS)
                .addOptionalTag(Tags.Items.TOOLS_BOW)
                .addOptionalTag(Tags.Items.TOOLS_CROSSBOW);

        tag(MoreTags.Items.STANDARD_EQUIP)
                .addOptional(Location.getResource("mekanismtools:bronze_pickaxe"))
                .addOptional(Location.getResource("mekanismtools:bronze_axe"))
                .addOptional(Location.getResource("mekanismtools:bronze_shovel"))
                .addOptional(Location.getResource("mekanismtools:bronze_hoe"))
                .addOptional(Location.getResource("mekanismtools:bronze_sword"))
                .addOptional(Location.getResource("mekanismtools:bronze_paxel"))
                .addOptional(Location.getResource("mekanismtools:bronze_shield"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_pickaxe"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_axe"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_shovel"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_hoe"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_sword"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_paxel"))
                .addOptional(Location.getResource("mekanismtools:lapis_lazuli_shield"))
                .addOptional(Location.getResource("mekanismtools:osmium_pickaxe"))
                .addOptional(Location.getResource("mekanismtools:osmium_axe"))
                .addOptional(Location.getResource("mekanismtools:osmium_shovel"))
                .addOptional(Location.getResource("mekanismtools:osmium_hoe"))
                .addOptional(Location.getResource("mekanismtools:osmium_sword"))
                .addOptional(Location.getResource("mekanismtools:osmium_paxel"))
                .addOptional(Location.getResource("mekanismtools:osmium_shield"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_pickaxe"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_axe"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_shovel"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_hoe"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_sword"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_paxel"))
                .addOptional(Location.getResource("mekanismtools:refined_glowstone_shield"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_pickaxe"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_axe"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_shovel"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_hoe"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_sword"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_paxel"))
                .addOptional(Location.getResource("mekanismtools:refined_obsidian_shield"))
                .addOptional(Location.getResource("mekanismtools:steel_pickaxe"))
                .addOptional(Location.getResource("mekanismtools:steel_axe"))
                .addOptional(Location.getResource("mekanismtools:steel_shovel"))
                .addOptional(Location.getResource("mekanismtools:steel_hoe"))
                .addOptional(Location.getResource("mekanismtools:steel_sword"))
                .addOptional(Location.getResource("mekanismtools:steel_paxel"))
                .addOptional(Location.getResource("mekanismtools:steel_shield"))
                .addOptional(Location.getResource("mekanismtools:wood_paxel"))
                .addOptional(Location.getResource("mekanismtools:stone_paxel"))
                .addOptional(Location.getResource("mekanismtools:iron_paxel"))
                .addOptional(Location.getResource("mekanismtools:gold_paxel"))
                .addOptional(Location.getResource("mekanismtools:diamond_paxel"))
                .addOptional(Location.getResource("mekanismtools:netherite_paxel"))
                .addOptional(Location.getResource("deeperdarker:resonarium_pickaxe"))
                .addOptional(Location.getResource("deeperdarker:resonarium_axe"))
                .addOptional(Location.getResource("deeperdarker:resonarium_shovel"))
                .addOptional(Location.getResource("deeperdarker:resonarium_hoe"))
                .addOptional(Location.getResource("deeperdarker:resonarium_sword"))
                .addOptional(Location.getResource("deeperdarker:resonarium_helmet"))
                .addOptional(Location.getResource("deeperdarker:resonarium_leggings"))
                .addOptional(Location.getResource("deeperdarker:resonarium_chestplate"))
                .addOptional(Location.getResource("deeperdarker:resonarium_boots"))
                .addOptionalTag(Tags.Items.TOOLS_SPEAR)
                .remove(Location.getResource("minecraft:trident"))
                .addOptionalTag(MoreTags.Items.JUST_HAMMERS)
                .addOptional(Location.getResource("industrialforegoing:infinity_drill"))
                .addOptional(Location.getResource("industrialforegoing:infinity_saw"))
                .addOptional(Location.getResource("industrialforegoing:infinity_hammer"))
                .addOptional(Location.getResource("industrialforegoing:infinity_backpack"))
                .addOptional(Location.getResource("industrialforegoing:infinity_launcher"));

        tag(MoreTags.Items.NETHERITE_EQUIP)
                .addOptionalTag(MoreTags.Items.ADV_ARMOR)
                .addOptionalTag(MoreTags.Items.ADV_TOOLS);

        tag(MoreTags.Items.SCULK_EQUIP)
                .addOptional(Location.getResource("deeperdarker:warden_pickaxe"))
                .addOptional(Location.getResource("deeperdarker:warden_axe"))
                .addOptional(Location.getResource("deeperdarker:warden_shovel"))
                .addOptional(Location.getResource("deeperdarker:warden_hoe"))
                .addOptional(Location.getResource("deeperdarker:warden_sword"))
                .addOptional(Location.getResource("deeperdarker:warden_helmet"))
                .addOptional(Location.getResource("deeperdarker:warden_leggings"))
                .addOptional(Location.getResource("deeperdarker:warden_chestplate"))
                .addOptional(Location.getResource("deeperdarker:warden_boots"))
                .addOptional(Location.getResource("deeperdarker:reinforced_echo_shard"))
                .addOptional(Location.getResource("deeperdarker:warden_carapace"))
                .addOptional(Location.getResource("deeperdarker:heart_of_the_deep"));
    }
}