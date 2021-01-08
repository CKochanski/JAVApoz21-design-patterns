package pl.sda.observer;

public class SecondObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Operation done by second observer " + message);
    }
}
