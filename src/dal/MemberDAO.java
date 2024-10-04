package dal;

import dto.Member;

import java.util.Collections;
import java.util.List;

public class MemberDAO implements IMemberDAO {
    @Override
    public List<Member> getExpiringMembers() {
        return Collections.emptyList();
    }
}
