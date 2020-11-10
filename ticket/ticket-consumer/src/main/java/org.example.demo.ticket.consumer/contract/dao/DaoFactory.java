package org.example.demo.ticket.consumer.contract.dao;

public interface DaoFactory {
    abstract ProjetDao getProjetManager();

    abstract ProjetDao getProjetDao();

    abstract void setProjetDao(ProjetDao pProjetManager);

    abstract TicketDao getTicketDao();

    abstract void setTicketDao(TicketDao ticketDao);

    void setUtilisateurDao(String utilisateurDao);
}
