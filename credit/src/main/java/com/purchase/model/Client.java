package com.purchase.model;

import java.math.BigDecimal;

public class Client {

    private Long id;

    private String name;

    private Double score;

    private BigDecimal creditMax;

    private Boolean debt;

    public Client() {
    }

    public Client(Long id, String name, Double score, BigDecimal creditMax, Boolean debt) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.creditMax = creditMax;
        this.debt = debt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public BigDecimal getCreditMax() {
        return creditMax;
    }

    public void setCreditMax(BigDecimal creditMax) {
        this.creditMax = creditMax;
    }

    public Boolean getDebt() {
        return debt;
    }

    public void setDebt(Boolean debt) {
        this.debt = debt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((score == null) ? 0 : score.hashCode());
        result = prime * result + ((creditMax == null) ? 0 : creditMax.hashCode());
        result = prime * result + ((debt == null) ? 0 : debt.hashCode());
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
        Client other = (Client) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (score == null) {
            if (other.score != null)
                return false;
        } else if (!score.equals(other.score))
            return false;
        if (creditMax == null) {
            if (other.creditMax != null)
                return false;
        } else if (!creditMax.equals(other.creditMax))
            return false;
        if (debt == null) {
            if (other.debt != null)
                return false;
        } else if (!debt.equals(other.debt))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", score=" + score + ", creditMax=" + creditMax + ", debt="
                + debt + "]";
    }

    
}
