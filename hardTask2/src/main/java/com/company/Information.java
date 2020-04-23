package com.company;

import java.util.Date;

public class Information {
    private Date date;
    private OperationType type;
    private int sum;
    private Bill operationUser;

    public Information(Date date, OperationType type, int sum, Bill operationUser) {
        this.date = date;
        this.type = type;
        this.sum = sum;
        this.operationUser = operationUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Bill getOperationUser() {
        return operationUser;
    }

    public void setOperationUser(Bill operationUser) {
        this.operationUser = operationUser;
    }

    @Override
    public String toString() {
        return "Date=" + date +
                ", Type=" + type +
                ", Sum=" + sum +
                ", Correspondent Bill = " + operationUser + '\n';
    }
}
