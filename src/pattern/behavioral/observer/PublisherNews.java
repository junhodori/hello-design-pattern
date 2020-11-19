package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherNews implements Publisher {
    private List<Observer> observerList = new ArrayList<>();
    private String title;
    private String news;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(title, news);
        }
    }

    public void setNewsInfo(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObserver();
    }
}
