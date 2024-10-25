package org.example.task1_1;

public class Clock implements Readable {
    int hour;
    int min;
    int sec;

    //GET
    public int getHour(){
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }

    //SET
    public void setHour(int hour){
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

    public void tick() {
        this.sec++;
        if (this.sec == 60) {
            this.sec = 0;
            this.min++;
            if (this.min == 60) {
                this.min = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }
    }
}
