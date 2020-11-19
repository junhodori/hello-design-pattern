package pattern.behavioral.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        /**
         * 이터레이터 패턴을 사용하게 되면
         * 집합 내부에서 어떤식으로 일이 처리되는지 알 필요 없이 집합체 안의 모든 항목에 접근할 수가 있다.
         *
         * 이미 자바 컬렉션 프레임웍에서 요소들을 읽어 들일때 표준으로 되어있다
         */
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
