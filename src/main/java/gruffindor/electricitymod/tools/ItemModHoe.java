package gruffindor.electricitymod.tools;

import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(ToolMaterial material, String unlocalizedName) {
		super(material);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);

	}

}
