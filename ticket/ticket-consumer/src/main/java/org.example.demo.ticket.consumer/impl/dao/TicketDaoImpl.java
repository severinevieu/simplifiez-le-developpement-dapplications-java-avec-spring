package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class TicketDaoImpl extends AbstractDoaImpl implements TicketDao {
    @Inject
    private ProjetDao projetDao;

    @Inject
    private UtilisateurDao utilisateurDao;
}
