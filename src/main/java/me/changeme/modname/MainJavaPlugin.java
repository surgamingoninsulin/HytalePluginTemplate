// ENGLISH: change here the "changeme" and "modname"
// DUCTH: venrander hier de "changeme" en "modname"
package me.changeme.modname;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import dev.hytalemodding.commands.ExampleCommand;
import dev.hytalemodding.events.ExampleEvent;

import javax.annotation.Nonnull;

public class MainHytalePlugin extends JavaPlugin {

    public MainHytalePlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }
	
	// ENGLISH: this is a example command you can safely delete this if not wanted.
    // DUTCH: dit is een voorbeeld commando je kan eht vijlig verwijderen als je dit niet wilt.
	@Override
	protected void setup() {
        this.getCommandRegistry().registerCommand(new ExampleCommand("example", "An example command"));
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, ExampleEvent::onPlayerReady);
    }
}