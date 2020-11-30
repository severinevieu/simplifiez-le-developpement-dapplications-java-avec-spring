package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Commentaire;
import org.example.demo.ticket.model.bean.ticket.HistoriqueStatut;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

public interface TicketManager {
    abstract Ticket getTicket(Long pNumero) throws NotFoundException;

    abstract List<Ticket> getListTicket(RechercheTicket pRechercheTicket);

    abstract int getCountTicket(RechercheTicket pRechercheTicket);

    HistoriqueStatut changerStatut(Ticket pTicket, TicketStatut pNewtStatut,
                                   Utilisateur utilisateur, Commentaire commentaire);
}
