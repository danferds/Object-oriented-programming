package relogio;
public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second) {
        setHour(hour); 
        setMinute(minute);
        setSecond(second);
    } 

    public void setHour(int hour) {
        if(hour >= 0 && hour <= 24)
            this.hour = hour;
        else
            System.out.println("fail: hora invalida");
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 60) {
            this.minute = minute; 
        } else
            System.out.println("fail: minuto invalido");
    } 

    public void setSecond(int second) {
        if(second >= 0 && second <= 60) {
            this.second = second;
        } else
            System.out.println("fail: segundo invalido");
    }

    public int getHour() { return this.hour; }
    public int getMinute() { return this.minute; }
    public int getSecond() { return this.second; }

    public void nextSecond() {
        if(getSecond() < 59) 
            setSecond(getSecond() + 1);
        else if(getSecond() == 59) 
            setSecond(0);

        if(getMinute() == 59) {
            setMinute(0);
            this.hour++;
        }

        if(getHour() == 24)
            setHour(0);
    }   

    public String toString() {
        return String.format("%02d", getHour()) + ":" + 
               String.format("%02d", getMinute()) + ":" + 
               String.format("%02d", getSecond());
    }
}