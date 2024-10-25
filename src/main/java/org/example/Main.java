package org.example;

import org.example.task2.Book;
import org.example.task2.Point;
import org.example.task2.Student;
import org.example.task2.Clock;
import org.example.task2.Car;


//просто комментарий

/**
 * тут очень длинный комментарий
 * текст просто огроменный
 * парапапам
 * хочу вкусняшку
 */

public class Main {
    public static void main(String[] args) {

        //Книга
        Book book = new Book();
        book.setName("К себе нежно");
        book.setAuthor("Ольга Примаченко");
        book.setYear(2023);
        book.display();

        //Студент
        Student student = new Student();
        student.setName("Михаил");
        student.setGradeBookNumber(45865455);
        student.setAvgScore(4.8);
        student.print();

        //Точка на плоскости
        Point point1 = new Point();
        point1.setX(7);
        point1.setY(4);
        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
        point1.moveRight();

        //Часы
        Clock time = new Clock();
        time.setHour(12);
        time.setMin(23);
        time.setSec(33);
        time.readTime();

        //Автомобиль
        Car auto = new Car();
        auto.setBrand("Лада");
        auto.setModel("Гранта");
        auto.setYearofmanufacture(2019);
        auto.start();
        auto.stop();
        auto.drive(99);

    }
}