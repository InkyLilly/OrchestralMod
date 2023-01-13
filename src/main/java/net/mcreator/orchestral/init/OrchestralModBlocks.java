
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orchestral.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.orchestral.block.EviliteOreBlock;
import net.mcreator.orchestral.block.EviliteBlockBlock;
import net.mcreator.orchestral.OrchestralMod;

public class OrchestralModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OrchestralMod.MODID);
	public static final RegistryObject<Block> EVILITE_ORE = REGISTRY.register("evilite_ore", () -> new EviliteOreBlock());
	public static final RegistryObject<Block> EVILITE_BLOCK = REGISTRY.register("evilite_block", () -> new EviliteBlockBlock());
}
