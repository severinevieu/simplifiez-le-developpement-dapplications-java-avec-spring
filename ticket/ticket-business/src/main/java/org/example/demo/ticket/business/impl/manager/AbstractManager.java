package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.consumer.contract.dao.DaoFactory;

public abstract class AbstractManager {

    private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }



}
