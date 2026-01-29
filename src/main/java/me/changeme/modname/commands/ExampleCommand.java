// ENGLISH: change here the "changeme" and "modname"
// DUCTH: venrander hier de "changeme" en "modname"
package me.changeme.modname.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ExampleCommand extends AbstractCommand {
	// ENGLISH: this is an example of a COMMAND
	// DUTCH: dit is een voorbeeld van  een COMMAND
    public ExampleCommand(String name, String description) {
        super(name, description);
    }

    @Nullable
    @Override
    protected CompletableFuture<Void> execute(@Nonnull CommandContext context) {
        context.sendMessage(Message.raw("Hello from ExampleCommand!"));
        return CompletableFuture.completedFuture(null);
    }

}