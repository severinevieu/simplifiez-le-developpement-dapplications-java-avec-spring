package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
@ManagedBean
public class ProjetDaoImpl implements ProjetDao {
    @Inject
    private TicketDao ticketDao;

    @Inject
    private UtilisateurDao utilisateurDao;

    // ...
}
