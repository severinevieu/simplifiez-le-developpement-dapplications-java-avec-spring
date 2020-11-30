package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

import javax.inject.Inject;
import javax.inject.Named;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {

    private ProjetManager projetManager;
    private TicketManager ticketManager;

    public ManagerFactoryImpl() {
    }

    public ProjetManager getProjetManager() {
        return projetManager;
    }

    @Inject
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    @Override
    public TicketManager getTicketManger() {
        return ticketManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    @Inject
    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }


    @Inject
    public  ManagerFactoryImpl(ProjetManager pProjetManager,
                               TicketManager pTicketManager) {
        this.projetManager = pProjetManager;
        this.ticketManager = pTicketManager;
    }

}
