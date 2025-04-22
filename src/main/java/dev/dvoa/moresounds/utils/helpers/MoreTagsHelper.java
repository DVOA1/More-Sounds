package dev.dvoa.moresounds.utils.helpers;

import dev.dvoa.moresounds.MoreSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class MoreTagsHelper {
    public static class Blocks {
        public static TagKey<Block> createCustomTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MoreSounds.MOD_ID, name));
        }

        public static TagKey<Block> createTag(String namespace, String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }

        public static TagKey<Block> createTag(Map<String, String> id) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(id.get("namespace"), id.get("path")));
        }

        public static TagKey<Block> createTag(String id) {
            return createTag(MoreResourceHelper.fromID(id));
        }
    }

    public static class Items {
        public static TagKey<Item> createCustomTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MoreSounds.MOD_ID, name));
        }

        public static TagKey<Item> createTag(String namespace, String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }

        public static TagKey<Item> createTag(Map<String, String> id) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id.get("namespace"), id.get("path")));
        }

        public static TagKey<Item> createTag(String id) {
            return createTag(MoreResourceHelper.fromID(id));
        }
    }
}
