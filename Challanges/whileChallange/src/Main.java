public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(342));
        System.out.println(sumFirstAndLastDigit(454));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSameLastDigit(41, 32, 71));
        System.out.println(getGreatestCommonDivisor(25,15));
        printFactors(32);
        System.out.println("isPerfect number = "+isPerfectNumber(28));
        numberToWords(2623);
    }
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        int reverse = 0;
        int stored = number;
        while (stored > 0){
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }
        if(number == reverse){
            return true;
        }else {
            return false;
        }
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while (number > 9){
            number /= 10;
        }
        return lastDigit + number;
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int remainder = 0;
        while (number > 0){
            remainder = number % 10;
            sum += (remainder % 2 ==0)? remainder:0;
            number /= 10;
        }
        return sum;
    }
    public static boolean hasSharedDigit(int x, int y){
        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        }else {
            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
        }
    }
    public static boolean isValid(int num){
        return (num > 9) && (num < 1001);
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            x %= 10;
            y %= 10;
            z %= 10;
            return (x == y) || (x == z) || (y == z);
        }
        return false;
    }
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
    public static void printFactors(int number){
        if(number<1) System.out.print("Invalid Value");
        for(int i=1; i<=number; i++){
            if(number%i==0) System.out.print(i + " ");
        }
    }
    public static boolean isPerfectNumber(int number) {

        int sumOfProperDivisors = 0;
        int increment = (number % 2 == 0) ? 1 : 2;

        for (int i = 1; i <= number / 2; i += increment)
            if (number % i == 0)
                sumOfProperDivisors += i;

        return sumOfProperDivisors == number && number > 1;
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {
            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }
        System.out.println();
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}