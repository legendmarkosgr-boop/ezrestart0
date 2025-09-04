package com.example.ezrestart;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class EzRestart extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("EzRestart enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("EzRestart disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("ezrestart")) {
            if (sender.isOp() || !(sender instanceof org.bukkit.entity.Player)) {
                sender.sendMessage("§a[EzRestart] Reloading server...");
                Bukkit.reload();
            } else {
                sender.sendMessage("§cYou don’t have permission to run this command.");
            }
            return true;
        }
        return false;
    }
}
