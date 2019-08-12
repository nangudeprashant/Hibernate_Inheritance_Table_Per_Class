/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinetutorialspoint.hibernate.dao;

/**
 *
 * @author chandrashekhar
 */
public class PaymentDAOFactory {

    public static PaymentDAO getInstance() {
        return new PaymentDAOImpl();
    }
}
