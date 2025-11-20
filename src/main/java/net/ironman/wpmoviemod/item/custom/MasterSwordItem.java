package net.ironman.wpmoviemod.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class MasterSwordItem extends SwordItem {
    public MasterSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip.wpmoviemod.master_sword"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip.wpmoviemod.shift_down"));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
