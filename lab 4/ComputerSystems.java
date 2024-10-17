

package computerdetails;
import java.util.Scanner;

class ComputerSystem {
    // Attributes of the computer system
    private String systemName;
    private String systemType;
    private String processor;
    private int ram;  // in GB
    private int hardDisk;  // in GB
    private String motherboard;
    private String opticalDrive;

    // Default constructor with initial values
    public ComputerSystem() {
        systemName = "MyPC";
        systemType = "Desktop";
        processor = "Intel Core i7";
        ram = 16;
        hardDisk = 512;  // in GB
        motherboard = "ASUS Prime B450M";
        opticalDrive = "No";
    }

    // Method to get details from the user
    public void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter system name: ");
        systemName = sc.nextLine();
        
        System.out.print("Enter system type (e.g., Desktop/Laptop): ");
        systemType = sc.nextLine();
        
        System.out.print("Enter processor specification: ");
        processor = sc.nextLine();
        
        System.out.print("Enter RAM size (in GB): ");
        ram = sc.nextInt();
        
        System.out.print("Enter hard disk size (in GB): ");
        hardDisk = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline
        
        System.out.print("Enter motherboard type: ");
        motherboard = sc.nextLine();
        
        System.out.print("Enter optical drive (Yes/No): ");
        opticalDrive = sc.nextLine();
    }

    // Method to display the details of the system
    public void displayDetails() {
        System.out.println("\n--- Computer System Details ---");
        System.out.println("System Name: " + systemName);
        System.out.println("System Type: " + systemType);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard Disk: " + hardDisk + " GB");
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Optical Drive: " + opticalDrive);
    }

    // Method to change a specific detail
    public void updateDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDo you want to update any information? (Yes/No)");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            System.out.println("Which detail do you want to update?");
            System.out.println("1. System Name");
            System.out.println("2. System Type");
            System.out.println("3. Processor");
            System.out.println("4. RAM");
            System.out.println("5. Hard Disk");
            System.out.println("6. Motherboard");
            System.out.println("7. Optical Drive");

            int option = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter new system name: ");
                    systemName = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new system type: ");
                    systemType = sc.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new processor specification: ");
                    processor = sc.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new RAM size (in GB): ");
                    ram = sc.nextInt();
                    break;
                case 5:
                    System.out.print("Enter new hard disk size (in GB): ");
                    hardDisk = sc.nextInt();
                    break;
                case 6:
                    System.out.print("Enter new motherboard type: ");
                    motherboard = sc.nextLine();
                    break;
                case 7:
                    System.out.print("Enter new optical drive (Yes/No): ");
                    opticalDrive = sc.nextLine();
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}

public class ComputerSystems {
    public static void main(String[] args) {
        // Create an object using the default constructor
        ComputerSystem system = new ComputerSystem();

        // Get details from the user
        system.getDetails();

        // Display the entered details
        system.displayDetails();

        // Allow the user to update details if needed
        system.updateDetails();

        // Display the updated details
        system.displayDetails();
    }
}

