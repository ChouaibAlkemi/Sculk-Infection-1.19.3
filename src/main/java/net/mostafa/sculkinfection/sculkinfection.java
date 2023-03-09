package net.mostafa.sculkinfection;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mostafa.sculkinfection.block.ModBlocks;
import net.mostafa.sculkinfection.item.ModCreativeModeTabs;
import net.mostafa.sculkinfection.item.ModItems;
import org.slf4j.Logger;

@Mod(sculkinfection.MOD_ID)
public class sculkinfection
{
    public static final String MOD_ID = "sculkinfection";
    private static final Logger LOGGER = LogUtils.getLogger();

    public sculkinfection()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == ModCreativeModeTabs.SCULKINFECTION_TAB) {
            event.accept(ModItems.WHITEDIAMOND);
            event.accept(ModItems.RAW_WHITEDIAMOND);
            event.accept(ModItems.THEROYAL_SWORD);
            event.accept(ModBlocks.WHITEDIAMOND_BLOCK);
            event.accept(ModBlocks.WHITEDIAMOND_ORE);
            event.accept(ModBlocks.DEEPSLATE_WHITEDIAMOND_ORE);


        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {

            event.accept(ModBlocks.WHITEDIAMOND_BLOCK);
            event.accept(ModBlocks.WHITEDIAMOND_ORE);
            event.accept(ModBlocks.DEEPSLATE_WHITEDIAMOND_ORE);


        }


    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
