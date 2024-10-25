package org.example.task2;

public class Clock implements Readable {
    int hour;
    int min;
    int sec;

    //GET
    public int getHour(int Hour){
        return this.hour;
    };

    public int getMin(int Min) {
        return this.min;
    }

    public int getSec(int Sec) {
        return this.sec;
    }

    //SET
    public void setHour(int Hour){
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public void readTime() {
        System.out.printf("\nТекущее время: %02d:%02d:%02d\n", hour, min, sec);
    }
}
