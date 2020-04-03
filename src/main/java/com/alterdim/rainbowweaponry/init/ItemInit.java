package com.alterdim.rainbowweaponry.init;

import com.alterdim.rainbowweaponry.RainbowWeaponry;
import com.alterdim.rainbowweaponry.RainbowWeaponry.RainbowWeaponryItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RainbowWeaponry.MOD_ID);
	
	public static final RegistryObject<Item> RAINBOW_GEM = ITEMS.register("rainbow_gem", () -> 
	new Item(new Item.Properties().group(RainbowWeaponryItemGroup.instance)));

}
