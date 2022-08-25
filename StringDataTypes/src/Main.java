public class Main {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
//        String myString = "tugscode";
//        System.out.println(myString);
//        myString = myString + " and this more";
//        System.out.println( myString);
//        String numberString = "515.3";
//        numberString = numberString + "4";
//        System.out.println(numberString);

//        boolean isAlien = false;
//        if(isAlien == false){
//            System.out.println("It's not an alien");
//        }
//
//        int topScore = 100;
//        if(topScore ==100){
//            System.out.println("You got a high score!");
//        }

        //challange

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal= "+myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder= "+theRemainder);
        boolean isNoRemainder = (theRemainder == 0 ) ? true : false;
        System.out.println("isNoRemainder= "+isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some Remainder");
        }


    }
}