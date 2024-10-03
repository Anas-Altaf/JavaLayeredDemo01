package dal;

import dto.Member;

import java.util.List;

public interface IMemberDAO {
    List<Member> getExpiringMembers();
}
