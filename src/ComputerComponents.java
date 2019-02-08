import java.util.Scanner;

public class ComputerComponents {

    public void aboutRAM(Scanner sc){

        System.out.println("Random-access memory is a form of computer data storage.");
        System.out.println("that stores data and machine code currently being used.");
        System.out.println("A random-access memory device allows data items to be read");
        System.out.println("or written in almost the same amount of time irrespective");
        System.out.println("of the physical location of data inside the memory");
        System.out.println();
        System.out.println("How many RAM does this computer have? Press y and enter to find out");
        String pick = sc.next();

        if (pick.equalsIgnoreCase("y")){

            System.out.println("This computer has ... RAM");
        }

        else{

            System.out.println("Please enter y");
        }


    }

    public void aboutCPU(Scanner sc){

        System.out.println("A central processing unit (CPU), also called a central processor or main processor,");
        System.out.println("is the electronic circuitry within a computer that carries out the instructions");
        System.out.println("of a computer program by performing the basic arithmetic, logic, controlling,");
        System.out.println("and input/output (I/O) operations specified by the instructions.");
        System.out.println();
        System.out.println("What kind of CPU does this computer have? Press y and enter to find out");
        String pick = sc.next();

        if(!pick.equalsIgnoreCase("y") ){

            System.out.println("What kind of CPU does this computer have? Press y and enter to find out");
            pick = sc.next();

        }
        else{
            System.out.println("This computer has an Intel Core i7 7th Gen CPU");
        }




    }
}
