package com.purchase.chain;

import java.math.BigDecimal;

import com.purchase.model.Client;

public class Seller implements ApprovalHandler{

    private ApprovalHandler next; 
    private Client client;

    public Seller(Client client) {
        this.client = client;
    }
    @Override
    public void setNext(ApprovalHandler next){
        this.next = next;
    }
     public static Boolean validCredit(Client client){
        var scoreMin = 800;
        var creditMin = 60_000;
        return client.getScore()>= scoreMin  &&!client.getDebt() &&
         client.getCreditMax().compareTo(new BigDecimal(creditMin)) > 0;
    }
    @Override
    public ApprovalResult  approve (Client client, ApprovalResult result){
        if (validCredit(client)){
            result.setApproved(true);
            result.setApprovedBy("seller");
            result.setReason(null);
            return result;
        } else if(next != null){
            return next.approve(client, result);
        } 
        result.setApproved(false);
        result.setReason("");
        return result;
    }



//     public void handleRequest(Request request) {
//         if (request.getPriority() == Priority.BASIC) {
//             System.out.println("Level 1 Support handled the request.");
//         } else if (nextHandler != null) {
//             nextHandler.handleRequest(request);
//         }
//     }
// }


}
