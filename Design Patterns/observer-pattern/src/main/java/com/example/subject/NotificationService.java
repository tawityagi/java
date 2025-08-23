package com.example.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.observer.Observer;

public class NotificationService implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    // Business logic example
    public void newNotification(String message) {
        System.out.println("New Notification: " + message);
        notifyObservers(message);
    }
}

