
package net.hiro.decorationmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.hiro.decorationmod.block.OakCoffeTableBlock;
import net.hiro.decorationmod.HirosdecorationmodModElements;

@HirosdecorationmodModElements.ModElement.Tag
public class TableDecorationsItemGroup extends HirosdecorationmodModElements.ModElement {
	public TableDecorationsItemGroup(HirosdecorationmodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtable_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OakCoffeTableBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
