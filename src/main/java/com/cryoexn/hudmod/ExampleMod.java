package com.cryoexn.hudmod;

import com.cryoexn.hudmod.commands.CommandHud;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import com.cryoexn.hudmod.commands.CommandAbstract;

import java.util.Arrays;

/**
 * Mod for HUD
 *
 * experimenting and learning coding practices and interfacing with existing libraries.
 */
@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {

    public static final String MODID = "hudmod";
    public static final String NAME = "Hud Mod";
    public static final String VERSION = "1.0.0";

    /**
     * Initialize all event, and command handlers.
     *
     * @param event Initialization event.
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {

        // EventHandlers are auto registered.

        // Register CommandHandler(s).
        this.registerCommands(new CommandHud());

    } // end init.

    /**
     * Register all commands with the Forge ClientCommandHandler.
     *
     * @param commands Command handlers to register.
     */
    private void registerCommands(Object... commands) {

        Arrays.asList(commands).forEach((command) -> {
            ClientCommandHandler.instance.registerCommand((CommandAbstract)command);
        });

    } // end registerCommands.

} // end HudMod.
