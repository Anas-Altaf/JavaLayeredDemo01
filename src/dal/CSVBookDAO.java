package dal;

import dto.Book;

import java.util.Collections;
import java.util.List;

public class CSVBookDAO implements IBookDAO {
    @Override
    public List<Book> searchBookByTitle(String title) {
        return Collections.emptyList();
    }

    @Override
    public List<Book> getOverDueBooks() {
        return Collections.emptyList();
    }
}
