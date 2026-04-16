import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) throws InterruptedException {

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
        cellPhone1.setModel(scanner.nextLine().strip().replaceAll("\\s+", " "));


        // Prompting user to enter in their carrier
        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(scanner.nextLine().strip());


        // Prompting user to enter in their phone number
        String number;
        do {
            System.out.print("Please enter in the phone number: ");
            number = scanner.nextLine().strip();
            if(number.matches("\\d{3}-\\d{3}-\\d{4}")) {
                cellPhone1.setPhoneNumber(number);
                System.out.println(); // New line for space
                break;
            }
            System.out.println("\nEntered in phone number using incorrect format");
            System.out.println("Format required -> xxx-xxx-xxxx");

        } while(true);



        // Prompting user to enter in the owner of the phone
        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine().strip().replaceAll("\\s+", " "));

        // Setting cellPhone2 information
        cellPhone2.setPhoneNumber("855-555-2222");
        cellPhone2.setOwner("Jake from State Farm");
        System.out.println();

        // Generating customer's information
        for(int i = 0; i < 100; i++) {
            System.out.print("\rGenerating customer report " + i + "% ███▒▒▒▒▒▒▒");
            Thread.sleep(35);
        }
        System.out.println("\rDone\n");


        // Displaying user's phone info
        display(cellPhone1);
        display(cellPhone2);


        // Dialing phone numbers
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        // Creating another CellPhone object after adding constructors
        CellPhone cellPhone3 = new CellPhone(2893238,"iPhone 15 Pro Max", "T-Mobile","425-849-2794","Hubert Johnson");
        display(cellPhone3);

    }

    // Displays a summary of user's phone information
    public static void display(CellPhone phone) {
        System.out.println();
        System.out.println(phone.getOwner() + "'s information: ");
        System.out.println("<---------------------------------------------->");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("<---------------------------------------------->");
    }
}