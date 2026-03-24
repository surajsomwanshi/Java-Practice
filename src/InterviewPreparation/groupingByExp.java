package InterviewPreparation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class groupingByExp {
    public static void main(String[] args) {
        record Product (String name,
                        String category,
                        int price) {};

        Stream<Product> products = Stream.of(
                new Product("Laptop",
                        "Electronics", 1000),
                new Product("TV",
                        "Electronics", 1500),
                new Product("Sofa",
                        "Furniture", 700),
                new Product("Table",
                        "Furniture", 300),
                new Product("Lamp",
                        "Home Decor", 50)
        );

    //Using Grouping by
//        Map<String, List<Product>> groupProductsByCategory =
//                products.collect(Collectors.groupingBy(Product::category));
//        System.out.println(groupProductsByCategory);

    //Using Aggregation
//    Map<String, Integer> totalPrice=
//            products.collect(Collectors.groupingBy(
//                    Product::category,
//                    Collectors.summingInt(Product::price)
//            ));
//        System.out.println(totalPrice);

      //using collectors.counting

//      Map<String, Long> countByCategory= products.collect(
//              Collectors.groupingBy(
//                      Product::category,
//                      Collectors.counting()
//              )
//      );
//
//        System.out.println(countByCategory);

        var partitionedProducts=
                products.collect(
                        Collectors.partitioningBy(
                                product -> product.price > 1000
                        )
                );
        System.out.println(partitionedProducts);

    }
}
