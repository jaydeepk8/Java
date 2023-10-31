import java.util.*;
interface BusTravel1
{
    void busTravel();
}
class Buses  implements BusTravel
{
    Scanner sc = new Scanner(System.in);
    String password = "1234";
    String pass;
    String ch;
    int arrivingStation=-1;
    int destination=-1;

    public void busTravel()
    {
        while (true) {
            System.out.println("\n\n____");
            System.out.println("╔╗──╔══╗╔═══╗╔══╗╔╗─╔╗");
            System.out.println("║║──║╔╗║║╔══╝╚╗╔╝║╚═╝║");
            System.out.println("║║──║║║║║║╔═╗─║║─║╔╗─║");
            System.out.println("║║──║║║║║║╚╗║─║║─║║╚╗║");
            System.out.println("║╚═╗║╚╝║║╚═╝║╔╝╚╗║║─║║");
            System.out.println("╚══╝╚══╝╚═══╝╚══╝╚╝─╚╝");
            System.out.println("____");

            System.out.println("Enter Login to continue:");
            pass = sc.next();

            if (!pass.equals(password)) {
                System.out.println("Incorrect password. Please try again.");
                continue;
            } else {
                break;
            }
        }
        do {
            int[][] prices = {{0, 200, 500, 1000, 1500, 2000},
                    {200, 0, 300, 800, 1300, 1800},
                    {500, 300, 0, 700, 1200, 1700},
                    {1000, 800, 700, 0, 500, 1000},
                    {1500, 1300, 1200, 500, 0, 700},
                    {2000, 1800, 1700, 1000, 700, 0}};

            String[] cities = {"Mumbai", "Pune", "Nagpur", "Satara", "Sangli", "Nashik"};

            System.out.println("Arriving Stations:");
            for (int i = 0; i < cities.length; i++) {
                System.out.println((i + 1) + ". " + cities[i]);
            }



            while (arrivingStation < 0 || arrivingStation > 5) {
                System.out.print("Enter your Arriving Station : ");
                arrivingStation = sc.nextInt() - 1;
                if (arrivingStation  < 0 || arrivingStation  > 5) {
                    System.out.println("Invalid input. Please enter a number between 1-6.");
                }
            }


            System.out.println("Destinations:");
            for (int i = 0; i < cities.length; i++) {
                if (i != arrivingStation) {
                    System.out.println((i + 1) + ". " + cities[i]);
                }
            }

            while (destination < 0 || destination > 5) {
                System.out.print("Enter your Destination Station: ");
                destination = sc.nextInt() - 1;

                if (destination < 0 || destination > 5) {
                    System.out.println("Invalid input. Please enter a number between 1-6.");
                }
            }

            if (arrivingStation == destination) {
                System.out.println("Arriving and destination points cannot be same.");
                System.exit(0);
            }

            System.out.println("We wish your journey goes fine from " + cities[arrivingStation] + " to " + cities[destination]);
            int cost = prices[arrivingStation][destination];
            System.out.println("Your payment from " + cities[arrivingStation] + " to " + cities[destination] + " is: Rs. " + cost);

            System.out.println("\nWant more tickets ?");
            System.out.println("Type Y/y for Yes and N/n for No");
            ch = sc.next();
        }while(Objects.equals(ch, "Y") || Objects.equals(ch, "y"));
    }
}
public class Bus2 {
    public static void main(String[] args) {

        Buses t = new Buses();
        t.busTravel();
    }

}
