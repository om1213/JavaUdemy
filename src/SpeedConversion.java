

public class SpeedConversion {

    public static void checknumber(int num) {

        if (num < 0) {
            System.out.println("Negative");
        } else if (num > 0) {
            System.out.println("Positive");
        } else System.out.println("zero");


    }

    public static long toconvertkmtomiles(double km){

        if (km < 0){
            System.out.println("Invalid Value");
            return -1;
        } else {
            long miles = Math.round(km / 1.609);
            return miles;
        }


    }
}
