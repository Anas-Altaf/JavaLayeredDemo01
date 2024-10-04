package dal;

public class SQLDAOFactory implements IFactoryDAO {
    @Override
    public IBookDAO createBookDAO() {
        return new BookDAO();
    }

    @Override
    public IMemberDAO createMemberDAO() {
        return new MemberDAO();
    }
}
