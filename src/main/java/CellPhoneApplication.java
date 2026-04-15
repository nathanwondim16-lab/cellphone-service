import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {

        // Creating phone object
        CellPhone phone = new CellPhone();

        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter in their serial number
        System.out.print("What is the serial number of your phone? ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        // Prompting user to enter in the model of their phone
        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());


        // Prompting user to enter in their carrier
        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());


        // Prompting user to enter in their phone number
        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());


        // Prompting user to enter in the owner of the phone
        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());



        // Printing out user's details and asking for confirmation on details.
        System.out.println("\n\nConfirm details: ");
        System.out.println("----------------------------");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());

        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        System.out.println("Does everything above look correct");
        System.out.print("Answer: Yes or No -> ");
        String confirm = scanner.nextLine();
        if(confirm.equalsIgnoreCase("yes")) {
            System.out.println("Great!");
        } else if (confirm.equalsIgnoreCase("no")) {
            System.out.println("What details did we get wrong?");
            String error = scanner.nextLine();
            System.out.println("\nSorry about that");
            System.out.println("Please restart the application and enter in the correct information again");
        } else {
            throw new IllegalArgumentException("Please only answer yes or no next time");
        }
    }
}
