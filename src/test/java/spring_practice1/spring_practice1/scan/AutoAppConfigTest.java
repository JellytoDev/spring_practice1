package spring_practice1.spring_practice1.scan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_practice1.spring_practice1.AutoAppConfig;
import spring_practice1.spring_practice1.discount.DiscountPolicy;
import spring_practice1.spring_practice1.discount.RateDiscountPolicy;
import spring_practice1.spring_practice1.members.MemberService;
import spring_practice1.spring_practice1.members.MemberServiceImpl;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }

//    @Test
//    void discountPolicyScan() {
//        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
//        DiscountPolicy discountPolicy = ac.getBean(DiscountPolicy.class);
//        Assertions.assertThat(discountPolicy).isInstanceOf(RateDiscountPolicy.class);
//
//    }
}
