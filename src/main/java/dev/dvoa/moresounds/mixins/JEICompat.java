package dev.dvoa.moresounds.mixins;

import dev.imb11.sounds.config.SoundsConfig;
import dev.imb11.sounds.config.UISoundsConfig;
import dev.imb11.sounds.dynamic.DynamicSoundHelper;
import dev.imb11.sounds.sound.context.ItemStackSoundContext;
import mezz.jei.common.input.IInternalKeyMappings;
import mezz.jei.gui.input.CombinedRecipeFocusSource;
import mezz.jei.gui.input.IClickableIngredientInternal;
import mezz.jei.gui.input.UserInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.stream.Stream;

@Pseudo
@Mixin(CombinedRecipeFocusSource.class)
public abstract class JEICompat {

    @Unique
    private static long more_Sounds$timeLastCall;

    @Inject(
            method = {"getIngredientUnderMouse"},
            at = {@At("RETURN")},
            cancellable = true)
    public void $on_ingredient_called(UserInput input, IInternalKeyMappings keyBindings, CallbackInfoReturnable<Stream<IClickableIngredientInternal<?>>> cir) {
        Stream<IClickableIngredientInternal<?>> internalStream = cir.getReturnValue();
        List<IClickableIngredientInternal<?>> internalList = internalStream.toList();

        boolean canExecuteAgain = System.currentTimeMillis() - more_Sounds$timeLastCall > 150;

        if ((input.is(keyBindings.getLeftClick()) || input.is(keyBindings.getRightClick())) && canExecuteAgain) {
            internalList.forEach(
                    itemStack -> {
                        itemStack.getTypedIngredient().getItemStack().ifPresent(
                                item -> SoundsConfig.get(UISoundsConfig.class).itemClickSoundEffect.playDynamicSound(item, ItemStackSoundContext.of(DynamicSoundHelper.BlockSoundType.PLACE))
                        );
                    }
            );

            more_Sounds$timeLastCall = System.currentTimeMillis();
        }

        cir.setReturnValue(internalList.stream());
    }
}