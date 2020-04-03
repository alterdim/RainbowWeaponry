package com.alterdim.rainbowweaponry.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RainbowGem extends Item
{

	public RainbowGem(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
