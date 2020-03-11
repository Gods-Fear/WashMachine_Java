import java.util.Scanner;

public class Beko extends Modes implements Machine {

    @Override
    public void on() {
        System.out.println("Please on the machine. Write 'on' command for starting");
        Scanner scanner_on = new Scanner(System.in);
        String userInputOn = scanner_on.nextLine();
        while (!userInputOn.equals("on")) {
            System.out.println("Sorry i don`t understand - Pls write on");
            userInputOn = scanner_on.nextLine().toLowerCase();
        }
        System.out.println("Machine is ON  - Welcome");
    }

    @Override
    public void off() {
        System.out.println("\nThank you for washing! Please write 'off' command for off the machine");
        Scanner scanner_on = new Scanner(System.in);
        String userInputOff = scanner_on.nextLine().toLowerCase();
        while (!userInputOff.equals("off")) {
            System.out.println("Please write 'off' command for off the machine!");
            userInputOff = scanner_on.nextLine();
        }
        System.out.println("Machine is OFF  - GoodBye!");
    }
  // return againe
    @Override
    public void chooseMode() {
        System.out.println("Please choose the mode :");
        System.out.println("1. Fast \n2. Sport \n3. Cotton \n4. Synthetic \n5. ReallyDirty" );
        Scanner scanner_on = new Scanner(System.in);
        String userInputMode = scanner_on.nextLine().toLowerCase();
        switch (userInputMode){
            case "Fast": case "1":
                fastMode(); break;
            case "Sport": case "2":
                sportMode(); break;
            case "Cotton": case "3":
                cottonMode(); break;
            case "Synthetic": case "4":
                syntheticMode(); break;
            case "ReallyDirty": case "5":
                reallyDirtyMode(); break;
            default:
               chooseMode();
        }
    }

    @Override
    public void chooseTemperature() {
        System.out.println("Please choose the temperature :");
        System.out.println("1. 30°\n2. 40°\n3. 60°\n4. 90°");
        Scanner scanner_on = new Scanner(System.in);
        String userInputTem = scanner_on.nextLine().toLowerCase();
        switch (userInputTem){
            case "30" : case "1":
                System.out.println("Great you chose 30°"); break;
            case "40": case "2":
                System.out.println("Great you chose 40°"); break;
            case "60": case "3":
                System.out.println("Great you chose 60°"); break;
            case "90": case "4":
                System.out.println("Great you chose 90°"); break;
            default:
                chooseTemperature();
        }

    }

    @Override
    public void chooseSpeed() {
        System.out.println("Please choose the speed :");
        System.out.println("1. 600\n2. 800\n3. 1000\n4. Without wringing (0)");
        Scanner scanner_on = new Scanner(System.in);
        String userInputSpeed = scanner_on.nextLine().toLowerCase();
        switch (userInputSpeed){
            case "600" : case "1":
                System.out.println("Great you chose speed 600"); break;
            case "800": case "2":
                System.out.println("Great you chose speed 800"); break;
            case "1000": case "3":
                System.out.println("Great you chose speed 1000"); break;
            case "Without wringing": case "4":
                System.out.println("Great you chose without wringing"); break;
            default:
                chooseSpeed();
        }

    }

    @Override
    public void putClothes() {
        System.out.println("\nPlease put clothes into machine. Write 'put' for starting");
        Scanner scanner_on = new Scanner(System.in);
        String userInputPut = scanner_on.nextLine().toLowerCase();
       while (!userInputPut.equals("put")){
           System.out.println("Please put clothes into machine!!!");
           userInputPut = scanner_on.nextLine();
       } System.out.println("Thanks. The door is closed");
        System.out.println("-------------------------");
        System.out.println("The wash is started. Please wait approximately your mode");
        System.out.println("-------------------------");;
    }

    @Override
    public void takeClothes() {
        System.out.println("\nThe wash was finished. Please take your clothes from the machine. Write 'take' command");
        Scanner scanner_on = new Scanner(System.in);
        String userInput = scanner_on.nextLine().toLowerCase();
        while (!userInput.equals("take")){
            System.out.println("Please take your clothes from the machine!!! Write 'take' command !");
            userInput = scanner_on.nextLine();
        } System.out.println("Thanks.");
    }

    @Override
    public void repeat() {
        System.out.println("\nDo you want to wash again ? \n1.Yes \n2.No");
        Scanner scanner_on = new Scanner(System.in);
        String userInput = scanner_on.nextLine().toLowerCase();
        switch (userInput){
            case "1": case "Yes":
                chooseMode();
                chooseTemperature();
                chooseSpeed();
                putClothes();
                takeClothes();
                repeat();
                break;
            case "2": case "No":
                off();;
                System.exit(1);
                break;
            default:
                repeat();

        }
    }
}
