package tk.wartopia.bungeestaff.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import tk.wartopia.bungeestaff.Bungeestaff;

public class report extends Command {

    Bungeestaff pl;



    public report(){
        super("report", "bungee.report", "rep", "wdr");
    }


    @Override
    public void execute(CommandSender sender, String[] args) {




            if(args.length > 2){

                ProxiedPlayer t = Bungeestaff.instance.getProxy().getPlayer(args[0]);
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < args.length; i++){

                    sb.append(args[i]);
                    sb.append(" ");

                }
                String reason = sb.toString();

                for(int i = 0; i < pl.staffenabledreport.size(); i++){

                    ProxiedPlayer staffmember = pl.staffenabledreport.get(i);




                    staffmember.sendMessage(new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + "-------------------------------------------------------------"));
                    staffmember.sendMessage(new TextComponent(""));
                    staffmember.sendMessage(new TextComponent(ChatColor.BLUE + "" + ChatColor.BOLD + "Reported player: " + ChatColor.RED + t.getName()));
                    staffmember.sendMessage(new TextComponent(ChatColor.BLUE + "" + ChatColor.BOLD + "For: " + ChatColor.GREEN + reason));
                    staffmember.sendMessage(new TextComponent(ChatColor.BLUE + "" + ChatColor.BOLD + "By: " + ChatColor.GOLD + sender.getName()));
                    staffmember.sendMessage(new TextComponent(""));
                    staffmember.sendMessage(new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + "-------------------------------------------------------------"));

                }




            }




    }
}
