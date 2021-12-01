package org.ogorodnik.io;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private Date date;
    private String message;
    private double amount;

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + date +
                ", message='" + message + '\'' +
                ", amount=" + amount +
                '}';
    }
}
