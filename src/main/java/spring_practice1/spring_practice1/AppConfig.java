package spring_practice1.spring_practice1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_practice1.spring_practice1.discount.FIxDiscountPolicy;
import spring_practice1.spring_practice1.members.MemberService;
import spring_practice1.spring_practice1.members.MemberServiceImpl;
import spring_practice1.spring_practice1.members.MemoryMemberRepository;
import spring_practice1.spring_practice1.order.OrderService;
import spring_practice1.spring_practice1.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FIxDiscountPolicy());
    }


}