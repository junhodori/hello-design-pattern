package pattern.behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        /**
         * Observer 인터페이스를 상속받은 SubscriberA 와 SubscriberB 는 관찰 역할을 하는 클래스이다
         * update()
         *
         * Publisher 인터페이스를 상속받은 PublisherNews 는 관찰 대상이 되는 클래스이다
         * add() / remove() / notifyObserver()
         *
         * PublisherNews 는 내부에 Observer 리스트를 가지고 있고,
         * SubscriberA 와 SubscriberB 객체를 생성 할때 add() 를 호출해서 구독 리스트에 추가된다
         */
        PublisherNews news = new PublisherNews();
        SubscriberA as = new SubscriberA(news);
        SubscriberB es = new SubscriberB(news);

        // PublisherNews 객체에 내용이 발행되어 notify() 가 호출되면 모든 구독 대상 Observer 의 update 가 호출된다
        news.setNewsInfo("날씨", "흐리고 비");
        news.setNewsInfo("미세먼지", "매우 좋음");


    }
}
