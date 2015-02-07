
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by natha_000 on 2/6/2015.
 */
public class Main extends JavaPlugin implements Listener {

    public final Logger logger = Logger.getLogger("Minecraft");

    public void onEnable(){

        logger.info("BukkitTesting has been enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        Player p = (Player) sender;
        if(commandLabel.equalsIgnoreCase("test")){
            
        }
        return false;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

    }
}
