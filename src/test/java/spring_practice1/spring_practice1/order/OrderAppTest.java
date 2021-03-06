package spring_practice1.spring_practice1.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring_practice1.spring_practice1.AppConfig;
import spring_practice1.spring_practice1.members.Grade;
import spring_practice1.spring_practice1.members.Member;
import spring_practice1.spring_practice1.members.MemberService;
import spring_practice1.spring_practice1.members.MemberServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class OrderAppTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}