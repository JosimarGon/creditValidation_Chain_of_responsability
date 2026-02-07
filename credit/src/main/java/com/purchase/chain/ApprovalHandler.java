package com.purchase.chain;

import com.purchase.model.Client;

interface ApprovalHandler {
    void setNext(ApprovalHandler next);
    ApprovalResult  approve (Client Client, ApprovalResult result);
}
