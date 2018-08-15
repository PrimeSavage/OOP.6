package com.company;

public class Worker {
    private int id;
    private double pay;
    private String name;

    Worker(){
    }
    Worker(int id, double pay, String name){
        this.id = id;
        this.name = name;
        this.pay = pay;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                '}';
    }
}
