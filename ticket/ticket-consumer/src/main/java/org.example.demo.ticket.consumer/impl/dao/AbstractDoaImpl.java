package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

public abstract class AbstractDoaImpl {
    @Inject
    @Named("dateSourceTicket")
    private DataSource dataSource;

    protected DataSource getDataSource(){
        return dataSource;
    }

    public abstract int getCountTicket (RechercheTicket rechercheTicket);
}
