package spring_practice1.spring_practice1.discount;

import spring_practice1.spring_practice1.members.Member;

public interface DiscountPolicy {
    /**
     * @param member
     * @param price
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);


}
