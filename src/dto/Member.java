package dto;

import dal.IMemberDAO;

import java.util.Collections;
import java.util.List;

public class Member implements IMemberDAO {
    @Override
    public List<Member> getExpiringMembers() {
        return Collections.emptyList();
    }
}
