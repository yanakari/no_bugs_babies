package org.example.task1_1;

public class Point implements Movable {
    private int x;
    private int y;

    //GET
    public int getX(int x){
        return this.x;
    }

    public int getY(int y){
        return this.y;
    }

    //SET
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        System.out.println("\nточка сдвинулась выше");
    }

    @Override
    public void moveDown() {
        System.out.println("точка сдвинулась ниже");
    }

    @Override
    public void moveLeft() {
        System.out.println("точка сдвинулась левее");
    }

    @Override
    public void moveRight() {
        System.out.println("точка сдвинулась правее");

    }
}
