package sonar.bagels.utils;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import sonar.bagels.Bagels;

public enum DeskType implements IStringSerializable {
	FANCY, STONE, TREATED;

	@Override
	public String getName() {
		return this.name().toLowerCase();
	}

	public ItemStack getDesk() {
		switch (this) {
		case FANCY:
			return new ItemStack(Bagels.deskFancy);
		case STONE:
			return new ItemStack(Bagels.deskStone);
		case TREATED:
			return new ItemStack(Bagels.deskTreated);
		default:
			return null;
		}
	}
}
