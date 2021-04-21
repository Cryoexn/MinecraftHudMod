package com.cryoexn.hudmod.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.text.TextComponentString;

import javax.annotation.Nonnull;

public class CommandHud extends CommandAbstract {

    /**
     * Returns the name of the command.
     *
     * Nonnull annotations added to silence Intellij warnings.
     *
     * @return name of command.
     */
    @Override
    @Nonnull
    public String getName() {

        return "cryohud";

    } // end getName.

    /**
     * Returns the usage message of CommandHandler.
     *
     * Nonnull annotations added to silence Intellij warnings.
     *
     * @param sender Client sending command.
     *
     * @return Command usage message.
     */
    @Override
    @Nonnull
    public String getUsage(@Nonnull ICommandSender sender) {

        return "cryohud sub-command sub-command ...";

    } // end getUsage.

    /**
     * Returns the permission required for the command.
     *
     * @return permission level.
     */
    public int getRequiredPermissionLevel() {

        return 0;

    } // end getRequiredPermissionLevel.

    /**
     * Handles the logic of the command and sub-commands.
     *
     * Nonnull annotations added to silence Intellij warnings.
     *
     * @param sender Client sending command.
     * @param args Command arguments (sub-commands).
     */
    @Override
    public void onCommand(ICommandSender sender, String[] args) throws CommandException {

        switch (args[0]) {
            case "ch":
            case "cryohud":
                sender.sendMessage(new TextComponentString("Valid"));
                break;
            default:
                throw new CommandException("Not Valid.");
        }

    } // end execute.

} // end CommandHud.
