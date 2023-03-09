package net.mostafa.sculkinfection.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mostafa.sculkinfection.sculkinfection;

@Mod.EventBusSubscriber(modid = sculkinfection.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCreativeModeTabs {
    public static CreativeModeTab SCULKINFECTION_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
SCULKINFECTION_TAB = event.registerCreativeModeTab(new ResourceLocation(sculkinfection.MOD_ID,"sculkinfection_tab"),
        builder -> builder.icon(() -> new ItemStack(ModItems.WHITEDIAMOND.get()))
                .title(Component.translatable("creativemodetab.sculkinfection_tab")));
    }
}
