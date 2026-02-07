package com.purchase.chain;

public class ApprovalResult {
    private boolean approved;
    private String approvedBy;
    private String reason;
    
    public boolean isApproved() {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    public String getApprovedBy() {
        return approvedBy;
    }
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
   



}
