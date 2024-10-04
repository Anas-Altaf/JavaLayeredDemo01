package dal;

public class CSVDAOFactory implements IFactoryDAO {
    @Override
    public IBookDAO createBookDAO() {
        return new CSVBookDAO();
    }

    @Override
    public IMemberDAO createMemberDAO() {
        return new CSVMemberDAO();
    }
}
