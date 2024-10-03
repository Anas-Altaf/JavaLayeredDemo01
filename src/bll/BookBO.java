package bll;

import dal.BookDAO;
import dto.Book;

import java.util.List;

public class BookBO {
    BookDAO bookDAO;

    public BookBO() {
        bookDAO = new BookDAO();
    }

    public String searchBooks(String title) {
        // String title = searchField.getText();
        List<Book> books = bookDAO.searchBooksByTitle(title);
        String result = "";
        if (books.isEmpty()) {
            result += "No books found.";
        } else {
            for (Book book : books) {
                result += book.toString() + "\n";
            }
        }
        return result;
    }
    
}
