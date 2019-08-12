/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinetutorialspoint.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author chandrashekhar
 */
public class HibernateUtil {

    private HibernateUtil() {

    }
    private static SessionFactory sessionFactory;

    public static synchronized SessionFactory getInstnce() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return sessionFactory;

    }
}
