
package net.hiro.decorationmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.hiro.decorationmod.block.ConcreteBarrierLightsBlock;
import net.hiro.decorationmod.HirosdecorationmodModElements;

@HirosdecorationmodModElements.ModElement.Tag
public class RoadDecorationsItemGroup extends HirosdecorationmodModElements.ModElement {
	public RoadDecorationsItemGroup(HirosdecorationmodModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabroad_decorations") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ConcreteBarrierLightsBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
