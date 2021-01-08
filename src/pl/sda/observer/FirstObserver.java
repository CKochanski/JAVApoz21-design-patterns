package pl.sda.observer;

public class FirstObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Operation done by first observer " + message);
    }
}
