import java.util.Scanner;
/**
 * Created by peter on 2-10-17.
 */
public class Client {
    public static void main(String[] args) {
        double cost = 0.0;
        PackageFactory packageFactory = new PackageFactory();
        Package uPackage = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to POSTNL sorting centrum");

        boolean done = false;
        while(!done) {
            System.out.println("Enter the next type of package (small, big) (press q to finish entering packages):");
            String input = userInput.nextLine();
            if (input.equals("small")) {
                uPackage = packageFactory.CreatePackage("small");
                cost += uPackage.getCost();
                System.out.println("Inserted a " + uPackage.getPackageType());
                System.out.println("Cost of package:" + uPackage.getCost());
                System.out.println("Total cost so far: " + cost);

            }
            else if (input.equals("big")) {
                uPackage = packageFactory.CreatePackage("big");
                cost += uPackage.getCost();
                System.out.println("Inserted a " + uPackage.getPackageType());
                System.out.println("Cost of package:" + uPackage.getCost());
                System.out.println("Total cost so far: " + cost);

            }
            else if (input.equals("q") || input.equals("quit")){
                System.out.println("Total cost is: " + cost);
                System.out.println("Please pay using coins");
                done = true;

            }
            else {
                System.out.println("Command not recognized, please use small, big, q or quit");
            }
        }

    }
}
