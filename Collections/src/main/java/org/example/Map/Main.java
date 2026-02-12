package org.example.Map;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.addProduct(new Product(1, "Laptop", 999.99, "Dell", "Electronics", 4, 10));
        pm.addProduct(new Product(2, "Smartphone", 499.99, "Samsung", "Electronics", 5, 15));
        pm.addProduct(new Product(3, "Headphones", 199.99, "Sony", "Audio", 4, 20));

        System.out.println("Products:");
        pm.printProducts();

        System.out.println("\nSorting by price (Descending) using Comparable:");
        pm.mapToListSortByPriceComparable();

        System.out.println("\nSorting by price (Ascending):");
        pm.mapToListSortByPriceAsc();

        System.out.println("\nSorting by rating (Ascending):");
        pm.mapToListSortByRatingAsc();

        System.out.println("\nSorting by discount (Ascending):");
        pm.mapToListSortByDiscountAsc();

        System.out.println("\nFilter by brand 'Dell':");
        pm.filterByBrand("Dell");

        System.out.println("\nFilter by category 'Electronics':");
        pm.filterByCategory("Electronics");

        System.out.println("\nFilter by price range 200-600:");
        pm.filterByPriceRange(200, 600);

        System.out.println("\nMinimum price product:");
        pm.minPrice();

        System.out.println("\nRemoving product with ID 2:");
        pm.removeProduct(2);
        pm.printProducts();
    }
}
