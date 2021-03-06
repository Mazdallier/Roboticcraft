package com.meadowcottage.roboticcraft.common.items.tools;

import com.meadowcottage.roboticcraft.common.items.IUniversalWrench;
import com.meadowcottage.roboticcraft.common.items.ItemRoboticCraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.meadowcottage.roboticcraft.common.reference.Names;
import com.meadowcottage.roboticcraft.common.reference.Textures;

public class ItemWrench extends ItemRoboticCraft implements IUniversalWrench
{
    public ItemWrench()
    {
        super();
        this.setUnlocalizedName(Names.Tools.Wrench);
        this.setTextureName(Textures.Tools.Wrench);
        this.maxStackSize = 1;
        this.setNoRepair();
    }

    @Override
    public boolean doesSneakBypassUse( World world, int x, int y, int z, EntityPlayer player )
    {
        return true;
    }

    @Override
    public boolean canWrench( EntityPlayer player, int x, int y, int z )
    {
        return true;
    }

    @Override
    public void wrenchUsed( EntityPlayer player, int x, int y, int z )
    {
        player.swingItem();
    }

    @Override
    public boolean isUsable(ItemStack item, EntityLivingBase user, int x, int y, int z) {
        return false;
    }

    @Override
    public void toolUsed(ItemStack item, EntityLivingBase user, int x, int y, int z) {

    }
}
