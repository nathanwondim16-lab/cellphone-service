import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {

        // Creating phone object
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter in their serial number
        System.out.print("What is the serial number of your phone? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        // Prompting user to enter in the model of their phone
        System.out.print("What model is the phone? ");
        cellPhone1.setModel(scanner.nextLine());


        // Prompting user to enter in their carrier
        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(scanner.nextLine());


        // Prompting user to enter in their phone number
        System.out.print("What is the phone number? ");
        String number;

        while(true) {
            number = scanner.nextLine();
            if(number.matches("\\d{3}-\\d{3}-\\d{4}")) {
                cellPhone1.setPhoneNumber(number);
                System.out.println(); // New line for space
                break;
            }
            System.out.println("\nEntered in phone number using incorrect format");
            System.out.println("Format required -> xxx-xxx-xxxx");
            System.out.print("Please enter in the phone number using the correct format: ");

        }

        // Prompting user to enter in the owner of the phone
        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine());

        // Setting cellPhone2 information
        cellPhone2.setPhoneNumber("855-555-2222");
        cellPhone2.setOwner("Jake from State Farm");
        System.out.println();


        display(cellPhone1);
        display(cellPhone2);


        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone1.dial(cellPhone2.getPhoneNumber());


    }

    public static void display(CellPhone phone) {
        System.out.println("\n\n" + phone.getOwner() + "'s information: ");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        // Still working on this code so i've commented it out for now.
        /*
        // Printing out user's details and asking for confirmation on details.
        System.out.println("\n\nConfirm details: ");
        System.out.println("----------------------------");


        System.out.println("\nDoes everything above look correct");
        System.out.print("Answer: Yes or No -> ");
        String confirm = scanner.nextLine();
        if(confirm.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat!");
        } else if (confirm.equalsIgnoreCase("no")) {
            System.out.println("What details did we get wrong?");
            String error = scanner.nextLine(); // Add more code that actually uses this
            System.out.println("\nSorry about that");
            System.out.println("Please restart the application and enter in the correct information again");
        } else {
            throw new IllegalArgumentException("Please only answer yes or no next time");
        }
         */
    }

}
