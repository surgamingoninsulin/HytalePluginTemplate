// ENGLISH: change here the "changeme" and "modname"
// DUCTH: venrander hier de "changeme" en "modname"
package me.changeme.modname;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import me.changeme.modname.commands.ExampleCommand;
import me.changeme.modname.events.ExampleEvent;

import javax.annotation.Nonnull;

public class MainHytalePlugin extends JavaPlugin {

    public MainHytalePlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }
	
	// ENGLISH: this is a example command.
    // DUTCH: dit is een voorbeeld commando.
	@Override
	protected void setup() {
        this.getCommandRegistry().registerCommand(new ExampleCommand("example", "An example command"));
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, ExampleEvent::onPlayerReady);
    }
}