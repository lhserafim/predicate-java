package application;

import entities.Product;
import util.ProductPredicate;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Forma 1 (melhor mais enxuta)
        // predicado inline
        // removeIf recebendo um PREDICATE com expressão lambda
        list.removeIf(p -> p.getPrice() >= 100);

        // Forma 2
        // Implementando uma classe como uma interface funcional (apenas um método para ser aplicado)
        //list.removeIf(new ProductPredicate());

        // Forma 3
        // Implementando method reference estático
        // list.removeIf(Product::staticProductPredicate);

        // Forma 4
        // Usando methodo reference não estático
        //list.removeIf(Product::nonStaticProductPredicate);

        // Forma 5
        // Expressão lambda declarada
        //Predicate<Product> pred = p -> p.getPrice() >= 100.00;
        //list.removeIf(pred);


        for (Product p : list) {
            System.out.println(p);
        }

    }
}
