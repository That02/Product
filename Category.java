package org.example.Tusk3;

    class Category {
        private String name;
        private ArrayList<Product> products;

        public Category(String name) {
            this.name = name;
            products = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(product);
        }
    }