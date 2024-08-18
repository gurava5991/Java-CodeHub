package Java8Features.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    Product(int id , String  name , float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionWithComparator {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Dell",25000f));
        productList.add(new Product(2,"HP",30000f));
        productList.add(new Product(3,"Mac",50000f));

        System.out.println("sorting by the names");
        Collections.sort(productList,(p1 , p2) -> p1.name.compareTo(p2.name));
        for(Product product : productList){
            System.out.println(product.id+" "+product.name+" "+product.price);
        }



    }
}
