package pattern.behavioral.observer;

public class SubscriberB implements Observer {
    public SubscriberB(Publisher publisher) {
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        System.out.println("[B] " + title + " : " + news);
    }
}
