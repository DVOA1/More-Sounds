package dev.dvoa.moresounds.datagen.providers;

import dev.dvoa.moresounds.datagen.codecs.SoundAction;
import dev.dvoa.moresounds.utils.SoundActionHolder;
import dev.dvoa.moresounds.utils.helpers.MoreResourceHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MoreSoundActions {
    public static List<Map<String, Object>> customSounds = List.of(
            Map.of("type", "items", "name", "bipbip", "keys", List.of("#more_sounds:bipbip"), "sound", "more_sounds:item.bipbip", "volume", 0.1),
            Map.of("type", "items", "name", "generic_wrenches", "keys", List.of("#more_sounds:generic_wrenches"), "sound", "minecraft:item.armor.equip_iron"),
            Map.of("type", "items", "name", "quartz_wrenches", "keys", List.of("#ae2:quartz_wrench"), "sound", "minecraft:block.amethyst_cluster.hit"),
            Map.of("type", "items", "name", "pneumatic_wrench", "keys", List.of("pneumaticcraft:pneumatic_wrench"), "sound", "more_sounds:item.small_motor"),
            Map.of("type", "items", "name", "more_dusts", "keys", List.of("#c:dusts", "#mekanism:dirty_dusts"), "sound", "minecraft:block.gravel.hit"),
            Map.of("type", "items", "name", "more_glass", "keys", List.of("#more_sounds:glass"), "sound", "sounds:block.glass.place"),
            Map.of("type", "items", "name", "more_fishes", "keys", List.of("#c:foods/raw_fish"), "sound", "minecraft:entity.puffer_fish.flop", "pitch", 1.8),
            Map.of("type", "items", "name", "fwomp", "keys", List.of("create:potato_cannon"), "sound", "create:fwoomp"),
            Map.of("type", "items", "name", "more_plates", "keys", List.of("#more_sounds:plates"), "sound", "sounds:block.copper_ore.place"),
            Map.of("type", "items", "name", "more_netherite", "keys", List.of("#more_sounds:netherite_equip"), "sound", "minecraft:item.armor.equip_netherite"),
            Map.of("type", "items", "name", "apoth_gems", "keys", List.of("apotheosis:gem"), "sound", "minecraft:block.amethyst_cluster.hit"),
            Map.of("type", "items", "name", "more_bows", "keys", List.of("#more_sounds:bows"), "sound", "minecraft:entity.arrow.shoot"),
            Map.of("type", "items", "name", "bee_armor", "keys", List.of("#the_bumblezone:armors/all"), "sound", "minecraft:entity.bee.pollinate"),
            Map.of("type", "items", "name", "more_boats", "keys", List.of("#more_sounds:boats"), "sound", "minecraft:block.wood.hit"),
            Map.of("type", "items", "name", "soph_minecarts", "keys", List.of("sophisticatedstorageinmotion:storage_minecart"), "sound", "more_sounds:item.metal.box_empty", "volume", 0.1, "pitch", 1.0),
            Map.of("type", "items", "name", "interference", "keys", List.of("#more_sounds:interference"), "sound", "more_sounds:item.interference", "volume", 0.3),
            Map.of("type", "items", "name", "bottled_ink", "keys", List.of("#more_sounds:bottled_viscous"), "sound", "more_sounds:item.bottled_viscous.slosh", "volume", 0.2, "pitch", 1.5),
            Map.of("type", "items", "name", "more_papers", "keys", List.of("#more_sounds:papers"), "sound", "minecraft:item.book.page_turn"),
            Map.of("type", "items", "name", "leather_things", "keys", List.of("#more_sounds:leather_things"), "sound", "minecraft:item.armor.equip_leather"),
            Map.of("type", "items", "name", "more_equipment", "keys", List.of("#more_sounds:equipment"), "sound", "minecraft:item.armor.equip_iron"),
            Map.of("type", "items", "name", "sculk_equipment", "keys", List.of("#more_sounds:sculk_equip"), "sound", "minecraft:block.sculk_vein.fall"),
            Map.of("type", "items", "name", "cardboard_items", "keys", List.of("#more_sounds:cardboard"), "sound", "more_sounds:item.cardboard.box", "volume", 0.1, "pitch", 1.8),
            Map.of("type", "items", "name", "magic_items", "keys", List.of("#more_sounds:magic_items"), "sound", "more_sounds:item.magic", "volume", 0.2),
            Map.of("type", "items", "name", "filled_sacks", "keys", List.of("#more_sounds:filled_sacks"), "sound", "more_sounds:item.filled_sack"),
            Map.of("type", "items", "name", "more_bottles", "keys", List.of("#more_sounds:filled_bottles"), "sound", "minecraft:item.bottle.fill"),
            Map.of("type", "screens", "name", "backpack_screen", "keys", List.of("sophisticatedbackpacks:backpack"), "sound", "more_sounds:screen.zip", "pitch", 1.5)
    );

    @SuppressWarnings("unchecked")
    public static List<SoundActionHolder> getCustomSounds() {
        List<SoundActionHolder> output = new ArrayList<>(List.of());
        for (Map<String, Object> entry : customSounds) {

            output.add(new SoundActionHolder((String) entry.get("name"),
                            new SoundAction(
                                    (List<String>) entry.get("keys"),
                                    MoreResourceHelper.Location.getResource((String) entry.get("sound")),
                                    (Double) entry.getOrDefault("pitch", 2.0),
                                    (Double) entry.getOrDefault("volume", 1.0)
                            ),
                            (String) entry.get("type")
                    )
            );
        }
        return output;
    }
}
