import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner ymOruul = new Scanner(System.in);


        //if hicheel
//        int a, b, c, max = 0;
//
//
//        a = ymOruul.nextInt();
//
//        b = ymOruul.nextInt();
//
//        c = ymOruul.nextInt();
//
//        if(a > b && a > c){
//            max = a;
//        } else if (b > c) {
//            max = b;
//        }else {
//            max = c;
//        }
//        System.out.println(max);

// for davtalt
//        for(int i = 0; i <= 100; i = i + 2){
//            System.out.println(i);
//        }

        //while
//        int i = 0;
//        while (i <= 5){
//            System.out.println(i);
//            i++;
//        }

        //do while

//        int u = 0;
//        do {
//            System.out.println(u);
//            u ++;
//        }while (u < 5);


//        String  [] massiv = new String[3];
//        int [] massiv2 = {1, 4,5,6,7,243,434,234};
//        int [][] hemjeest2 = new int[2][3];


        //for ym
//        for (int i=0; i<2; i++){
//            for (int j=0; j<3; j++){
//                System.out.println("utga" + i+j);
//                hemjeest2[i][j] = ymOruul.nextInt();
//            }
//        }

//        for (int i=0; i<2; i++){
//            for (int j=0; j<3; j++){
//                System.out.println(hemjeest2[i][j]);
//            }
//            System.out.println("\n");
//        }

        //ene bol for each ym
//        for(String element: massiv){
//            System.out.println(element);
//        }



        //massiv bodlogo

//        int length = ymOruul.nextInt();
//        int[] orolt = new int[length];
//        int min =100;
//        int max = 0;
//        for (int i=0; i<length; i++){
//            orolt[i] = ymOruul.nextInt();
//            if(orolt[i]<min){
//                min = orolt[i];
//            }
//            if(orolt[i] > max){
//                max = orolt[i];
//            }
//        }
//
//        System.out.println(min);
//        System.out.println(max);

        //Widening cast automataar hiigdej bga
//        int i;
//        double d;
//        i = 10;
//        d = i;
//        System.out.println(" Integer "+i +" Double "+d);


        //Narrowing cast auto hiij boldgui

//        double num = 10.99;
//        System.out.println(" the double value "+num);
//
//        int data = (int)num;
//        System.out.println(" the integer value "+data);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value= " + myMinFloatValue);
        System.out.println("Float max value= " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value= " + myMinDoubleValue);
        System.out.println("double max value= " +myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue "+myDoubleValue);

        //Challange pound to killogram
        double pound = 200d;
        double killogram = pound * 0.45359237d;
        System.out.println("Converted killograms= "+killogram);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}