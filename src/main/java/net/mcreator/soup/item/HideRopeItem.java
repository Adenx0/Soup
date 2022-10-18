
package net.mcreator.soup.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.soup.itemgroup.SoupItemGroup;
import net.mcreator.soup.SoupModElements;

@SoupModElements.ModElement.Tag
public class HideRopeItem extends SoupModElements.ModElement {
	@ObjectHolder("soup:hide_rope")
	public static final Item block = null;

	public HideRopeItem(SoupModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SoupItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("hide_rope");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
