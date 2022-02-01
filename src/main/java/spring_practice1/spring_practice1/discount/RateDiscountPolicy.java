package spring_practice1.spring_practice1.discount;

import spring_practice1.spring_practice1.members.Grade;
import spring_practice1.spring_practice1.members.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
