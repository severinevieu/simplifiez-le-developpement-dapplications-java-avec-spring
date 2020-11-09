package org.example.demo.ticket.business.contract.manager;

public interface ManagerFactory {

    ProjetManager getProjetManager();

    void setProjetManager(ProjetManager pProjetManager);

    TicketManager getTicketManger();

    void setTicketManager(TicketManager ticketManager);
}
