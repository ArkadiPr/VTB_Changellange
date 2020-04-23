package com.company;

import java.util.Date;

public class Installation {

    private int id;
   private Date date;
   private Bill writeOff;
   private Bill enrollment;
   private int sum;

    public Installation(int id, Date date, Bill writeOff, Bill enrollment, int sum) {
        this.id = id;
        this.date = date;
        this.writeOff = writeOff;
        this.enrollment = enrollment;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Bill getWriteOff() {
        return writeOff;
    }

    public void setWriteOff(Bill writeOff) {
        this.writeOff = writeOff;
    }

    public Bill getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Bill enrollment) {
        this.enrollment = enrollment;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
