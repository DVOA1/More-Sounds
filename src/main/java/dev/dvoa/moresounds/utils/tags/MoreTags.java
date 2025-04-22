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

        // Common Tags
        public static final TagKey<Item> WRENCHES = MoreTagsHelper.Items.createTag("c:wrenches");
        public static final TagKey<Item> COMMON_PAPERS = MoreTagsHelper.Items.createTag("c:paper");
        public static final TagKey<Item> COMMON_METAL_PLATES = MoreTagsHelper.Items.createTag("c:plate");

        // Custom tags
        public static final TagKey<Item> BIPBIP = MoreTagsHelper.Items.createCustomTag("bipbip");
        public static final TagKey<Item> BOATS = MoreTagsHelper.Items.createCustomTag("boats");
        public static final TagKey<Item> BOTTLED_INKS = MoreTagsHelper.Items.createCustomTag("bottled_inks");
        public static final TagKey<Item> GENERIC_WRENCHES = MoreTagsHelper.Items.createCustomTag("generic_wrenches");
        public static final TagKey<Item> GLASS = MoreTagsHelper.Items.createCustomTag("glass");
        public static final TagKey<Item> INTERFERENCE = MoreTagsHelper.Items.createCustomTag("interference");
        public static final TagKey<Item> PAPERS = MoreTagsHelper.Items.createCustomTag("papers");
        public static final TagKey<Item> METAL_PLATES = MoreTagsHelper.Items.createCustomTag("plates");
    }
}
