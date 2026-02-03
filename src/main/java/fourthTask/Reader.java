package fourthTask;

import java.util.Random;

public class Reader {

    private Random random = new Random();

    public Book choiceBook(Book[] books) {
        return books[random.nextInt(books.length)];
    }

    public void readBook(Book book) {
        System.out.println("Текущая книга: " + book);
    }

    public void rateBook(Book book) {
        int score = 0;

        score += book.getName() != null ? book.getName().length() : random.nextInt(10);
        score += book.getAuthor() != null ? book.getAuthor().length() : random.nextInt(10);
        score += book.getPageCount() != 0 ? book.getPageCount() : random.nextInt(10);
        score -= book.getSerialNum() != 0 ? book.getSerialNum() : random.nextInt(10);

        System.out.println("Оценка книги \"" + book.getName() + "\": " + score);
    }
}
