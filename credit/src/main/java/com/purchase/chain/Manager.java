package com.purchase.chain;

import java.math.BigDecimal;

import com.purchase.model.Client;

public class Manager implements ApprovalHandler{
    private ApprovalHandler next;
    private Client client;

    public Manager(Client client) {
        this.client = client;
    }

    @Override
    public void setNext(ApprovalHandler next) {
        this.next = next;
    }
    public static Boolean validCredit(Client client){
        var scoreMin = 700;
        var creditMin = 50_000;
        return client.getScore()>= scoreMin  && !client.getDebt() &&
         client.getCreditMax().compareTo(new BigDecimal(creditMin)) > 0;
    }

    @Override
    public ApprovalResult approve (Client client, ApprovalResult result){
        if (validCredit(client)){
            result.setApproved(true);
            result.setApprovedBy("manager");
            result.setReason(null);
            return result;
        } else if(next != null){
            return next.approve(client, result);
        }
            result.setApproved(false);
            result.setReason(null);
            return result;
    }
}
