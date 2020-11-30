package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.TechnicalException;

public interface TicketDao {

    void updateTicket(Ticket pTicket) throws TechnicalException;
}
