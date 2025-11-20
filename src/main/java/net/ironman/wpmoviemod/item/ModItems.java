package net.ironman.wpmoviemod.item;

import net.ironman.weaponsplusmod.item.ModToolTiers;
import net.ironman.wpmoviemod.WPMovieMod;
import net.ironman.wpmoviemod.item.custom.MasterSwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WPMovieMod.MOD_ID);

    public static final DeferredItem<Item> MASTER_SWORD = ITEMS.register("master_sword",
            () -> new MasterSwordItem(ModToolTiers.ENDERITE,
                    new Item.Properties().rarity(Rarity.EPIC).attributes(MasterSwordItem.createAttributes(ModToolTiers.HELL, 4, -2.4f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
