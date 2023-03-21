package coldwa.coldwar;

import coldwar.utils.CreateCountry;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class ColdWar extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("thank you to install the cold war mod enjoy ;)");
        try {
            this.getCommand("create").setExecutor( new CreateCountry());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
