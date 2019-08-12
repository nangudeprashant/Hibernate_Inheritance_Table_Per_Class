/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinetutorialspoint.hibernate.dao;

import com.onlinetutorialspoint.hibernate.model.Card;
import com.onlinetutorialspoint.hibernate.model.Cheque;

/**
 *
 * @author chandrashekhar
 */
public interface PaymentDAO {

    public void saveCard(Card card);

    public void saveCheque(Cheque cheque);
}
