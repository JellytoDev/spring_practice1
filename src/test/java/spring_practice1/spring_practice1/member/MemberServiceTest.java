package spring_practice1.spring_practice1.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring_practice1.spring_practice1.AppConfig;
import spring_practice1.spring_practice1.members.Grade;
import spring_practice1.spring_practice1.members.Member;
import spring_practice1.spring_practice1.members.MemberService;
import spring_practice1.spring_practice1.members.MemberServiceImpl;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
