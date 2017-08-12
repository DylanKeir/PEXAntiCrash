package eu.dyl4n.pexanticrash;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;

public class PEXAntiCrash extends JavaPlugin {
	
	@Getter private static PEXAntiCrash instance;
	@Getter @Setter private String denyMessage;
	@Getter @Setter private String bypassPermission;

	@Override
	public void onEnable() {
		instance = this;
		saveDefaultConfig();
		setDenyMessage(ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("deny-message")));
		setBypassPermission(this.getConfig().getString("bypass-permission"));
		this.getServer().getPluginManager().registerEvents(new CommandListener(), this);
	}

}