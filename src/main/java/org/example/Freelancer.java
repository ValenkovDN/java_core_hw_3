package org.example;

public class Freelancer extends BaseEmployee{

    /**
     * Среднемесячная зарплата
     */
    double salary;


    public Freelancer(String surname, String name, String post, double rate) {
        super(surname, name, post, rate);
    }

    /**
     * Расчет среднемесячной зарплаты
     * @return
     */
    @Override
    public double calculateSalary() {
        salary = rate * 20.8 * 8;
        return salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: {" +
                "Фамилия - " + surname + "\'" +
                ", Имя - " + name + "\'" +
                ", Должность - " + post + "\'" +
                ", Ставка - " + rate + "\'" +
                ", Среднемесячный оклад - " + calculateSalary() + "\'" +
                '}';
    }
}
