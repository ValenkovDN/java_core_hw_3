
package org.example;

import java.util.ArrayList;

/**
 * Абстрактный класс сотрудник
 *
 */
public abstract class BaseEmployee {
    protected   String surname;
    protected String name;

    /**
     * Должность сотрудника
     */
    protected String post;

    /**
     * Ставка зарплаты
     */
    protected double rate;



    public BaseEmployee(String surname, String name, String post, double rate) {
        this.surname = surname;
        this.name = name;
        this.post = post;
        this.rate = rate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Расчет зарплаты
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return null;
    }
}

