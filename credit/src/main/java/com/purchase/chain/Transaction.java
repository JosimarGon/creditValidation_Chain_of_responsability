package com.purchase.chain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.purchase.model.Client;
import com.purchase.model.Purchase;

public class Transaction{
    public static final Client client = new Client();
    public static final Purchase purchase= new Purchase();
    public static ApprovalResult result = new ApprovalResult();

    public static void initiate(){
        createClient();
        approvalSystem();
    }

    public static void createClient (){
        client.setId(1l);
        client.setName("João Fulano");
        client.setScore(700d);
        client.setCreditMax(new BigDecimal(30_000));
        client.setDebt(false);

        
    }
    
    private static void approvalSystem() {

        ApprovalHandler seller = new Seller(client);
        ApprovalHandler manager = new Manager(client);
        ApprovalHandler director = new Director(client);


        seller.setNext(manager);
        manager.setNext(director);

        result = seller.approve(client, result);

        if (result.isApproved()){
            transactionApproved();
            System.out.println("Compra aprovada");
        } else{
            System.out.println("Compra não aprovada");
        }
    }

    public static void transactionApproved(){
       
        purchase.setId(1l);
        purchase.setClientId(client.getId());
        purchase.setPurchaseValue(new BigDecimal(1000.0));
        purchase.setDateTime(LocalDateTime.now());
        purchase.setStatusPayment(true);
        purchase.setApprovedBy(result.getApprovedBy());

        toStringTransaction();
    }

    public static void toStringTransaction(){
        System.out.println(purchase.toString());
    }
}
