package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public class ManagerFactoryImpl implements ManagerFactory {private ProjetManager projetManager;
    @Override
    public ProjetManager getProjetManager(){
        /*Pour eviter à chaque appelle de la méthode ProjectManager() de créer une nouvelle instance
        return new ProjetManager();
        Utilisation injection de dependance*/
        return this.projetManager;
    }

    @Override
    public void setProjetManager(ProjetManager pProjetManager) {
        this.projetManager = pProjetManager;
    }

    private TicketManager ticketManager;
    @Override
    public TicketManager getTicketManger(){
        return this.ticketManager;
    }
    @Override
    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }
}
