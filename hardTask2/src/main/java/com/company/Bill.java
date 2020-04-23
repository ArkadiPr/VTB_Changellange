package com.company;

public class Bill {

    private int id;
    private String numberOfBill;
    private int moneyCount;

    public Bill(int id, String numberOfBill, int moneyCount) {
        this.id = id;
        this.numberOfBill = numberOfBill;
        this.moneyCount = moneyCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfBill() {
        return numberOfBill;
    }

    public void setNumberOfBill(String numberOfBill) {
        this.numberOfBill = numberOfBill;
    }

    public int getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(int moneyCount) {
        this.moneyCount = moneyCount;
    }

    @Override
    public String toString() {
        return  numberOfBill;
    }
}
