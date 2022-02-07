package spring_practice1.spring_practice1.order;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring_practice1.spring_practice1.annotation.MainDiscountPolicy;
import spring_practice1.spring_practice1.discount.DiscountPolicy;
import spring_practice1.spring_practice1.discount.FIxDiscountPolicy;
import spring_practice1.spring_practice1.members.Member;
import spring_practice1.spring_practice1.members.MemberRepository;
import spring_practice1.spring_practice1.members.MemoryMemberRepository;

@Component

public class OrderServiceImpl implements OrderService {

    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}
