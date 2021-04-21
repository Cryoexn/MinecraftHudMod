package com.cryoexn.hudmod.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

import javax.annotation.Nonnull;

/**
 * Abstract class for command handlers.
 */
public abstract class CommandAbstract extends CommandBase {

    /**
     * Overridden method from CommandBase to process command.
     * Passed to abstract implementation to allow for multiple
     * version support.
     *
     * @param server Server command is sent to.
     * @param sender Client sending command.
     * @param args arguments (sub-commands).
     *
     * @throws CommandException exception thrown by command.
     */
    @Override
    public void execute(@Nonnull MinecraftServer server, @Nonnull ICommandSender sender, @Nonnull String[] args) throws CommandException {
        this.onCommand(sender, args);
    } // end execute.

    /**
     * When a command is sent process the command.
     *
     * @param sender Player sending the command.
     * @param args Arguments sent with the command.
     */
    public abstract void onCommand(ICommandSender sender, String[] args) throws CommandException;

} // end CommandAbstract.
