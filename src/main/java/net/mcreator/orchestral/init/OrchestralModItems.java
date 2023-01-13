
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orchestral.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.orchestral.item.PenisItem;
import net.mcreator.orchestral.item.EviliteSwordItem;
import net.mcreator.orchestral.item.EviliteShovelItem;
import net.mcreator.orchestral.item.EvilitePickaxeItem;
import net.mcreator.orchestral.item.EviliteIngotItem;
import net.mcreator.orchestral.item.EviliteHoeItem;
import net.mcreator.orchestral.item.EviliteAxeItem;
import net.mcreator.orchestral.item.EviliteArmorItem;
import net.mcreator.orchestral.OrchestralMod;

public class OrchestralModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OrchestralMod.MODID);
	public static final RegistryObject<Item> PENIS = REGISTRY.register("penis", () -> new PenisItem());
	public static final RegistryObject<Item> EVILITE_INGOT = REGISTRY.register("evilite_ingot", () -> new EviliteIngotItem());
	public static final RegistryObject<Item> EVILITE_ORE = block(OrchestralModBlocks.EVILITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EVILITE_BLOCK = block(OrchestralModBlocks.EVILITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EVILITE_PICKAXE = REGISTRY.register("evilite_pickaxe", () -> new EvilitePickaxeItem());
	public static final RegistryObject<Item> EVILITE_AXE = REGISTRY.register("evilite_axe", () -> new EviliteAxeItem());
	public static final RegistryObject<Item> EVILITE_SWORD = REGISTRY.register("evilite_sword", () -> new EviliteSwordItem());
	public static final RegistryObject<Item> EVILITE_SHOVEL = REGISTRY.register("evilite_shovel", () -> new EviliteShovelItem());
	public static final RegistryObject<Item> EVILITE_HOE = REGISTRY.register("evilite_hoe", () -> new EviliteHoeItem());
	public static final RegistryObject<Item> EVILITE_ARMOR_HELMET = REGISTRY.register("evilite_armor_helmet", () -> new EviliteArmorItem.Helmet());
	public static final RegistryObject<Item> EVILITE_ARMOR_CHESTPLATE = REGISTRY.register("evilite_armor_chestplate",
			() -> new EviliteArmorItem.Chestplate());
	public static final RegistryObject<Item> EVILITE_ARMOR_LEGGINGS = REGISTRY.register("evilite_armor_leggings",
			() -> new EviliteArmorItem.Leggings());
	public static final RegistryObject<Item> EVILITE_ARMOR_BOOTS = REGISTRY.register("evilite_armor_boots", () -> new EviliteArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
