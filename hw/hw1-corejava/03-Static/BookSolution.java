import java.util.List;
import java.util.ArrayList;

class BookSolution {
    public static void main(String[] args) {
    }

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("1", "111", "name1", "author1", "2022/01/01"));
        books.add(new Book("2", "222", "name2", "author2", "2022/02/02"));
        books.add(new Book("3", "333", "name3", "author3", "2022/03/03"));
        books.add(new Book("4", "444", "name4", "author4", "2022/04/04"));
        books.add(new Book("5", "555", "name5", "author5", "2022/05/05"));
    }
}

class Book {
    private String id, isbn, name, author, publishDate;

    public Book(String id, String isbn, String name, String author, String publishDate) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }
}
