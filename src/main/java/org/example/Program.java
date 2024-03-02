package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {

        BaseEmployee be = new Freelancer("Иванов", "Петр" , "программист",500);
        BaseEmployee ba = new Freelancer("Егоров", "Егор", "Инженер", 550);
        BaseEmployee bt = new Worker("Громов", "Антон", "Слесарь", 50000);

        ArrayList<BaseEmployee> Employee = new ArrayList<>();

        Employee.add(be);
        Employee.add(ba);
        Employee.add(bt);

        for (BaseEmployee ob: Employee){
            System.out.println(ob);
        }
    }
}