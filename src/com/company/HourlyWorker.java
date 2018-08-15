package com.company;

public class HourlyWorker extends Worker {
    private int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    HourlyWorker(int id, double pay, String name, int hours){
        super(id, pay, name);
        this.hours = hours;
    }
    HourlyWorker(){}

    @Override
    public String toString() {
        return "HourlyWorker {" + super.getId() + "|" + super.getName() + "|" + super.getPay() +
                " hours=" + hours +
                '}';
    }
}
