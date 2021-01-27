package tk.wartopia.bungeestaff.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import tk.wartopia.bungeestaff.Bungeestaff;

public class togglereport extends Command {

    Bungeestaff pl;

    public togglereport(){

        super("togglereport", "report.toggle", "tr", "togrep");

    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        ProxiedPlayer p = (ProxiedPlayer) sender;

        if(pl.staffenabledreport.contains(p)){

            pl.staffenabledreport.remove(p);

        }else if(!pl.staffenabledreport.contains(p)){

            pl.staffenabledreport.add(p);

        }

    }
}
