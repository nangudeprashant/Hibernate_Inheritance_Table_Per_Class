
import com.onlinetutorialspoint.hibernate.dao.PaymentDAO;
import com.onlinetutorialspoint.hibernate.dao.PaymentDAOFactory;
import com.onlinetutorialspoint.hibernate.model.Card;
import com.onlinetutorialspoint.hibernate.model.Cheque;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chandrashekhar
 */ 
public class Main {

    public static void main(String[] args) {
        
        Card card = new Card();
        card.setPaymentId(110006);
        card.setPaymentDate(new Date());
        card.setAmount(20000);
        card.setCardNumber(55661423);
        card.setCardType("MASTRO");
        PaymentDAO dao = PaymentDAOFactory.getInstance();
        dao.saveCard(card);

        System.out.println("=========================");

        Cheque cheque = new Cheque();
        cheque.setPaymentId(225612);
        cheque.setPaymentDate(new Date());
        cheque.setAmount(80000);
        cheque.setChequeNumber(45689523);
        cheque.setChequeType("ORDER");
        dao.saveCheque(cheque);
    }
}
