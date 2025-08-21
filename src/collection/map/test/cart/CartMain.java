package collection.map.test.cart;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        //맵에 키로 들어가는 것은 해쉬랑 이퀄스를 꼭 구현해줘야한다
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();
        cart.add(new Product("사과", 1000), 2);
        cart.printAll();
        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
    }

}
