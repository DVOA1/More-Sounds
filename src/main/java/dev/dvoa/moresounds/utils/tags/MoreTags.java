package dev.dvoa.moresounds.utils.tags;

import dev.dvoa.moresounds.utils.helpers.MoreTagsHelper;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MoreTags {
    public static class Blocks {
    }

    public static class Items {
        // ComputerCraft tags
        public static final TagKey<Item> COMPUTERS = MoreTagsHelper.Items.createTag("computercraft:computer");

        // Just Hammers Tags
        public static final TagKey<Item> JUST_HAMMERS = MoreTagsHelper.Items.createTag("justhammers:hammer");

        // Sophisticated Things Tags
        public static final TagKey<Item> STORAGE_UPGRADES = MoreTagsHelper.Items.createTag("sophisticatedstorage:upgrade");
        public static final TagKey<Item> BACKPACK_UPGRADES = MoreTagsHelper.Items.createTag("sophisticatedbackpacks:upgrade");

        // Advanced Netherite Tags
        public static final TagKey<Item> ADV_ARMOR = MoreTagsHelper.Items.createTag("advancednetherite:tier/armor");
        public static final TagKey<Item> ADV_TOOLS = MoreTagsHelper.Items.createTag("advancednetherite:tier/tools");

        // Curios Tags
        public static final TagKey<Item> RINGS = MoreTagsHelper.Items.createTag("curios:ring");
        public static final TagKey<Item> SPELLBOOK = MoreTagsHelper.Items.createTag("curios:spellbook");

        // AE2 Tags
        public static final TagKey<Item> AE2_WRENCHES = MoreTagsHelper.Items.createTag("ae2:quartz_wrench");
        public static final TagKey<Item> AE2_PAINTBALL = MoreTagsHelper.Items.createTag("ae2:paint_balls");
        public static final TagKey<Item> AE2_LUMEN_PAINTBALL = MoreTagsHelper.Items.createTag("ae2:lumen_paint_balls");
        public static final TagKey<Item> AE2_GLASS_CABLE = MoreTagsHelper.Items.createTag("ae2:glass_cable");
        public static final TagKey<Item> AE2_COVERED_CABLE = MoreTagsHelper.Items.createTag("ae2:covered_cable");
        public static final TagKey<Item> AE2_SMART_CABLE = MoreTagsHelper.Items.createTag("ae2:smart_cable");
        public static final TagKey<Item> AE2_DENSE_CABLE = MoreTagsHelper.Items.createTag("ae2:covered_dense_cable");
        public static final TagKey<Item> AE2_DENSE_SMART = MoreTagsHelper.Items.createTag("ae2:smart_dense_cable");

        // Mekanism Tags
        public static final TagKey<Item> DIRTY_DUSTS = MoreTagsHelper.Items.createTag("mekanism:dirty_dusts");

        // Ars Nouveau Tags
        public static final TagKey<Item> MAGIC_ARMOR = MoreTagsHelper.Items.createTag("ars_nouveau:magic_armor");

        // Modern Industrializzation Tags
        public static final TagKey<Item> MI_FLUID_PIPES = MoreTagsHelper.Items.createTag("modern_industrialization:fluid_pipes");

        // Common Tags
        public static final TagKey<Item> WRENCHES = MoreTagsHelper.Items.createTag("c:wrenches");
        public static final TagKey<Item> COMMON_PAPERS = MoreTagsHelper.Items.createTag("c:paper");
        public static final TagKey<Item> COMMON_METAL_PLATES = MoreTagsHelper.Items.createTag("c:plates");
        public static final TagKey<Item> COMMON_BOOKS = MoreTagsHelper.Items.createTag("c:books");

        // Minecraft Tags
        public static final TagKey<Item> MINECRAFT_BOATS = MoreTagsHelper.Items.createTag("minecraft:boats");
        public static final TagKey<Item> MINECRAFT_CRYSTAL = MoreTagsHelper.Items.createTag("minecraft:crystal_sound_blocks");
        public static final TagKey<Item> MINECRAFT_BOOKSHELF_BOOKS = MoreTagsHelper.Items.createTag("minecraft:bookshelf_books");

        // Custom tags
        public static final TagKey<Item> BIPBIP = MoreTagsHelper.Items.createCustomTag("bipbip");
        public static final TagKey<Item> BOATS = MoreTagsHelper.Items.createCustomTag("boats");
        public static final TagKey<Item> BOTTLED_VISCOUS = MoreTagsHelper.Items.createCustomTag("bottled_viscous");
        public static final TagKey<Item> GENERIC_WRENCHES = MoreTagsHelper.Items.createCustomTag("generic_wrenches");
        public static final TagKey<Item> GLASS = MoreTagsHelper.Items.createCustomTag("glass");
        public static final TagKey<Item> INTERFERENCE = MoreTagsHelper.Items.createCustomTag("interference");
        public static final TagKey<Item> PAPERS = MoreTagsHelper.Items.createCustomTag("papers");
        public static final TagKey<Item> CARDBOARD = MoreTagsHelper.Items.createCustomTag("cardboard");
        public static final TagKey<Item> METAL_PLATES = MoreTagsHelper.Items.createCustomTag("plates");
        public static final TagKey<Item> LEATHER_THINGS = MoreTagsHelper.Items.createCustomTag("leather_things");
        public static final TagKey<Item> BOWS = MoreTagsHelper.Items.createCustomTag("bows");
        public static final TagKey<Item> NETHERITE_EQUIP = MoreTagsHelper.Items.createCustomTag("netherite_equip");
        public static final TagKey<Item> SCULK_EQUIP = MoreTagsHelper.Items.createCustomTag("sculk_equip");
        public static final TagKey<Item> STANDARD_EQUIP = MoreTagsHelper.Items.createCustomTag("equipment");
        public static final TagKey<Item> MAGIC_ITEMS = MoreTagsHelper.Items.createCustomTag("magic_items");
        public static final TagKey<Item> FILLED_SACKS = MoreTagsHelper.Items.createCustomTag("filled_sacks");
        public static final TagKey<Item> FILLED_BOTTLES = MoreTagsHelper.Items.createCustomTag("filled_bottles");
        public static final TagKey<Item> CRYSTALS = MoreTagsHelper.Items.createCustomTag("crystal");
        public static final TagKey<Item> CRYSTAL_BLOCKS = MoreTagsHelper.Items.createCustomTag("crystal_block");
        public static final TagKey<Item> DUSTS = MoreTagsHelper.Items.createCustomTag("dust");
        public static final TagKey<Item> FOOD = MoreTagsHelper.Items.createCustomTag("food");
        public static final TagKey<Item> WET = MoreTagsHelper.Items.createCustomTag("wet");
        public static final TagKey<Item> DIAM_EQUIP = MoreTagsHelper.Items.createCustomTag("diamond_equip");
        public static final TagKey<Item> WOOD_STUFF = MoreTagsHelper.Items.createCustomTag("wooden");
        public static final TagKey<Item> FILLED_BUCKETS = MoreTagsHelper.Items.createCustomTag("bucket");
        public static final TagKey<Item> CABLES_ELECTRIC = MoreTagsHelper.Items.createCustomTag("cables_electric");
        public static final TagKey<Item> CABLES_FLUID = MoreTagsHelper.Items.createCustomTag("cables_fluid");
        public static final TagKey<Item> CABLES_GAS = MoreTagsHelper.Items.createCustomTag("cables_gas");
        public static final TagKey<Item> BRICKS = MoreTagsHelper.Items.createCustomTag("bricks");
        public static final TagKey<Item> METAL_BLOCKS = MoreTagsHelper.Items.createCustomTag("metal_blocks");
    }
}
