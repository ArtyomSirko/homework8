package skypro;

import java.time.LocalDate;

public class Main {
    //метод к первой задачи
    public static void year(int yearVisokosniy) {
        if (yearVisokosniy % 400 == 0 || yearVisokosniy % 100 != 0 && yearVisokosniy % 4 == 0) {
            System.out.println(yearVisokosniy + " год высокосный");
        } else {
            System.out.println(yearVisokosniy + " год не высокосный");
        }
    }

    //метод ко второй задачи


    public static void ocVersion(int ocUser,int currentYear) {
        if (ocUser == 0) {
            if (currentYear < 2015){
            System.out.println("установите облегченную версию приложения для IOS");
        }else {
            System.out.println("установите версию приложения для IOS");
        }
        }  else if(ocUser==1){
if(currentYear<2015){
    System.out.println("установите облегченную версию приложения для Android");
}else {
    System.out.println("установите версию приложения для Android");
}
        }
    }

    //метод к третий задачи
    public static void daysDelivery(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println("доставка не возможна");
        } else if (deliveryDistance<100) {

        int days = (deliveryDistance + 20) / 40 + 1;
            System.out.println("Срок достаки составит дня(дней)-" + days);
        }else

            System.out.println("срок доставки составит один день");
    }
    public static void main(String[] args) {
        //Задача 1
        int year1 = 678;
        year(year1);


        //задача 2
        int ocUser=1;
        int currentYear = LocalDate.now().getYear();
       ocVersion(ocUser,currentYear);




        //задача 3
        int deliveryDistance = 13;
        daysDelivery(deliveryDistance);


    }

}