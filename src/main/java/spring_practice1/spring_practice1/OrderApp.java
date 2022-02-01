package spring_practice1.spring_practice1;

import spring_practice1.spring_practice1.members.Grade;
import spring_practice1.spring_practice1.members.Member;
import spring_practice1.spring_practice1.members.MemberService;
import spring_practice1.spring_practice1.members.MemberServiceImpl;
import spring_practice1.spring_practice1.order.Order;
import spring_practice1.spring_practice1.order.OrderService;
import spring_practice1.spring_practice1.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order.toString());

    }
}

