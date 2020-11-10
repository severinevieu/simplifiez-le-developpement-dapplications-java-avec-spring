package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

import javax.inject.Inject;
import javax.inject.Named;
import javax.naming.ldap.PagedResultsControl;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {
    @Inject
    private ProjetManager projetManager;
    @Override
    public ProjetManager getProjetManager(){
        /*Pour eviter à chaque appelle de la méthode ProjectManager() de créer une nouvelle instance
        return new ProjetManager();
        Utilisation injection de dependance*/
        return this.projetManager;
    }
    public void setProjetManager(ProjetManager pProjetManager) {
        this.projetManager = pProjetManager;
    }

    @Inject
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
