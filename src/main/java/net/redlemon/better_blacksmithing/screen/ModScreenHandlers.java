package net.redlemon.better_blacksmithing.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.redlemon.better_blacksmithing.BetterBlacksmithing;

public class ModScreenHandlers {
    public static final ScreenHandlerType<BBFurnaceScreenHandler> FURNACE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(BetterBlacksmithing.MOD_ID, "furnace_screen_handler"),
                    new ExtendedScreenHandlerType<>(BBFurnaceScreenHandler::new));

    public static void registerScreenHandlers() {
        BetterBlacksmithing.LOGGER.info("Registering Mod Screen Handlers for " + BetterBlacksmithing.MOD_ID);
    }
}
