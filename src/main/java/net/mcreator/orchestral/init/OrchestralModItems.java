
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orchestral.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.orchestral.item.PenisItem;
import net.mcreator.orchestral.OrchestralMod;

public class OrchestralModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OrchestralMod.MODID);
	public static final RegistryObject<Item> PENIS = REGISTRY.register("penis", () -> new PenisItem());
}
