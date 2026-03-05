package dev.dvoa.moresounds.mixins.AE2Compat;

import appeng.client.gui.AEBaseScreen;
import appeng.client.gui.me.common.MEStorageScreen;
import appeng.client.gui.style.ScreenStyle;
import appeng.client.gui.widgets.ISortSource;
import appeng.menu.me.common.MEStorageMenu;
import dev.imb11.sounds.config.SoundsConfig;
import dev.imb11.sounds.config.UISoundsConfig;
import dev.imb11.sounds.dynamic.DynamicSoundHelper;
import dev.imb11.sounds.sound.context.ItemStackSoundContext;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(MEStorageScreen.class)
public abstract class MEScreenCompat<C extends MEStorageMenu>
        extends AEBaseScreen<C> implements ISortSource {

    public MEScreenCompat(C menu, Inventory playerInventory, Component title, ScreenStyle style) {
        super(menu, playerInventory, title, style);
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
                stack = ItemStack.EMPTY;
            }
            SoundsConfig.get(UISoundsConfig.class).itemClickSoundEffect.playDynamicSound(stack, ItemStackSoundContext.of(DynamicSoundHelper.BlockSoundType.PLACE));
        }
    }
}
