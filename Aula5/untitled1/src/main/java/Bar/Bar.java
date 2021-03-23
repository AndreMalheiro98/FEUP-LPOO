package Bar;

import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    boolean happyHour;
    List<BarObserver> observers;

    public Bar(){
        this.happyHour=false;
        observers=new ArrayList<>();
    }

    public boolean isHappyHour() {
        return this.happyHour;
    }
    public void startHappyHour() {}
    public void endHappyHour() {}

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers) {
            if (isHappyHour())
                observer.happyHourStarted(this);
            else
                observer.happyHourEnded(this);
        }
    }

}
