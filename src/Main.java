import  java.util.Scanner;
public class Main{
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         int n, k;
         System.out.print("Enter base number : ");
         n = input.nextInt();

         System.out.print("Enter exponent number : ");
         k = input.nextInt();
         int total = 1;

         for (int i = 1; i <= k; i++) {
             total *= n;
         }
         System.out.println("Answer : " + total);
     }
}




