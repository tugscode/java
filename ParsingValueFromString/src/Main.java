import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ymOruul = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = ymOruul.nextLine();
        System.out.println(name);
        ymOruul.close();
        String numberAsString = "2018";
        System.out.println("numberAsString = "+numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = "+number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);
        System.out.println(canPack(1,0,6));
        System.out.println(getLargestPrime(1000));
        printSquareStar(7);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        for (int i =0; i<=bigCount; i++){
            for (int j=0; j<=smallCount; j++){
                if ((5*i)+j==goal)
                    return true;
            }
        }
        return false;
    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}