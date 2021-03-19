import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        ArrayList<Products> itens = new ArrayList<>();

        System.out.println("\n\nRegister a product.\nType '0' to finish the register.");

        do {
            System.out.println("\nType the product code: ");
            products.setProductCode(scanner.nextInt());
            if (products.productCode >=1 && products.productCode != 0) {
                System.out.println("Type a description to this product: ");
                products.setProductDescription(scanner.nextLine());
                scanner.nextLine();
                System.out.println("Type the value of the product: ");
                products.setValue(scanner.nextFloat());
                System.out.println("Type a quantity for this product");
                products.setQuantity(scanner.nextInt());
                itens.add(products);
                System.out.println(products);
            }
        } while (products.getProductCode() != 0);

        for(Products cart : itens) {
            System.out.println(cart);
        }
    }
}