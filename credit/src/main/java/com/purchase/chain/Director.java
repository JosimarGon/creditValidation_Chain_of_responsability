package com.purchase.chain;

import java.math.BigDecimal;

import com.purchase.model.Client;

public class Director implements ApprovalHandler {
    
    private Client client;

    public Director(Client client) {
        this.client = client;
    }
    @Override
    public void setNext(ApprovalHandler next) {
    }
    public static Boolean validCredit(Client client){
        var scoreMin = 600;
        var creditMin = 25_000;
        return client.getScore()>= scoreMin  && !client.getDebt() &&
         client.getCreditMax().compareTo(new BigDecimal(creditMin)) > 0;
    }
    @Override
    public ApprovalResult approve (Client client, ApprovalResult result){
        if (validCredit(client)){  
            result.setApproved(true);
            result.setApprovedBy("director");
            result.setReason(null);
            return result;   
        } 
            result.setApproved(false);
            result.setReason(null);
            return result;

    }
}
