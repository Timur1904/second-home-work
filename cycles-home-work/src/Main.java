import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 5.1");
        for (int i = 1; i <= 10; i++) {
            int num = 20;
            System.out.print(num + " ");
            if (i == 10) {
                System.out.println(" ");
            }
        }

        System.out.println("Задача 5.13");
        for (int i = 1; i <= 9; i++) {
            int mult = 7;
            String stringNumI = String.valueOf(i);
            String stringMult = String.valueOf(mult);
            int res = i * mult;
            System.out.println(stringNumI + " " + "*" + " " + stringMult + " " + "=" + " " + res);

        }

        System.out.println("Задача 5.27 " + "а");
        for (int i = 100; i <= 500; i++) {
            System.out.println(i + i);
        }

        System.out.println("Задача 5.27 " + "г");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b >= a) {
            for (int i = a; i <= b; i++) {

                System.out.println(i + i);

            }
        } else System.out.println("Число b меньше числа a");

        System.out.println("Задача 5.28 " + "а");
        for (int i = 8; i <= 15; i++) {
            int e = i + 1;
            System.out.println(i * e);
        }

        System.out.println("Задача 5.28 " + "г");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        if (b1 >= a1) {
            for (int i = a1; i <= b1; i++) {

                System.out.println(i * i);

            }
        } else System.out.println("Число b меньше числа a");

        System.out.println("Задача 5.8");
        for (int i = 1; i <= 10; i++) {
            String strNumI = String.valueOf(i);
            int resKilo = i * 453;

            if (i >= 2 && i <= 4) {
                System.out.println(strNumI + " " + "фута " + "равно" + " " + resKilo + " " + "г");
            } else System.out.println(strNumI + " " + "фут " + "равно" + " " + resKilo + " " + "г");


        }

        System.out.println("Задача 5.72");

        double startDistance = 10;
        double percentInDay = 0.10;
        double res = 0;
        System.out.println(startDistance);
        for (int day = 2; day <= 10; day++) {
            startDistance += startDistance * percentInDay;
            System.out.println(startDistance);
        }

        for (int day = 1; day <= 7; day++) {
            startDistance += startDistance * percentInDay;
            res += startDistance;
        }
        System.out.println("Суммарный пробег за 7 дней " + res);


        System.out.println("Задача 7.1");
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Задача 7.26");
        Scanner s = new Scanner(System.in);
        int month = 30;
        int countMinTemp = 0;


        for (int i = 1; i <= month; i++) {

            System.out.println("Введите температуру для дня " + i);
            int tempInMonth = s.nextInt();
            if (tempInMonth < 0) {
                countMinTemp++;
            }

            System.out.println("Температура опускалась ниже нуля " + countMinTemp + " раз");

        }


        System.out.println("Задача 7.56");
        Scanner scDist = new Scanner(System.in);
        String[] cities = {"Ярославль", "Владимир", "Кострома", "Архангельск", "Сочи"};
        int[] distance = new int[cities.length];
        for (int i = 0; i < cities.length; i++) {

            System.out.print("Введите расстояние от Москвы к городу: " + cities[i] + " :");
            distance[i] = scDist.nextInt();


        }
        int maxDist = distance[0];
        for (int i = 1; i < distance.length; i++) {
            if (distance[i] > maxDist) {
                maxDist = distance[i];
            }
        }

        System.out.println("Максимальное расстояние от Москвы " + maxDist);


        System.out.println("Задача 8.1 а");

        for (int i = 1; i <= 6; i++) {
            System.out.print("5 ");
            if (i == 6) {
                System.out.println(" ");
            }
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print("5 ");
            if (i == 6) {
                System.out.println(" ");
            }
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print("5 ");
            if (i == 6) {
                System.out.println(" ");
            }
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print("5 ");
            if (i == 6) {
                System.out.println(" ");
            }
        }

        System.out.println("Задача 8.1 б");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println(" ");
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println(" ");
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println(" ");
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println(" ");
            }
        }

        System.out.println("Задача 8.1 в");
        for (int i = 41; i <= 80; i++) {
            System.out.print(i + " ");
            if (i == 50) {
                System.out.println(" ");
            }
            if (i == 60) {
                System.out.println(" ");
            }
            if (i == 70) {
                System.out.println(" ");
            }
            if (i == 80) {
                System.out.println(" ");
            }
        }

        System.out.println("Задача 6.21 б");
        int ax = 0;
        int bx = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.println(bx + " ");
            int result = ax + bx;
            ax = bx;
            bx = result;
            if (bx >= 1000) {
                break;
            }
        }
    }
}