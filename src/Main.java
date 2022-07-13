public class Main {
    public static void main(String[] args) {
        //First task

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Install the IOS application version by following the link...");
        }else {
            System.out.println("Install the Android application version by following the link...");

        }

        //Second task

        int clientIOS = 0;
        int clientDeviceYear = 2022;

         if (clientOS == 0) {
             if (clientDeviceYear < 2015) {
                 System.out.println("Install the light version of the app for iOS from the link");
             }else{
                 System.out.println("Install apps for iOS from the link");
             }
         }else{
             if (clientDeviceYear < 2015) {
                 System.out.println("Install the light version of the app for Android from the link");
             }else{
                 System.out.println("Install apps for Android from the link");
             }

         }

         //Third task

        int year = 1991;

         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Is a leap year");
         }else{
            System.out.printf("is not a leap year");
        }

         //Fourth task

         int deliveryDistance = 95;

         int deliveryDays = 1;

         if (deliveryDistance > 20) {
             deliveryDays++;
         }
         if (deliveryDistance > 60) {
             deliveryDays++;
         }

        System.out.println("it will take days: " + deliveryDays);

         //Fifth task

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("invalid month" + monthNumber);
        }






    }
}