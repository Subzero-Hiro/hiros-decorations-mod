
package net.hiro.decorationmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.hiro.decorationmod.HirosdecorationmodModElements;

@HirosdecorationmodModElements.ModElement.Tag
public class PotteryDecorationsItemGroup extends HirosdecorationmodModElements.ModElement {
	public PotteryDecorationsItemGroup(HirosdecorationmodModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpottery_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.FLOWER_POT, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
