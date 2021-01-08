package pl.sda.observer;

import lombok.SneakyThrows;

import java.util.List;

public class Subject {

    private final List<Observer> observers = List.of(new FirstObserver(), new SecondObserver());

    @SneakyThrows
    public void doSomething(String message) {
        Thread.sleep(2000L); //symulujemy ciezkie dzialanie
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
