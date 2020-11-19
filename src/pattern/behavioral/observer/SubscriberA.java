package pattern.behavioral.observer;

public class SubscriberA implements Observer {
    public SubscriberA(Publisher publisher) {
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        System.out.println("[A] " + title + " : " + news);
    }
}
