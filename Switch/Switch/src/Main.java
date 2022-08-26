public class Main {
    public static void main(String[] args) {
       char charValue = 'G';
       switch (charValue){
           case 'A':
               System.out.println("A was found");
               break;
           case 'B':
               System.out.println("B was found");
               break;
           case 'C': case 'D': case 'E':
               System.out.println(charValue +" was found");
               break;
           default:
               System.out.println("Couldn't found A, B, C, D, E");
       }

       String month = "janUary";

       switch (month.toLowerCase()){
           case "january":
               System.out.println("Jan");
               break;
           case "June":
               System.out.println("June");
               break;
           default:
               System.out.println("Not sure");
       }
    }
}