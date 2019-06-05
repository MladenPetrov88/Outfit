import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if (10 <= temp && temp <= 18) {
            if (daytime.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (daytime.equals("Afternoon")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (daytime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        if (18 < temp && temp <= 24) {
            if (daytime.equals("Morning")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (daytime.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (daytime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }
        if (temp >= 25) {
            if (daytime.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (daytime.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if (daytime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temp, outfit, shoes);

    }
}
