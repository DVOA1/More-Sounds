package dev.dvoa.moresounds.mixins;

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
import net.p3pp3rf1y.sophisticatedcore.client.gui.StorageScreenBase;
import net.p3pp3rf1y.sophisticatedcore.common.gui.StorageContainerMenuBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(StorageScreenBase.class)
public abstract class SophCoreCompat<S extends StorageContainerMenuBase<?>> extends AbstractContainerScreen<S> {
    @Unique
    private ItemStack more_Sounds$lastItemStack;

    public SophCoreCompat(S menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
    }

    @Inject(
            method = {"isHovering"},
            at = {@At("RETURN")}
    )
    public void $is_mouse_ov_slo(Slot slot, double mouseX, double mouseY, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue() && slot != null) {
            more_Sounds$lastItemStack = slot.getItem();
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
                stack = more_Sounds$lastItemStack;
            }
            SoundsConfig.get(UISoundsConfig.class).itemClickSoundEffect.playDynamicSound(stack, ItemStackSoundContext.of(DynamicSoundHelper.BlockSoundType.PLACE));
        }
    }
}