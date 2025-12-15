import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class EcommerceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Cart data
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

        while (true) {
            System.out.println("\n------- E-Commerce Platform -------");
             System.out.println("\n--Welcome User!!--");
            System.out.println("1. View Products");
            System.out.println("2. View Cart");
            System.out.println("3. My Orders");
            System.out.println("4. Customer Service");
            System.out.println("5. Exit");
            System.out.print("\nChoose your option: ");
            int n = sc.nextInt();

            switch (n) {

                case 1:
                    System.out.println("\nAvailable Products:");
                    System.out.println("1. Laptop - 39999.99");
                    System.out.println("2. Mouse - 1199.99");
                    System.out.println("3. Keyboard - 999.99");
                    System.out.println("4. USB-Drive(500GB) - 1899.99");
                    System.out.println("5. External Storage SSD(1TB) - 6999.99");
                    System.out.print("Select product: ");
                    int x = sc.nextInt();

                    System.out.print("Enter number of units: ");
                    int qty = sc.nextInt();

                    if (qty <= 0) {
                        System.out.println("Invalid quantity");
                        break;
                    }

                    switch (x) {
                        case 1:
                            cart.add("Laptop");
                            prices.add(9999.99);
                            quantities.add(qty);
                            System.out.println("\n>>Laptop added to cart");
                            break;
                        case 2:
                            cart.add("Mouse");
                            prices.add(1199.99);
                            quantities.add(qty);
                            System.out.println("\n>>Mouse added to cart");
                            break;
                        case 3:
                            cart.add("Keyboard");
                            prices.add(999.99);
                            quantities.add(qty);
                            System.out.println("\n>>nKeyboard added to cart");
                            break;
                            case 4:
                            cart.add("USB-Drive(500GB)");
                            prices.add(1899.99);
                            quantities.add(qty);
                            System.out.println("\n>>USB-Drive(500GB) added to cart");
                            break;
                            case 5:
                            cart.add("External Storage SSD(1TB)");
                            prices.add(6999.99);
                            quantities.add(qty);
                            System.out.println("\n>>External Storage SSD(1TB) added to cart");
                            break;
                        default:
                            System.out.println("\n>>Invalid product");
                    }
                    break;

                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("\nCart is empty");
                    } else {
                        double total = 0;
                        System.out.println("\nYour Cart:");
                        for (int i = 0; i < cart.size(); i++) {
                            double itemTotal = prices.get(i) * quantities.get(i);
                            System.out.println((i + 1) + ". " + cart.get(i) +
                                    " | Price: " + df.format(prices.get(i)) +
                                    " | Qty: " + quantities.get(i) +
                                    " | Total: " + df.format(itemTotal));
                            total += itemTotal;
                        }
                        System.out.println(">>Grand Total: " + df.format(total));
                    }
                    break;

                case 3:
                    System.out.println("\n>>Ohoh!!Looks like you still didn't place any order.\n>>Get start with shopping!!");
                    break;

                case 4:
                    System.out.println("\nCustomer Service: E-mail: @ecommerce.com\nContact Number: +9109900990");
                    break;

                case 5:
                    System.out.println("Thank you for shopping!");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
