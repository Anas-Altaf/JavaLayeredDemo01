package dal;

import dto.Member;

import java.util.Collections;
import java.util.List;

public class CSVMemberDAO implements IMemberDAO {
    @Override
    public List<Member> getExpiringMembers() {
        return Collections.emptyList();
    }
}
