package bll;

import dal.MySQLBookDAO;
import dto.Book;

import java.util.List;

public class BookBO {
    MySQLBookDAO mySQLBookDAO;

    public BookBO() {
        mySQLBookDAO = new MySQLBookDAO();
    }

    public String searchBooks(String title) {
        // String title = searchField.getText();
        List<Book> books = mySQLBookDAO.searchBookByTitle(title);
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
