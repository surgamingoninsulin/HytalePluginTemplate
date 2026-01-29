// ENGLISH: change here the "changeme" and "modname"
// DUCTH: venrander hier de "changeme" en "modname"
package me.changeme.modname.events;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;

public class ExampleEvent {
	// ENGLISH: this is an example of a EVENT
	// DUTCH: dit is een voorbeeld van  een EVENT
    public static void onPlayerReady(PlayerReadyEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(Message.raw("Welcome " + player.getDisplayName()));
    }

}