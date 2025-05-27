package dev.dvoa.moresounds.mixins.jeicompat;

import dev.imb11.sounds.config.SoundsConfig;
import dev.imb11.sounds.config.UISoundsConfig;
import dev.imb11.sounds.dynamic.DynamicSoundHelper;
import dev.imb11.sounds.sound.context.ItemStackSoundContext;
import mezz.jei.api.gui.inputs.RecipeSlotUnderMouse;
import mezz.jei.gui.input.IClickableIngredientInternal;
import mezz.jei.gui.recipes.RecipeGuiLayouts;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

@Pseudo
@Mixin(RecipeGuiLayouts.class)
public class RecipesScreen {
    @Unique
    private static boolean more_Sounds$hasClicked = false;

    @Inject(
            method = "getClickedIngredient",
            at = {@At("RETURN")}
    )
    private static void $on_ingredient_click(RecipeSlotUnderMouse slotUnderMouse, CallbackInfoReturnable<Optional<IClickableIngredientInternal<?>>> cir) {
        if (!more_Sounds$hasClicked) {
            cir.getReturnValue().flatMap(
                    r -> r.getTypedIngredient().getItemStack()).ifPresent(
                    itemStack -> SoundsConfig.get(UISoundsConfig.class).itemClickSoundEffect.playDynamicSound(itemStack, ItemStackSoundContext.of(DynamicSoundHelper.BlockSoundType.PLACE))
            );
            more_Sounds$hasClicked = true;

            // Reset the flag after a short delay
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    more_Sounds$hasClicked = false;
                }
            }, 100); // Adjust delay as needed
        }
    }
}
