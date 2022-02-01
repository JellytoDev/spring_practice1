package spring_practice1.spring_practice1.order;

import spring_practice1.spring_practice1.discount.DiscountPolicy;
import spring_practice1.spring_practice1.discount.FIxDiscountPolicy;
import spring_practice1.spring_practice1.members.Member;
import spring_practice1.spring_practice1.members.MemberRepository;
import spring_practice1.spring_practice1.members.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}
