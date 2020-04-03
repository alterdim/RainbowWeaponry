package com.alterdim.rainbowweaponry.init;

import com.alterdim.rainbowweaponry.RainbowWeaponry;
import com.alterdim.rainbowweaponry.RainbowWeaponry.RainbowWeaponryItemGroup;
import com.alterdim.rainbowweaponry.objects.items.RainbowGem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RainbowWeaponry.MOD_ID);
	
	public static final RegistryObject<Item> RAINBOW_GEM = ITEMS.register("rainbow_gem", () -> 
	new RainbowGem(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> BLUE_GEM = ITEMS.register("blue_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> CYAN_GEM = ITEMS.register("cyan_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> GREEN_GEM = ITEMS.register("green_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> ORANGE_GEM = ITEMS.register("orange_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> PURPLE_GEM = ITEMS.register("purple_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> RED_GEM = ITEMS.register("red_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));
	public static final RegistryObject<Item> YELLOW_GEM = ITEMS.register("yellow_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));

}
