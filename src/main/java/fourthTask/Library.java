package fourthTask;

public class Library {

    public static void main(String[] args) {

        Book[] books = {
                new Book("1984", "Оруэлл", 1, 328),
                new Book("Война и мир", "Толстой"),
                new Book("Гарри Поттер", "Роулинг", 3)
        };

        Reader reader = new Reader();

        Book book = reader.choiceBook(books);
        reader.readBook(book);
        reader.rateBook(book);
    }
}
