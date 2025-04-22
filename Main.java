import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop laptop = null;

        System.out.println("Pilih laptop:");
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.print("Masukkan pilihan (1/2/3): ");

        int choice = 0;
        try {
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Keluar dari program.");
            System.exit(0);
        }

        switch (choice) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        LaptopUser user = new LaptopUser(laptop);

        String command = "";
        System.out.println("\nMasukkan perintah: ON | OFF | UP | DOWN | EXIT");
        while (true) {
            System.out.print("Command: ");
            command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilent();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                default:
                    System.out.println("Perintah tidak dikenal. Gunakan: ON, OFF, UP, DOWN, EXIT");
            }
        }
    }
}
