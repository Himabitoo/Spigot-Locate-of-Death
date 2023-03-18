package org.sld.spigotlocateofdeath;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        Player player = e.getEntity().getPlayer();

        int Loc_X = player.getLocation().getBlockX();
        int Loc_Y = player.getLocation().getBlockY();
        int Loc_Z = player.getLocation().getBlockZ();

        player.sendMessage(ChatColor.YELLOW + ", You Died at " +"X："+Loc_X + " Y："+ Loc_Y + " Z："+ Loc_Z );
    }
}
