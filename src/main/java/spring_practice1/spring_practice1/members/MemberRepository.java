package spring_practice1.spring_practice1.members;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
