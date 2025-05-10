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
        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> bipbip = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.BIPBIP)
                .replace(false)
                .addOptional(Location.getResource("mekanism:robit"))
                .addOptional(Location.getResource("shrink:shrinking_device"))
                .addOptional(Location.getResource("advancedperipherals:colony_integrator"))
                .addOptional(Location.getResource("shrink:shrinking_device"))
                .addOptional(Location.getResource("justdirethings:portalgun"))
                .addOptional(Location.getResource("justdirethings:portalgun_v2"))
                .addOptional(Location.getResource("computercraft:pocket_computer_advanced"))
                .addOptional(Location.getResource("computercraft:pocket_computer_normal"))
                .addOptionalTag(MoreTags.Items.COMPUTERS)
                .addOptional(Location.getResource("mekanism:dosimeter"))
                .addOptional(Location.getResource("mekanism:geiger_counter"));

        appendPattern(bipbip, "buildinggadgets2:gadget_(building|copy_paste|cut_paste|destruction|exchanging)");
        appendPattern(bipbip, "mekanism:(network|seismic)_reader");
        appendPattern(bipbip, "mekanism:mekasuit_(bodyarmor|boots|helmet|pants)");
        appendPattern(bipbip, "mekanism:portable_(qio_dashboard|teleporter)");

        tag(MoreTags.Items.BOATS)
                .addOptional(Location.getResource("sophisticatedstorageinmotion:storage_boat"))
                .addOptionalTag(MoreTags.Items.MINECRAFT_BOATS);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> bott_viscous = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.BOTTLED_VISCOUS)
                .addOptional(Location.getResource("supplementaries:antique_ink"))
                .addOptional(Location.getResource("occultism:purified_ink"))
                .addOptional(Location.getResource("the_bumblezone:royal_jelly_bottle"))
                .addOptional(Location.getResource("gag:pigment_jar"))
                .addOptional(Location.getResource("twilightforest:fiery_blood"))
                .addOptional(Location.getResource("twilightforest:fiery_tears"))
                .addOptional(Location.getResource("relics:blazing_flask"));

        appendPattern(bott_viscous, "irons_spellbooks:(common|epic|legendary|rare|uncommon)_ink");

        tag(MoreTags.Items.GENERIC_WRENCHES)
                .addTag(Tags.Items.TOOLS_WRENCH)
                .addOptionalTag(MoreTags.Items.WRENCHES)
                .addOptional(Location.getResource("advancedperipherals:computer_tool"))
                .remove(Location.getResource("pneumaticcraft:pneumatic_wrench"))
                .remove(Location.getResource("ae2:nether_quartz_wrench"))
                .remove(Location.getResource("ae2:certus_quartz_wrench"));

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> glass = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.GLASS)
                .addTag(Tags.Items.GLASS_BLOCKS)
                .addTag(Tags.Items.GLASS_PANES)
                .addOptional(Location.getResource("ars_nouveau:alchemists_crown"))
                .addOptional(Location.getResource("ars_nouveau:item_detector"))
                .addOptional(Location.getResource("ars_nouveau:jar_of_light"))
                .addOptional(Location.getResource("ars_nouveau:wixie_shards"))
                .addOptional(Location.getResource("ars_nouveau:spell_sensor"))
                .addOptional(Location.getResource("ars_additions:xp_jar"))
                .addOptional(Location.getResource("ars_additions:ender_source_jar"))
                .addOptional(Location.getResource("relics:magic_mirror"));

        appendPattern(glass, "ars_nouveau:(mob|source)_jar");
        appendPattern(glass, "ars_nouveau:potion_(flask|flask_amplify|flask_extend_time)");
        appendPattern(glass, "twilightforest:(glass|ice)_sword");
        appendPattern(glass, "glassential:(dark_ethereal|dark_ethereal_reverse|ethereal|ethereal_reverse|ghostly|glass|light|obsidian|redstone)_door");
        appendPattern(glass, "glassential:(glass_dark_ethereal|glass_dark_ethereal_reverse|glass_ethereal|glass_ethereal_reverse|glass_ghostly|glass_light|glass_redstone)_pane");
        appendPattern(glass, "glassential:(dark_ethereal|dark_ethereal_reverse|ethereal|ethereal_reverse|ghostly|glass|light|obsidian|redstone)_trapdoor");
        appendPattern(glass, "glassential:(obsidian|sandstone|stone)_glass");
        appendPattern(glass, "glassential:(glass|glass_dark)_ethereal");
        appendPattern(glass, "glassential:(glass_dark_ethereal|glass_ethereal)_reverse");
        appendPattern(glass, "glassential:glass_(ghostly|light|redstone|slab)");
        appendPattern(glass, "glassential:(black_glass|blue_glass|brown_glass|cyan_glass|gray_glass|green_glass|light_blue_glass|light_gray_glass|lime_glass|magenta_glass|orange_glass|pink_glass|purple_glass|red_glass|tinted_glass|white_glass|yellow_glass)_(trapdoor|door)");

        tag(MoreTags.Items.INTERFERENCE)
                .addOptional(Location.getResource("mekanism:pellet_antimatter"))
                .addOptional(Location.getResource("mekanism_extras:alloy_spectrum"))
                .addOptional(Location.getResource("mekanism_extras:enriched_spectrum"))
                .addOptional(Location.getResource("modern_industrialization:singularity"))
                .addOptional(Location.getResource("ae2:singularity"))
                .addOptional(Location.getResource("advanced_ae:shattered_singularity"))
                .addOptional(Location.getResource("ae2:quantum_entangled_singularity"));

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> papers = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.PAPERS)
                .addOptionalTag(MoreTags.Items.COMMON_PAPERS)
                .addOptionalTag(MoreTags.Items.SPELLBOOK)
                .add(Keys.Items.getResourceByID("minecraft:filled_map"))
                .add(Keys.Items.getResourceByID("minecraft:map"))
                .addOptional(Location.getResource("irons_spellbooks:scroll"))
                .addOptional(Location.getResource("supplementaries:slice_map"))
                .addOptional(Location.getResource("twilightforest:ore_map"))
                .addOptional(Location.getResource("twilightforest:magic_map"))
                .addOptional(Location.getResource("twilightforest:maze_map"))
                .addOptional(Location.getResource("buildinggadgets2:template"))
                .addOptional(Location.getResource("buildinggadgets2:redprint"))
                .addOptional(Location.getResource("patchouli:guide_book"))
                .addOptional(Location.getResource("ars_nouveau:caster_tome"))
                .addOptional(Location.getResource("ars_nouveau:worn_notebook"))
                .addOptional(Location.getResource("ars_nouveau:annotated_codex"))
                .addOptional(Location.getResource("ars_additions:imbued_spell_parchment"));

        appendPattern(papers, "ars_nouveau:(allow|deny|mimic|scryer|stable_warp|warp)_scroll");
        appendPattern(papers, "ars_nouveau:(apprentice_spell|archmage_spell|creative_spell|novice_spell)_book");
        appendPattern(papers, "ars_additions:(exploration_warp|nexus_warp)_scroll");
        appendPattern(papers, "ars_additions:(ancient_codex|codex|lost_codex)_entry");
        appendPattern(papers, "ars_elemental:(air_caster|anima_caster|earth_caster|fire_caster|manipulation_caster|water_caster)_tome");
        appendPattern(papers, "twilightforest:(alpha_yeti_banner|hydra_banner|knight_phantom_banner|lich_banner|minoshroom_banner|naga_banner|quest_ram_banner|snow_queen_banner|ur_ghast_banner)_pattern");

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
                .addOptionalTag(MoreTags.Items.STORAGE_UPGRADES)
                .addOptionalTag(MoreTags.Items.MAGIC_ARMOR)
                .addOptional(Location.getResource("ars_nouveau:belt_of_unstable_gifts"))
                .addOptional(Location.getResource("ars_nouveau:belt_of_levitation"))
                .addOptional(Location.getResource("ars_nouveau:mundane_belt"))
                .addOptional(Location.getResource("artifacts:aqua_dashers"))
                .addOptional(Location.getResource("artifacts:lucky_scarf"))
                .addOptional(Location.getResource("artifacts:rooted_boots"))
                .addOptional(Location.getResource("artifacts:scarf_of_invisibility"))
                .addOptional(Location.getResource("artifacts:steadfast_spikes"))
                .addOptional(Location.getResource("artifacts:strider_shoes"))
                .addOptional(Location.getResource("artifacts:running_shoes"))
                .addOptional(Location.getResource("artifacts:vampiric_glove"))
                .addOptional(Location.getResource("relics:elytra_booster"))
                .addOptional(Location.getResource("relics:enders_hand"))
                .addOptional(Location.getResource("relics:midnight_robe"))
                .addOptional(Location.getResource("relics:wool_mitten"))
                .addOptional(Location.getResource("relics:rage_glove"));

        appendPattern(leather_things, "sophisticatedbackpacks:(copper|diamond|gold|iron|netherite)_backpack");
        appendPattern(leather_things, "ars_elemental:(air|aqua|earth|fire)_(boots|hat|leggings|robes)");
        appendPattern(leather_things, "twilightforest:(arctic|yeti)_(boots|chestplate|helmet|leggings)");
        appendPattern(leather_things, "irons_spellbooks:(archevoker|cryomancer|cultist|electromancer|priest|pumpkin|pyromancer|shadowwalker|wandering_magician|plagued)_(chestplate|helmet|boots|leggings)");
        appendPattern(leather_things, "artifacts:(anglers|cowboy)_hat");
        appendPattern(leather_things, "relics:(amphibian|springy)_boot");
        appendPattern(leather_things, "relics:(aqua|magma)_walker");
        appendPattern(leather_things, "relics:(hunter|leather)_belt");

        tag(MoreTags.Items.BOWS)
                .addOptionalTag(Tags.Items.TOOLS_BOW)
                .addOptionalTag(Tags.Items.TOOLS_CROSSBOW)
                .addOptional(Location.getResource("cataclysm:cursed_bow"))
                .addOptional(Location.getResource("cataclysm:wrath_of_the_desert"));

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> std_equip = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.STANDARD_EQUIP)
                .addOptionalTag(Tags.Items.TOOLS_SPEAR)
                .addOptionalTag(MoreTags.Items.JUST_HAMMERS)
                .addOptionalTag(MoreTags.Items.RINGS)
                .remove(Location.getResource("minecraft:trident"))
                .addOptional(Location.getResource("twilightforest:block_and_chain"))
                .addOptional(Location.getResource("twilightforest:knightmetal_shield"))
                .addOptional(Location.getResource("twilightforest:naga_leggings"))
                .addOptional(Location.getResource("twilightforest:phantom_helmet"))
                .addOptional(Location.getResource("artifacts:fire_gauntlet"))
                .addOptional(Location.getResource("artifacts:golden_hook"))
                .addOptional(Location.getResource("artifacts:pickaxe_heater"))
                .addOptional(Location.getResource("artifacts:power_glove"))
                .addOptional(Location.getResource("artifacts:universal_attractor"))
                .addOptional(Location.getResource("artifacts:warp_drive"))
                .addOptional(Location.getResource("relics:drowned_belt"))
                .addOptional(Location.getResource("relics:holy_locket"))
                .addOptional(Location.getResource("relics:ice_breaker"));

        appendPattern(std_equip, "mekanismtools:(bronze|lapis_lazuli|osmium|refined_glowstone|refined_obsidian|steel)_(axe|hoe|paxel|pickaxe|shield|shovel|sword|helmet|chestplate|leggings|boots)");
        appendPattern(std_equip, "mekanismtools:(diamond|gold|iron|stone|wood)_paxel");
        appendPattern(std_equip, "deeperdarker:resonarium_(axe|boots|chestplate|helmet|hoe|leggings|pickaxe|shovel|sword)");
        appendPattern(std_equip, "industrialforegoing:infinity_(backpack|drill|hammer|launcher|saw)");
        appendPattern(std_equip, "ars_elemental:(air|anima|base|earth|fire|summon|water)_bangle");
        appendPattern(std_equip, "twilightforest:(fiery|ironwood|knightmetal|steeleaf)_(boots|chestplate|helmet|leggings|sword)");
        appendPattern(std_equip, "twilightforest:(ironwood|steeleaf)_(hoe|shovel)");
        appendPattern(std_equip, "twilightforest:(diamond_minotaur|gold_minotaur|ironwood|knightmetal|steeleaf)_axe");
        appendPattern(std_equip, "twilightforest:(fiery|ironwood|knightmetal|mazebreaker|steeleaf)_pickaxe");
        appendPattern(std_equip, "twilightforest:(naga|phantom)_chestplate");
        appendPattern(std_equip, "artifacts:(flame|shock|thorn)_pendant");
        appendPattern(std_equip, "artifacts:(digging|feral)_claws");
        appendPattern(std_equip, "artifacts:(cross|panic)_necklace");
        appendPattern(std_equip, "artifacts:charm_(of_shrinking|of_sinking)");
        appendPattern(std_equip, "relics:(ice|roller)_skates");
        appendPattern(std_equip, "relics:(jellyfish|reflection)_necklace");

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> neth_equip = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.NETHERITE_EQUIP)
                .addOptionalTag(MoreTags.Items.ADV_ARMOR)
                .addOptionalTag(MoreTags.Items.ADV_TOOLS)
                .addOptional(Location.getResource("cataclysm:blazing_grips"))
                .addOptional(Location.getResource("cataclysm:bulwark_of_the_flame"))
                .addOptional(Location.getResource("cataclysm:monstrous_helm"))
                .addOptional(Location.getResource("cataclysm_spellbooks:abyssal_warlock_mask"))
                .addOptional(Location.getResource("cataclysm:ignitium_elytra_chestplate"))
                .addOptional(Location.getResource("irons_spellbooks:netherite_mage_leggings"))
                .addOptional(Location.getResource("artifacts:withered_bracelet"));

        appendPattern(neth_equip, "cataclysm:(cursium|ignitium)_(boots|chestplate|helmet|leggings)");
        appendPattern(neth_equip, "cataclysm_spellbooks:(abyssal_warlock|cursium_mage|ignis)_(boots|chestplate)");
        appendPattern(neth_equip, "cataclysm_spellbooks:(abyssal_warlock|ignis)_(helmet|leggings)");
        appendPattern(neth_equip, "cataclysm_spellbooks:cursium_(mage_circlet|mage_skirt)");
        appendPattern(neth_equip, "cataclysm_spellbooks:(cursium_mage|ignis_chestplate)_elytra");
        appendPattern(neth_equip, "cataclysm:black_(steel_axe|steel_hoe|steel_pickaxe|steel_shovel|steel_sword|steel_targe)");
        appendPattern(neth_equip, "irons_spellbooks:(netherite_mage|paladin)_chestplate");
        appendPattern(neth_equip, "irons_spellbooks:(netherite_mage|speed)_boots");
        appendPattern(neth_equip, "irons_spellbooks:(netherite_mage|tarnished)_helmet");

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

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> magic_items = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.MAGIC_ITEMS)
                .addOptional(Location.getResource("apotheosis:potion_charm"))
                .addOptional(Location.getResource("apotheosis:gem_fused_slate"))
                .addOptional(Location.getResource("gag:energized_hearthstone"))
                .addOptional(Location.getResource("gag:hearthstone"))
                .addOptional(Location.getResource("twilightforest:charm_of_keeping_3"))
                .addOptional(Location.getResource("twilightforest:tower_key"))
                .addOptional(Location.getResource("irons_spellbooks:divine_pearl"))
                .addOptional(Location.getResource("artifacts:chorus_totem"))
                .addOptional(Location.getResource("relics:phantom_boot"))
                .addOptional(Location.getResource("relics:shadow_glaive"))
                .addOptional(Location.getResource("relics:space_dissector"));

        appendPattern(magic_items, "ars_elemental:(firenando|siren)_charm");
        appendPattern(magic_items, "ars_additions:(dispel_protection|ender_mask|fall_prevention|fire_resistance|golden|night_vision|powdered_snow_walk|sonic_boom_protection|undying|void_protection|water_breathing|wither_protection)_charm");
        appendPattern(magic_items, "ars_nouveau:(alakarkinos|amethyst_golem|bookwyrm|drygmy|starbuncle|whirlisprig|wixie)_charm");
        appendPattern(magic_items, "apotheosis:sigil_of_(enhancement|rebirth|socketing|unnaming|withdrawal)");
        appendPattern(magic_items, "twilightforest:(charm_of_keeping|charm_of_life)_(1|2)");
        appendPattern(magic_items, "twilightforest:magic_(beans|map_focus)");
        appendPattern(magic_items, "irons_spellbooks:(arcane|blood|cooldown|ender|evocation|fire|holy|ice|lightning|nature|protection)_rune");
        appendPattern(magic_items, "irons_spellbooks:(blood_upgrade|cooldown_upgrade|ender_upgrade|evocation_upgrade|fire_upgrade|holy_upgrade|ice_upgrade|lightning_upgrade|mana_upgrade|nature_upgrade|protection_upgrade|upgrade)_orb");

        tag(MoreTags.Items.FILLED_SACKS)
                .addOptional(Location.getResource("gag:time_sand_pouch"))
                .addOptional(Location.getResource("twilightforest:transformation_powder"))
                .addOptional(Location.getResource("relics:spore_sack"));

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> filled_bottles = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.FILLED_BOTTLES)
                .addOptional(Location.getResource("the_bumblezone:sugar_water_bottle"))
                .addOptional(Location.getResource("twilightforest:brittle_potion_flask"))
                .addOptional(Location.getResource("twilightforest:greater_potion_flask"))
                .addOptional(Location.getResource("irons_spellbooks:fire_ale"))
                .addOptional(Location.getResource("irons_spellbooks:greater_healing_potion"))
                .addOptional(Location.getResource("irons_spellbooks:lightning_bottle"))
                .addOptional(Location.getResource("irons_spellbooks:netherward_tincture"))
                .addOptional(Location.getResource("irons_spellbooks:timeless_slurry"))
                .addOptional(Location.getResource("artifacts:antidote_vessel"))
                .addOptional(Location.getResource("artifacts:cloud_in_a_bottle"));

        appendPattern(filled_bottles, "irons_spellbooks:(evasion|greater_evasion|greater_invisibility|greater_oakskin|invisibility|oakskin)_elixir");
        appendPattern(filled_bottles, "artifacts:(novelty_drinking|plastic_drinking)_hat");

        IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> crystals = (IntrinsicTagAppender<Item>) tag(MoreTags.Items.CRYSTALS)
                .addOptional(Location.getResource("apotheosis:gem"))
                .addOptionalTag(MoreTags.Items.AE2_WRENCHES)
                .addOptional(Location.getResource("ars_nouveau:dull_trinket"))
                .addOptional(Location.getResource("ars_nouveau:magelight_torch"))
                .addOptional(Location.getResource("ars_nouveau:relay"))
                .addOptional(Location.getResource("ars_nouveau:scryers_oculus"))
                .addOptional(Location.getResource("ars_nouveau:source_gem"))
                .addOptional(Location.getResource("ars_nouveau:starbuncle_shards"))
                .addOptional(Location.getResource("ars_elemental:mark_of_mastery"))
                .addOptional(Location.getResource("twilightforest:carminite"))
                .addOptional(Location.getResource("artifacts:crystal_heart"));

        appendPattern(crystals, "apotheosis:(common|epic|mythic|rare|uncommon)_material");
        appendPattern(crystals, "ars_nouveau:(amplify|pierce|split)_arrow");
        appendPattern(crystals, "ars_nouveau:(abjuration|air|conjuration|earth|fire|manipulation|water)_essence");
        appendPattern(crystals, "ars_nouveau:(basic_spell|rotating_spell|spell|timer_spell)_turret");
        appendPattern(crystals, "ars_nouveau:(lingering_flask|splash_flask)_cannon");
        appendPattern(crystals, "ars_nouveau:(shapers|summon)_focus");
        appendPattern(crystals, "ars_nouveau:enchanters_(eye|fishing_rod|gauntlet|mirror|shield|sword)");
        appendPattern(crystals, "ars_nouveau:relay_(collector|deposit|splitter|warp)");
        appendPattern(crystals, "ars_nouveau:amulet_of_(mana_boost|mana_regen)");
        appendPattern(crystals, "ars_elemental:(air|earth|fire|manipulation|water)_turret");
        appendPattern(crystals, "ars_elemental:(acceleration_prism|arc_prism|chaining_prism|deceleration_prism|homing_prism|piercing_prism)_lens");
        appendPattern(crystals, "ars_elemental:(air|earth|fire|lesser_air|lesser_earth|lesser_fire|lesser_water|necrotic|water)_focus");
        appendPattern(crystals, "reliquified_twilight_forest:(absorption|frost|necromancy|shielding|twilight)_gem");

        tag(MoreTags.Items.DUSTS)
                .addOptionalTag(Tags.Items.DUSTS)
                .addOptionalTag(MoreTags.Items.DIRTY_DUSTS)
                .addOptional(Location.getResource("gag:sacred_salt"))
                .addOptional(Location.getResource("apotheosis:gem_dust"))
                .addOptional(Location.getResource("twilightforest:armor_shard_cluster"))
                .addOptional(Location.getResource("twilightforest:borer_essence"))
                .addOptional(Location.getResource("twilightforest:exanimate_essence"));
    }
}