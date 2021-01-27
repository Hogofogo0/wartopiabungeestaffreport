package tk.wartopia.bungeestaff.events;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import tk.wartopia.bungeestaff.Bungeestaff;

public class ReportJoinEvent implements Listener {

    Bungeestaff pl;

    @EventHandler
    public void enableReportOnJoin(PostLoginEvent e){



        ProxiedPlayer p = e.getPlayer();
        if(p.hasPermission("report.recieve")){

            pl.staffenabledreport.add(p);

        }


    }

}
