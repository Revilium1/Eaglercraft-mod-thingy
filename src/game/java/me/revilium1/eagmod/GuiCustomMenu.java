package me.revilium1.eagmod;
import net.minecraft.client.gui.GuiScreen;

public class GuiCustomMenu extends GuiScreen {
    @Override 

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "Menu.png [not broken]", this.width / 2, this.height / 2, -1);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
