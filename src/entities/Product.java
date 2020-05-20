package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Forma 3
    // criando um método estático retornando um valor booleano
    // IMPORTANTE MÉTODO ESTÁTICO trabalha com o produto que é informado via argumento
    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    }

    // Forma 4
    // com um método NÃO estático
    // Importante o método NÃO estático é da instancia, ou seja, trabalha com o próprio objeto onde eu estou
    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
