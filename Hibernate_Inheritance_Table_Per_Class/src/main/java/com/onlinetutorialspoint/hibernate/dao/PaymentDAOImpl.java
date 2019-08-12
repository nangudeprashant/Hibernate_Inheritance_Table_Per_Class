/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinetutorialspoint.hibernate.dao;

import com.onlinetutorialspoint.hibernate.model.Card;
import com.onlinetutorialspoint.hibernate.model.Cheque;
import com.onlinetutorialspoint.hibernate.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

/**
 *
 * @author chandrashekhar
 */
public class PaymentDAOImpl implements PaymentDAO {

    public void saveCard(Card card) {
        SessionFactory factory = HibernateUtil.getInstnce();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(card);
        tx.commit();
        session.close();
        System.out.println("Card Inserted Successfully..");

    }

    public void saveCheque(Cheque cheque) {
        SessionFactory factory = HibernateUtil.getInstnce();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cheque);
        tx.commit();
        session.close();
        System.out.println("Cheque Inserted Successfully..");
    }

}
