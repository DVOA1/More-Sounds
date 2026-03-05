package dev.dvoa.moresounds.mixins.AE2Compat;

import appeng.client.gui.AEBaseScreen;
import appeng.menu.AEBaseMenu;
import dev.imb11.sounds.config.SoundsConfig;
import dev.imb11.sounds.config.UISoundsConfig;
import dev.imb11.sounds.dynamic.DynamicSoundHelper;
import dev.imb11.sounds.sound.context.ItemStackSoundContext;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(AEBaseScreen.class)
public abstract class AEScreenCompat<T extends AEBaseMenu> extends AbstractContainerScreen<T> {
    @Unique
    private ItemStack more_Sounds$ae2LastItemStack;

    public AEScreenCompat(T menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
    }

    @Inject(
            method = {"isHovering"},
            at = {@At("RETURN")}
    )
    public void $is_mouse_over_slot(Slot slot, double mouseX, double mouseY, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue() && slot != null) {
            more_Sounds$ae2LastItemStack = slot.getItem();
        }
    }

    @Inject(
            method = {"slotClicked"},
            at = {@At("RETURN")}
    )
    public void $on_slot_clicked(Slot slot, int slotNumber, int mouseButton, ClickType type, CallbackInfo ci) {
        if (slot != null) {
            ItemStack stack;
            if (type != ClickType.QUICK_MOVE) {
                stack = getMenu().getCarried();
                if (stack.isEmpty()) stack = slot.getItem();
            } else {
                stack = more_Sounds$ae2LastItemStack;
            }
            SoundsConfig.get(UISoundsConfig.class).itemClickSoundEffect.playDynamicSound(stack, ItemStackSoundContext.of(DynamicSoundHelper.BlockSoundType.PLACE));
        }
    }
}
