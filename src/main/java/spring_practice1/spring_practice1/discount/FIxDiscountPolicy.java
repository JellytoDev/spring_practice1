package spring_practice1.spring_practice1.discount;


import spring_practice1.spring_practice1.members.Grade;
import spring_practice1.spring_practice1.members.Member;

public class FIxDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
