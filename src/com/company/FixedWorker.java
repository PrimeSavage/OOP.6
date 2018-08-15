package com.company;

public class FixedWorker extends Worker {
    String missedDays;
    FixedWorker(){

    }

    public String getMissedDays() {
        return missedDays;
    }

    public void setMissedDays(String missedDays) {
        this.missedDays = missedDays;
    }

    FixedWorker(int id, double pay, String name, String missedDays){
        super(id, pay, name);
        this.missedDays = missedDays;
    }

    @Override
    public String toString() {
        return "FixedWorker{" + super.getId() + "|" + super.getName() + "|" + super.getPay() +
                " missedDays=" + missedDays +
                '}';
    }
}
