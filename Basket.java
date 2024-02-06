package org.example.Tusk3;

class Basket {
    private ArrayList<Product> purchasedProducts;

    public Basket() {
        purchasedProducts = new ArrayList<>();
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void removeProduct(Product product) {
        purchasedProducts.remove(product);
    }
}
