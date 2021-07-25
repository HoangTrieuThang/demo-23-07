package com.OCG.QAF01;


import java.util.*;

public class MainProducts {


    public static void main(String[] args) {


        Product product0 = new Product("POLARIZED FISHING GLASSES", "Green", (float) 69.99, 1);
        Product product1 = new Product("TWO PIECE SWIMSUIT", "4-Black", (float) 27.99, 1);
        Product product2 = new Product("RISEADO SEXY PUSH UP BIKINIS", "C0756", (float) 29.99, 1);
        Product product3 = new Product("SEXY SOLID BIKINI SET", "Pink", (float) 27.99, 1);
        Product product4 = new Product("SHIRT", null, (float) 10.00, 1);
        Product product5 = new Product("HIRIGIN SEXY THONG BIKINI SET", "A WITHE", (float) 24.99, 1);

        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(product0);
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);

        HashMap<String, Product> productInCart = new HashMap<>();
        //San pham co san trong gio hang
        productInCart.put("POLARIZED FISHING GLASSES", product0);
        //add them 3 san pham
//        productInCart.put("TWO PIECE SWIMSUIT", product1);
//        productInCart.put("RISEADO SEXY PUSH UP BIKINIS", product2);
//        productInCart.put("SEXY SOLID BIKINI SET", product3);
        product0.setQuantity(product0.quantity+3);
        // Giam so luong gio hang con 2
        productInCart.remove("SEXY SOLID BIKINI SET");
        productInCart.remove("TWO PIECE SWIMSUIT");
        productInCart.remove("SHIRT");
        //them moi san pham khac
        productInCart.put("SHIRT", product4);
        productInCart.put("HIRIGIN SEXY THONG BIKINI SET", product5);


        if (productInCart.isEmpty()){
            System.out.println("\n" + "There are no products in your cart ");
        }else {
            for (Map.Entry entry :productInCart.entrySet() ){
                System.out.println(entry.getKey()+" =" + entry.getValue());
            }
        }

    }
}
