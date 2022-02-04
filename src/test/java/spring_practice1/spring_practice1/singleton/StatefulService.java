package spring_practice1.spring_practice1.singleton;

public class StatefulService {

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }
    // 바로 반환하도록 해야지 무상태가 유지된다.

    public int getPrice() {
        return price;
    }
}
