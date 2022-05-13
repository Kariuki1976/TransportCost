import java.util.Scanner;

public class shippingCost {
    public static void main(String[] args){
        getShippingCost("weight");
        getShippingCost("distance");
        getShippingCost("pricing");
    }
    public static void getShippingCost(String cost){
        Scanner shippingCost = new Scanner(System.in);
        Integer yourCost;

        System.out.println("What did it cost you " + cost + "?");
        yourCost = shippingCost.nextInt();

        System.out.println("It costed:" + yourCost + " " + "for" + " " + cost + ".");

    }
}
