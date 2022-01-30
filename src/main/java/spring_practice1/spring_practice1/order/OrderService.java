package spring_practice1.spring_practice1.order;

public interface OrderService {
    Order createOrder(long memberId, String itemName, int itemPrice);
}
