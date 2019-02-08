import java.util.Scanner;

public class Menu {

    ComputerComponents cc = new ComputerComponents();
    public void startMenu()    {

        Scanner console = new Scanner(System.in);

        System.out.println("What would you like to know?");
        System.out.println("(1) what is RAM");
        System.out.println("(2) what is a CPU?");
        System.out.println("(3) what is ??");
        int choice = console.nextInt();

        switch (choice){

            case 1: cc.aboutRAM(console);
                    System.out.println();
                    startMenu();

            case 2: cc.aboutCPU(console);
                    System.out.println();
                    startMenu();
        }


    }
}
