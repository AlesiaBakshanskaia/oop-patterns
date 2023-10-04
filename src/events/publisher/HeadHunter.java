package events.publisher;

import events.listeners.Observer;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Publisher{
    List<Observer> observers;
    List<String> vacansies;

    public HeadHunter() {
        observers = new ArrayList<>();
        vacansies = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notify(List<Observer> observers) {
        for(Observer observer : observers) {
            observer.handlEvent(vacansies);
        }

    }
    public void addVacancy(String vacancy) {
        vacansies.add(vacancy);
        notify(observers);
    }
    public void removeVacancy(String vacancy) {
        vacansies.remove(vacancy);
        notify(observers);
    }
}
