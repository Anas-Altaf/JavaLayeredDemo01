package dal;

public class CSVDAOFactory implements IFactoryDAO {
    @Override
    public IBookDAO createBookDAO() {
        return new BookDAO();
    }

    @Override
    public IMemberDAO createMemberDAO() {
        return new MemberDAO();
    }
}
