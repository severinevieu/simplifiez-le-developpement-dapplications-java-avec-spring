package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.*;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.exception.TechnicalException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named //si non préciser prends le nom de la class pas default en camelCase
public class TicketManagerImpl extends AbstractManager implements TicketManager {

    @Override
    public Ticket getTicket(Long pNumero) throws NotFoundException {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        if (pNumero < 1L) {
            throw new NotFoundException("Ticket non trouvé : numero=" + pNumero);
        }
        Evolution vEvolution = new Evolution(pNumero);
        vEvolution.setPriorite(10);
        return vEvolution;
    }


    @Override
    public List<Ticket> getListTicket(RechercheTicket pRechercheTicket) {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        List<Ticket> vList = new ArrayList<>();
        if (pRechercheTicket.getProjetId() != null) {
            Projet vProjet = new Projet(pRechercheTicket.getProjetId());
            for (int vI = 0; vI < 4; vI++) {
                Ticket vTicket = new Bug((long) pRechercheTicket.getProjetId() * 10 + vI);
                vTicket.setProjet(vProjet);
                vList.add(vTicket);
            }
        } else {
            for (int vI = 0; vI < 9; vI++) {
                Ticket vTicket = new Evolution((long) vI);
                vList.add(vTicket);
            }
        }
        return vList;
    }


    @Override
    public int getCountTicket(RechercheTicket pRechercheTicket) {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        return 42;
    }

    @Override
    public HistoriqueStatut changerStatut(Ticket pTicket, TicketStatut pNewtStatut,
                                          Utilisateur utilisateur, Commentaire commentaire) {

        TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());
        HistoriqueStatut vHistoriqueStatut = vTransactionTemplate.execute(
                new TransactionCallback<HistoriqueStatut>() {
                    @Override
                    public HistoriqueStatut doInTransaction(TransactionStatus transactionStatus) {
                        HistoriqueStatut vHistoriqueStatut = null;
                        TicketStatut vOldStatus = pTicket.getStatut();
                        pTicket.setStatut(pNewtStatut);
                        try {
                            getDaoFactory().getTicketDao().updateTicket(pTicket);
                            vHistoriqueStatut = new HistoriqueStatut();
                        } catch (TechnicalException vEx) {

                        }
                        return vHistoriqueStatut;
                    }
                }
        );
        return vHistoriqueStatut;
    }
}
