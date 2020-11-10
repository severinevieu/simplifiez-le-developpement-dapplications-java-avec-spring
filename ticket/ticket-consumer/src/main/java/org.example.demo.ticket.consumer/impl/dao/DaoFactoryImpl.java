package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.DaoFactory;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named("daoFactory")
public class DaoFactoryImpl implements DaoFactory {
    @Inject
    private ProjetDao projetDao;

    @Override
    public ProjetDao getProjetManager() {
        return null;
    }

    @Override
    public ProjetDao getProjetDao(){
        return this.projetDao;
    }
    @Override
    public void setProjetDao(ProjetDao pProjetManager) {
        this.projetDao = pProjetManager;
    }

    @Inject
    private TicketDao ticketDao;
    @Override
    public TicketDao getTicketDao(){
        return this.ticketDao;
    }
    @Override
    public void setTicketDao(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    public void setUtilisateurDao(String utilisateurDao) {
    }
}
