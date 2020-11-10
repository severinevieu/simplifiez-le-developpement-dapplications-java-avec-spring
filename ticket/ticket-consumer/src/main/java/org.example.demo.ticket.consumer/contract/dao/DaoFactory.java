package org.example.demo.ticket.consumer.contract.dao;

public interface DaoFactory {
    ProjetDao getProjetManager();

    ProjetDao getProjetDao();

    abstract void setProjetDao(ProjetDao pProjetManager);

    abstract TicketDao getTicketDao();

    abstract void setTicketDao(TicketDao ticketDao);
}
