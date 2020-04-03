package com.alterdim.rainbowweaponry.objects.blocks;

import com.alterdim.rainbowweaponry.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class RedPrison extends Block
{

	public RedPrison(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult p_225533_6_) 
	{
		if (player.getActiveItemStack().equals(ItemInit.MASTER_KEY.get().getDefaultInstance()))
		{
			
		}
		return ActionResultType.SUCCESS;
	}
}
