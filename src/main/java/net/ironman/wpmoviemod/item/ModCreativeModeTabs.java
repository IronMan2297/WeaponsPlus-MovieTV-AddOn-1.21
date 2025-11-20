package net.ironman.wpmoviemod.item;

import net.ironman.wpmoviemod.WPMovieMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WPMovieMod.MOD_ID);

    public static final Supplier<CreativeModeTab> WEAPONSPLUS_ADDON_TAB =
            CREATIVE_MODE_TABS.register("weaponsplus_addon_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.weaponsplus_addon_tab"))
                    .icon(() -> new ItemStack(ModItems.MASTER_SWORD.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MASTER_SWORD);
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
