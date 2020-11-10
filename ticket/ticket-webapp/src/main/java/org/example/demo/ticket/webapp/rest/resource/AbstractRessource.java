package org.example.demo.ticket.webapp.rest.resource;


public abstract class AbstractRessource {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory pManagerFactory){
        managerFactory = pManagerFactory;
    }

}
