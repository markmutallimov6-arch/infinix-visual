package com.example;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class MyCustomScreen extends Screen {

    public MyCustomScreen() {
        super(Text.literal("Моё Кастомное Меню"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(
            this.textRenderer, 
            this.title, 
            this.width / 2, 
            20, 
            0xFFFFFF
        );
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPauseGame() {
        return false; 
    }
}
