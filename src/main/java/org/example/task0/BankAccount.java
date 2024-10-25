package org.example.task0;

//шаблон для создания объекта
public class BankAccount implements Printable{
    private String accountNumber;
    private int balance;

    //сеттера
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //геттеры
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void print() {
        System.out.println("Баланс аккаунта " + this.balance);
    }
}
