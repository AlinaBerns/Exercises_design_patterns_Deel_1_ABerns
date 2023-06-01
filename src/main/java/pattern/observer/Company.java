package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject{

    private List<Observer> observerList;

    public Company() {
        observerList = new ArrayList<>();
    }

    public void createNewProduct(Product product) {
        notifyObservers(product);
    }
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);

    }

    @Override
    public void notifyObservers(Product product) {
        for (Observer observer : observerList) {
            observer.update(product);
        }
    }
}
