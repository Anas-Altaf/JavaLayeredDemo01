package dal;

public interface IFactoryDAO {
    IBookDAO createBookDAO();

    IMemberDAO createMemberDAO();
}
