package com.cryoexn.hudmod.events;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Event handler, used when the client gets a EventChatReceived.
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class EventChatReceived {

    /**
     * When the client gets a message in chat this method will be called.
     *
     * @param clientChatReceivedEvent client received chat event.
     */
    @SubscribeEvent
    public static void onChat(ClientChatReceivedEvent clientChatReceivedEvent) {
        System.out.println("Chat Received.");
    } // end chatMessageReceived.

} // end EventChatReceived.
