package com.alterdim.rainbowweaponry.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Ifrit extends MonsterEntity implements IRangedAttackMob
{

	protected Ifrit(EntityType<? extends MonsterEntity> type, World worldIn) 
	{
		super(type, worldIn);
	}
	
	private void launchFireballToEntity(LivingEntity entity) {
	      this.launchFireballToCoords(entity.getPosX(), entity.getPosY(), entity.getPosZ());
	   }

	   /**
	    * Launches a Wither skull toward (par2, par4, par6)
	    */
	   private void launchFireballToCoords(double x, double y, double z) {
	      double d0 = this.getPosX();
	      double d1 = this.getPosY();
	      double d2 = this.getPosZ();
	      double d3 = x - d0;
	      double d4 = y - d1;
	      double d5 = z - d2;
	      FireballEntity fireball = new FireballEntity(this.world, this, d3, d4, d5);
	      
	      fireball.setRawPosition(d0, d1, d2);
	      this.playSound(SoundEvents.ENTITY_BLAZE_SHOOT, 1, 1);
	      this.world.addEntity(fireball);
	   }

	@Override
	public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
		
		
	}

}
