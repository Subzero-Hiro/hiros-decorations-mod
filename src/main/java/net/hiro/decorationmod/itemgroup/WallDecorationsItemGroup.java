
package net.hiro.decorationmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.hiro.decorationmod.HirosdecorationmodModElements;

@HirosdecorationmodModElements.ModElement.Tag
public class WallDecorationsItemGroup extends HirosdecorationmodModElements.ModElement {
	public WallDecorationsItemGroup(HirosdecorationmodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwall_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.OAK_WALL_SIGN, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
