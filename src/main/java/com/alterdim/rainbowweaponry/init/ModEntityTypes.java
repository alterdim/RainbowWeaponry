package com.alterdim.rainbowweaponry.init;

import com.alterdim.rainbowweaponry.RainbowWeaponry;
import com.alterdim.rainbowweaponry.entities.Ifrit;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes 
{
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, RainbowWeaponry.MOD_ID);
	
	public static final RegistryObject<EntityType<Ifrit>> IFRIT = ENTITY_TYPES.register
			("ifrit", () -> EntityType.Builder.<Ifrit>create(Ifrit::new, EntityClassification.MONSTER)
			.size(3f, 3f).build(new ResourceLocation(RainbowWeaponry.MOD_ID, "ifrit").toString()));

}
