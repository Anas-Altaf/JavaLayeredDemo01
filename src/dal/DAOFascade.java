package dal;

import dto.Book;
import dto.Member;

import java.util.Collections;
import java.util.List;

class DAOFascade implements IDAOFascade {
    private IBookDAO bookDAO;
    private IMemberDAO memberDAO;
    private IVendorDAO vendorDAO;

    public DAOFascade(IBookDAO bookDAO, IMemberDAO memberDAO, IVendorDAO vendorDAO) {
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
