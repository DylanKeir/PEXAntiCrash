package eu.dyl4n.pexanticrash;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandListener implements Listener {
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {
		String message = event.getMessage().toLowerCase();
		if (event.getPlayer().hasPermission(PEXAntiCrash.getInstance().getBypassPermission())) {
			return;
		}
		if (!(message.startsWith("/pex promote") || message.startsWith("/permissionsex:pex promote"))) {
			return;
		}
		event.setCancelled(true);
		event.getPlayer().sendMessage(PEXAntiCrash.getInstance().getDenyMessage());
	}
	
}