package dal;

import dto.Book;

import java.util.List;

public interface IBookDAO {
    List<Book> searchBookByTitle(String title);

    List<Book> getOverDueBooks();
}
