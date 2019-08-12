/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlinetutorialspoint.hibernate.model;

/**
 *
 * @author chandrashekhar
 */
public class Cheque extends Payment {

    private int chequeNumber;
    private String chequeType;

    public int getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public String getChequeType() {
        return chequeType;
    }

    public void setChequeType(String chequeType) {
        this.chequeType = chequeType;
    }

}
