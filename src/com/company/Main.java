package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList();
        Worker wrk = new Worker();
//        workers.add(new Worker());
//        workers.add(new Worker(2, 2000, "Vasya"));
//        workers.add(new FixedWorker(3, 3000, "Artyom", "5"));
//        workers.add(new HourlyWorker(4, 5000, "Vitek", 8));
//        System.out.println(workers.toString());
        Scanner in = new Scanner(System.in);
        int choose;
        int fixedOrHourly;
        System.out.println("Введите 1");
        while (true){
            choose = in.nextInt();
            switch (choose){
            case 1:
                System.out.println("Введите номер");
                wrk.setId(in.nextInt());
                System.out.println("Введите имя");
                wrk.setName(in.next());
                System.out.println("Введите зарплату");
                wrk.setPay(in.nextDouble());
                System.out.println("Если у сотрудника почасовая зарплата, введите 1 , если фиксированная - 2");
                fixedOrHourly = in.nextInt();
                if(fixedOrHourly == 1){
                    HourlyWorker hrl = new HourlyWorker();
                    System.out.println("Введите кол-во часов");
                    hrl.setHours(in.nextInt());
                workers.add(new HourlyWorker(wrk.getId(), wrk.getPay(), wrk.getName(), hrl.getHours()));}
                else if(fixedOrHourly == 2){
                    FixedWorker fxd = new FixedWorker();
                    System.out.println("Введите кол-во пропущеннх дней");
                    fxd.setMissedDays(in.next());
                    workers.add(new FixedWorker(wrk.getId(), wrk.getPay(), wrk.getName(), fxd.getMissedDays()));
                }
                System.out.println("1 - продолжить ввод  2 - выйти");
                break;
                case 2:
                    System.out.println(workers.toString());
                    System.exit(0);
            }
        }
    }
}
