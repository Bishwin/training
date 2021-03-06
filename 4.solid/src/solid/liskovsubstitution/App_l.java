package solid.liskovsubstitution;

import product.CharityDonation;
import product.StockType;

public class App_l {

    public static void main(String[] args) {

        /* The business requires that a charity sponsored products are available.
        Refactor CharityProduct to comply with Liskov principle */

        CharityProduct charityCola = new CharityProduct(StockType.FANTA);
        charityCola.setCharityDonation(CharityDonation.CHILDPROTECTION);
        System.out.println(charityCola.getProductSummary());

        Product_l cola = new Product_l(StockType.FANTA);
        System.out.println(cola.getProductSummary());
    }
}
