package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.model.bean.projet.Projet;

public interface ProjetDao {

    Projet getProjet(Integer pId);
}
