package org.example;

public class Worker extends BaseEmployee{
    /**
     * Среднемесячная зарплата
     */
    double salary;

    public Worker(String surname, String name, String post, double rate) {
        super(surname, name, post, rate);
    }

    /**
     * Расчет среднемесячной зарплаты
     * @return
     */
    @Override
    public double calculateSalary() {
        salary = rate;
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
