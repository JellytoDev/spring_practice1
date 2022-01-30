package spring_practice1.spring_practice1.members;

public interface MemberService {
    void join(Member member);

    Member findMember(long memberId);
}
