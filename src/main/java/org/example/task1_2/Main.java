package org.example.task1_2;


//Управление списком студентов
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Петя", "001");
        Student student3 = new Student("Катя");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        studentManager.removeStudent("id_Катя");

        System.out.print(studentManager.getStudents());
    }
}
