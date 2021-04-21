package com.cryoexn.hudmod.events;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;

/**
 * Event Handler to listen to when the client to join a server.
 */
public class EventClientConnection {

    /**
     * When the client connects to a server this method will be called.
     *
     * @param event client joined a server event
     */
    @SubscribeEvent
    public void clientConnection(ClientConnectedToServerEvent event) {

    } // end clientConnection.

} // end EventClientConnection.
