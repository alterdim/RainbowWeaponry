package com.alterdim.rainbowweaponry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alterdim.rainbowweaponry.init.BlockInit;
import com.alterdim.rainbowweaponry.init.ItemInit;
import com.alterdim.rainbowweaponry.init.ModEntityTypes;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("rainbowweaponry")
@Mod.EventBusSubscriber(modid = "rainbowweaponry", bus = Mod.EventBusSubscriber.Bus.MOD) 
public class RainbowWeaponry
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rainbowweaponry";
    public static RainbowWeaponry instance;

    public RainbowWeaponry() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
    	
    	 ItemInit.ITEMS.register(modEventBus);
         BlockInit.BLOCKS.register(modEventBus);
         ModEntityTypes.ENTITY_TYPES.register(modEventBus);
    	
    	
    	

    	instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	
    	BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->  {
    		final Item.Properties properties = new Item.Properties().group(RainbowWeaponryItemGroup.instance);
    		final BlockItem blockItem = new BlockItem(block, properties);
    		blockItem.setRegistryName(block.getRegistryName());
    		registry.register(blockItem);
    	});
    	
    	LOGGER.debug("Registered BlockItems !");
    }
    
    public static class RainbowWeaponryItemGroup extends ItemGroup
    {
    	public static final RainbowWeaponryItemGroup instance = new RainbowWeaponryItemGroup(ItemGroup.GROUPS.length, "rainbow_weaponry_tab");
    	private RainbowWeaponryItemGroup(int index, String label)
    	{
    		super(index, label);
    	}

		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(ItemInit.RAINBOW_GEM.get());
		}
    }
}
