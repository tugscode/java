public class Main {
    public static void main(String[] args) {
        isCatPlaying(false,35);
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}