package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTestWithProductList04 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop",1200.0));
        productList.add(new Product("Mobile Phone",4200.0));
        productList.add(new Product("Tablet",2200.0));

        Consumer<Product> consumer = (Product x) -> System.out.println(x.getName() + ", " + x.getPrice()  );
        productList.forEach(consumer);


    }
}

