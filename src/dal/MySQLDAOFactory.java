package dal;

public class MySQLDAOFactory implements IFactoryDAO {
    @Override
    public IBookDAO createBookDAO() {
        return new MySQLBookDAO();
    }

    @Override
    public IMemberDAO createMemberDAO() {
        return new MySQLMemberDAO();
    }
}
