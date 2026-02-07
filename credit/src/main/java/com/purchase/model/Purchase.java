package com.purchase.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Purchase {
    
    private Long id;

    private Long clientId;

    private BigDecimal purchaseValue;

    private Boolean statusPayment;

    private LocalDateTime dateTime;

    private String approvedBy;

    public Purchase(Long id, Long clientId, BigDecimal purchaseValue, Boolean statusPayment, LocalDateTime dateTime,
            String approvedBy) {
        this.id = id;
        this.clientId = clientId;
        this.purchaseValue = purchaseValue;
        this.statusPayment = statusPayment;
        this.dateTime = dateTime;
        this.approvedBy = approvedBy;
    }

    public Purchase() {
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public BigDecimal getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(BigDecimal purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public Boolean getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(Boolean statusPayment) {
        this.statusPayment = statusPayment;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
        result = prime * result + ((purchaseValue == null) ? 0 : purchaseValue.hashCode());
        result = prime * result + ((statusPayment == null) ? 0 : statusPayment.hashCode());
        result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
        result = prime * result + ((approvedBy == null) ? 0 : approvedBy.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Purchase other = (Purchase) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (clientId == null) {
            if (other.clientId != null)
                return false;
        } else if (!clientId.equals(other.clientId))
            return false;
        if (purchaseValue == null) {
            if (other.purchaseValue != null)
                return false;
        } else if (!purchaseValue.equals(other.purchaseValue))
            return false;
        if (statusPayment == null) {
            if (other.statusPayment != null)
                return false;
        } else if (!statusPayment.equals(other.statusPayment))
            return false;
        if (dateTime == null) {
            if (other.dateTime != null)
                return false;
        } else if (!dateTime.equals(other.dateTime))
            return false;
        if (approvedBy == null) {
            if (other.approvedBy != null)
                return false;
        } else if (!approvedBy.equals(other.approvedBy))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Purchase [id=" + id + ", clientId=" + clientId + ", purchaseValue=" + purchaseValue + ", statusPayment="
                + statusPayment + ", dateTime=" + dateTime + ", approvedBy=" + approvedBy + "]";
    }

}
