package net.redlemon.better_blacksmithing;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.redlemon.better_blacksmithing.screen.BBFurnaceScreen;
import net.redlemon.better_blacksmithing.screen.ModScreenHandlers;

public class BetterBlacksmithingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.FURNACE_SCREEN_HANDLER, BBFurnaceScreen::new);
    }
}
