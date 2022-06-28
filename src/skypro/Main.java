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
    public static void yearPhone(int currentYear) {
        if (currentYear > 2015) {
            System.out.println("установите приложение для");
        } else {
            System.out.println("установите облегченную версию приложения для");
        }

    }

    public static void ocVersion(int ocUser) {
        if (ocUser == 0) {
            System.out.println("IOS");
        } else if (ocUser == 1) {
            System.out.println("Android");

        }
    }

    //метод к третий задачи
    public static void daysDelivery(int deliveryDistance) {
        if (deliveryDistance > 20) {
            int days = (deliveryDistance + 20) / 40 + 1;
            System.out.println("Срок достаки составит дня(дней)-" + days);
        } else System.out.println("срок доставки составит один день");
    }

    public static void main(String[] args) {
        //Задача 1
        int year1 = 678;
        year(year1);


        //задача 2
        int ocUser = 0;
        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);
        yearPhone(currentYear);
        ocVersion(ocUser);


        //задача 3
        int deliveryDistance = 847;
        daysDelivery(deliveryDistance);


    }

}