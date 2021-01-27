package tk.wartopia.bungeestaff;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import tk.wartopia.bungeestaff.commands.report;
import tk.wartopia.bungeestaff.commands.togglereport;
import tk.wartopia.bungeestaff.events.ReportJoinEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public final class Bungeestaff extends Plugin {


    public ArrayList<ProxiedPlayer> staffenabledreport = new ArrayList<>();
    public static Bungeestaff instance;





    @Override
    public void onEnable() {


        getProxy().getPluginManager().registerCommand(this, new report());
        getProxy().getPluginManager().registerListener(this, new ReportJoinEvent());
        getProxy().getPluginManager().registerCommand(this, new togglereport());









    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
