package net.minecraft.item;

import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDirtyApple extends ItemFood {
	public ItemDirtyApple(int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		this.setHasSubtypes(true);
		this.setAlwaysEdible();
	}

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (!world.isRemote) {
			entityplayer.addPotionEffect(new PotionEffect(22, 2400, 0));
			entityplayer.addPotionEffect(new PotionEffect(2, 2400, 1));
		}
		super.onFoodEaten(itemstack, world, entityplayer);

	}
}