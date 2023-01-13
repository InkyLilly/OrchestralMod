
package net.mcreator.orchestral.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.orchestral.init.OrchestralModItems;

public class EviliteHoeItem extends HoeItem {
	public EviliteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1004;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 38;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrchestralModItems.EVILITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
