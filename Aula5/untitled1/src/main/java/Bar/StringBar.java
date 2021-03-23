package Bar;

import Bar.Bar;

public class StringBar extends Bar {

    public StringBar(){
        super();
    }

    @Override
    public boolean isHappyHour() {
        return this.happyHour;
    }

    @Override
    public void startHappyHour() {
        this.happyHour=true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHour=false;
        this.notifyObservers();
    }
}
