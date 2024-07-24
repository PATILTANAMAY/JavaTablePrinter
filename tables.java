import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
System.out.println("which table you want");
        int number= sc.nextInt();
        System.out.println("Multiplication Table for " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println( number *i);
        }
    }
}
