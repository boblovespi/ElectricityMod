package gruffindor.electricitymod.tools;

import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword{

	public ItemModSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);

	}

}
