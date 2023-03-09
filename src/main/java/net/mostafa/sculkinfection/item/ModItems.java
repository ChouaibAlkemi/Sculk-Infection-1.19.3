package net.mostafa.sculkinfection.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mostafa.sculkinfection.sculkinfection;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, sculkinfection.MOD_ID);
    public static final RegistryObject<Item> WHITEDIAMOND = ITEMS.register("whitediamond",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> RAW_WHITEDIAMOND = ITEMS.register("raw_whitediamond",
            () -> new Item(new Properties()));
    public static final RegistryObject<SwordItem> THEROYAL_SWORD = ITEMS.register("theroyal_sword",
            () -> new SwordItem(ModTiers.WHITEDIAMOND,2,3f, new Item.Properties()));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
