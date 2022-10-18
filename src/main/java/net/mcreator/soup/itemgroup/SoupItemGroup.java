
package net.mcreator.soup.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.soup.SoupModElements;

@SoupModElements.ModElement.Tag
public class SoupItemGroup extends SoupModElements.ModElement {
	public SoupItemGroup(SoupModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsoup") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.MUSHROOM_STEW);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
