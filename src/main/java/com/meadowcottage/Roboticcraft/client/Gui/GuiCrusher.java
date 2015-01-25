package com.meadowcottage.Roboticcraft.client.Gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.meadowcottage.Roboticcraft.common.Reference.Reference;
import com.meadowcottage.Roboticcraft.common.container.ContainerCrusher;
import com.meadowcottage.Roboticcraft.common.tile.TileEntityCrusher;

public class GuiCrusher extends GuiContainer
{
	private static ResourceLocation guitexture = new ResourceLocation(Reference.MOD_ID + ":textures/gui/battery.png");

	private final TileEntityCrusher tile;

	public GuiCrusher(InventoryPlayer inventory, TileEntityCrusher tile)
	{
		super(new ContainerCrusher(inventory, tile));

		this.tile = tile;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int x, int y)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.renderEngine.bindTexture(guitexture);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
	{
		// Draw Text Strings in here
	}
}
