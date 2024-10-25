package org.example.task1_1;

public class Student implements Printable {
    String name;
    int gradeBookNumber;
    double avgScore;

    //GET
    public String getName(String name){
        return this.name;
    }

    public int getGradeBookNumber(int gradeBookNumber) {
        return this.gradeBookNumber;
    }

    public double getAvgScore(double avgScore){
        return this.gradeBookNumber;
    }

    // SET
    public void setName(String name){
        this.name = name;
    }

    public void setGradeBookNumber(int gradeBookNumber){
        this.gradeBookNumber = gradeBookNumber;
    }

    public void setAvgScore(double avgScore){
        this.avgScore = avgScore;
    }

    @Override
    public void print() {
        System.out.println("\nИмя " + this.name + "\nНомер зачетки " + this.gradeBookNumber + "\nСредний балл" + this.avgScore);
    }
}
