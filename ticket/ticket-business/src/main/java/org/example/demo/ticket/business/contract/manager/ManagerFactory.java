package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.business.manager.TicketManager;

public interface ManagerFactory {

    ProjetManager getProjetManager();

    void setProjetManager(ProjetManager pProjetManager);

    TicketManager getTicketManger();

    void setTicketManager(TicketManager ticketManager);
}
