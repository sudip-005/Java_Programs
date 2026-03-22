import java.util.*;

class Item {

    int code;
    double price;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] item = new Item[3];
        double total = 0;

        for(int i=0;i<3;i++) {

            item[i] = new Item();

            System.out.print("Enter Code: ");
            item[i].code = sc.nextInt();

            System.out.print("Enter Price: ");
            item[i].price = sc.nextDouble();

            total += item[i].price;
        }

        System.out.println("\nCode   Price");

        for(Item i : item) {
            System.out.println(i.code + "   " + i.price);
        }

        System.out.println("Total Price = " + total);
    }
}
