package coldwar.utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.FileWriter;
import java.io.IOException;

public class CreateCountry implements CommandExecutor {

    private FileWriter ecriture;
    private String contre;

    public CreateCountry() throws IOException {


    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player joueur = (Player) sender;
            try {
                this.ecriture = new FileWriter(args[0]);
                this.ecriture.write(args[1]+":"+"M");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return false;
    }
}
