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

        // Common Tags
        public static final TagKey<Item> WRENCHES = MoreTagsHelper.Items.createTag("c:wrenches");
        public static final TagKey<Item> COMMON_PAPERS = MoreTagsHelper.Items.createTag("c:paper");
        public static final TagKey<Item> COMMON_METAL_PLATES = MoreTagsHelper.Items.createTag("c:plate");

        // Minecraft Tags
        public static final TagKey<Item> MINECRAFT_BOATS = MoreTagsHelper.Items.createTag("minecraft:boats");

        // Custom tags
        public static final TagKey<Item> BIPBIP = MoreTagsHelper.Items.createCustomTag("bipbip");
        public static final TagKey<Item> BOATS = MoreTagsHelper.Items.createCustomTag("boats");
        public static final TagKey<Item> BOTTLED_INKS = MoreTagsHelper.Items.createCustomTag("bottled_inks");
        public static final TagKey<Item> GENERIC_WRENCHES = MoreTagsHelper.Items.createCustomTag("generic_wrenches");
        public static final TagKey<Item> GLASS = MoreTagsHelper.Items.createCustomTag("glass");
        public static final TagKey<Item> INTERFERENCE = MoreTagsHelper.Items.createCustomTag("interference");
        public static final TagKey<Item> PAPERS = MoreTagsHelper.Items.createCustomTag("papers");
        public static final TagKey<Item> METAL_PLATES = MoreTagsHelper.Items.createCustomTag("plates");
        public static final TagKey<Item> LEATHER_THINGS = MoreTagsHelper.Items.createCustomTag("leather_things");
        public static final TagKey<Item> BOWS = MoreTagsHelper.Items.createCustomTag("bows");
        public static final TagKey<Item> NETHERITE_EQUIP = MoreTagsHelper.Items.createCustomTag("netherite_equip");
        public static final TagKey<Item> SCULK_EQUIP = MoreTagsHelper.Items.createCustomTag("sculk_equip");
        public static final TagKey<Item> STANDARD_EQUIP = MoreTagsHelper.Items.createCustomTag("equipment");
    }
}
