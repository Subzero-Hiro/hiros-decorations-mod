
package net.hiro.decorationmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.hiro.decorationmod.block.LaptopOpenBlock;
import net.hiro.decorationmod.HirosdecorationmodModElements;

@HirosdecorationmodModElements.ModElement.Tag
public class TechnologyItemGroup extends HirosdecorationmodModElements.ModElement {
	public TechnologyItemGroup(HirosdecorationmodModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtechnology") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LaptopOpenBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
