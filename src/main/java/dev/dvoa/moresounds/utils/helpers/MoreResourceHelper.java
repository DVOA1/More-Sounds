package dev.dvoa.moresounds.utils.helpers;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class MoreResourceHelper {
    public static Map<String, String> fromID(String id) {
        String[] p = id.split(":");
        return Map.of("namespace", p[0], "path", p[1]);
    }

    public static class Keys {
        public static class Items {
            public static ResourceKey<Item> getResourceByID(ResourceLocation resourceLocation) {
                return ResourceKey.create(Registries.ITEM, resourceLocation);
            }

            public static ResourceKey<Item> getResourceByID(String namespace, String path) {
                return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(namespace, path));
            }

            public static ResourceKey<Item> getResourceByID(String id) {
                return ResourceKey.create(Registries.ITEM, Location.getResource(id));
            }
        }

        public static class Blocks {
            public static ResourceKey<Block> getResourceByID(ResourceLocation resourceLocation) {
                return ResourceKey.create(Registries.BLOCK, resourceLocation);
            }

            public static ResourceKey<Block> getResourceByID(String namespace, String path) {
                return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(namespace, path));
            }

            public static ResourceKey<Block> getResourceByID(String id) {
                return ResourceKey.create(Registries.BLOCK, Location.getResource(id));
            }
        }
    }

    public static class Location {

        public static ResourceLocation getResource(Map<String, String> id) {
            return ResourceLocation.fromNamespaceAndPath(id.get("namespace"), id.get("path"));
        }

        public static ResourceLocation getResource(String id) {
            return getResource(fromID(id));
        }

        public static ResourceLocation getResource(String namespace, String path) {
            return ResourceLocation.fromNamespaceAndPath(namespace, path);
        }
    }

}
