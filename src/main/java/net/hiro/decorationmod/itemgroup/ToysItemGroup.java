
package net.hiro.decorationmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.hiro.decorationmod.block.CreeperPlushBlock;
import net.hiro.decorationmod.HirosdecorationmodModElements;

@HirosdecorationmodModElements.ModElement.Tag
public class ToysItemGroup extends HirosdecorationmodModElements.ModElement {
	public ToysItemGroup(HirosdecorationmodModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtoys") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CreeperPlushBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
