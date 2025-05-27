package dev.dvoa.moresounds.mixins.jeicompat;

import dev.imb11.sounds.config.SoundsConfig;
import dev.imb11.sounds.config.UISoundsConfig;
import dev.imb11.sounds.dynamic.DynamicSoundHelper;
import dev.imb11.sounds.sound.context.ItemStackSoundContext;
import mezz.jei.gui.ghost.GhostIngredientDragManager;
import mezz.jei.gui.input.IDraggableIngredientInternal;
import mezz.jei.gui.input.UserInput;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(GhostIngredientDragManager.class)
public class SideBar {
    @Inject(
            method = "handleClickGhostIngredient",
            at = {@At("RETURN")}
    )
    public <T extends Screen, V> void $on_ghost_click(T currentScreen, IDraggableIngredientInternal<V> clicked, UserInput input, CallbackInfoReturnable<Boolean> cir) {
        clicked.getTypedIngredient().getItemStack()
                .ifPresent(
                        itemStack -> SoundsConfig.get(UISoundsConfig.class).itemClickSoundEffect.playDynamicSound(itemStack, ItemStackSoundContext.of(DynamicSoundHelper.BlockSoundType.PLACE))
                );
    }
}
