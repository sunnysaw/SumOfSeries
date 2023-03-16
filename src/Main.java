/*
Question : Write a java Program to Find the Sum of the Series 1/1+1/2+1/3+…1/N
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double digit,temp = 1,temp2 = 1,sum = 0;
        System.out.println("Enter the digit to start the series :");
        digit = sc.nextDouble();
        while (temp2 <= digit){
            sum += (temp / temp2);
            temp2++;
        }
        System.out.println("Printing the final result : " + sum);
    }
}
/*
Case 1 (Simple Test Case):

Enter the number of terms in the series
34
The sum is 4.118209990445433
 */