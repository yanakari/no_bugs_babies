package org.example.task1_1;

public class Car implements Drivable{
    String brand;
    String model;
    int yearofmanufacture;

    //GET
    public String getBrand(String brand) {
        return this.brand;
    }

    public String getModel(String model){
        return this.model;
    }

    public int getYearofmanufacture(int yearofmanufacture){
        return this.yearofmanufacture;
    }

    //SET
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYearofmanufacture(int yearofmanufacture){
        this.yearofmanufacture = yearofmanufacture;
    }

    @Override
    public void start(){
        System.out.println("\n" + this.brand + " " + this.model + " " + this.yearofmanufacture + " выпуска выехала из Казани");
    }

    @Override
    public void stop(){
        System.out.println(this.brand + " " + this.model + " " + this.yearofmanufacture + " выпуска остановился на трассе М-7");
    }

    @Override
    public void drive(int distance) {
        System.out.println(this.brand + " " + this.model + " " + this.yearofmanufacture + " выпуска проехала " + distance + " миль.");
    }
}

