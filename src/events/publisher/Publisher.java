package events.publisher;

import events.listeners.Observer;

import java.util.List;

public interface Publisher {
    void add(Observer observer);
    void remove(Observer observer);
    void notify(List<Observer> observers);
}