package dal;

import dto.Book;
import dto.Member;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

class DAOFascade implements IDAOFascade {
    private IBookDAO bookDAO;
    private IMemberDAO memberDAO;
    private IVendorDAO vendorDAO;

    public DAOFascade(IBookDAO bookDAO, IMemberDAO memberDAO, IVendorDAO vendorDAO) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/config.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.bookDAO = bookDAO;
        this.memberDAO = memberDAO;
        this.vendorDAO = vendorDAO;
    }

    @Override
    public List<Book> searchBookByTitle(String title) {
        return Collections.emptyList();
    }

    @Override
    public List<Book> getOverDueBooks() {
        return Collections.emptyList();
    }

    @Override
    public List<Member> getExpiringMembers() {
        return Collections.emptyList();
    }
}
