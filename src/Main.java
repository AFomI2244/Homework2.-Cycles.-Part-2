public class Main {
    public static void main(String[] args) {

        //Домашнее задание - 1. Циклы. Часть 2
        //Задание 1
        System.out.println("Домашнее задание - 1. Циклы. Часть 2");
        System.out.println("Задание 1");

        int month = 15000;
        int Total = 0;
        int i = 2;
        while (Total < 2_459_000) {
            Total = Total + Total/100;
            Total = Total + month;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Total + " рублей");
            i ++;
        }

        //Задание 2
        System.out.println("Задание 2");

        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start ++;
        }
        System.out.println();
        for (start = 10; start >= 1; start --) {
            System.out.print(start + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRatePerYear = 17;
        int mortalityPerYear = 8;
        int birthMortalityDifference = birthRatePerYear - mortalityPerYear;
        int part = 1000;
        for (int a = 1; a <= 10; a ++) {
            int numberOfPopulationChanges = population / part;
            int populationChanges = numberOfPopulationChanges * birthMortalityDifference;
            population = population + populationChanges;
            System.out.println("Год " + a + ", численность населения составляет " + population);
        }

        //Домашнее задание - 2. Циклы. Часть 2
        //Задание 1-2
        System.out.println("Домашнее задание - 2. Циклы. Часть 2");
        System.out.println("Задание 1-2");

        int initialPayment = 15000;
        int percent = 7;
        int a = 1;
        while (initialPayment < 12_000_000) {
            initialPayment = initialPayment + (initialPayment / 100 * percent);
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + ", сумма накоплений равна " + initialPayment + " рублей");
            }
            a ++;
        }

        //Задание 3
        System.out.println("Задание 3");

        int total = 15000;
        int accountTimeLimit = 9 * 12;
        int b = 1;
        while (b <= accountTimeLimit) {
            total = total + (total / 100 * percent);
            if (b % 6 == 0) {
                System.out.println("Месяц " + b + ", сумма накоплений равна " + total + " рублей");
            }
            b ++;
        }

        //Задача 4
        System.out.println("Задание 4");

        int firstFriday = 7;
        int c = 1;
        while (c <= 31) {
            if (c % 7 == 0) {
                System.out.println("Сегодня пятница, " + c + "-е число. Необходимо подготовить отчет.");
            }
            c ++;
        }

        //Домашнее задание - 3. Циклы. Часть 2
        //Задание 1
        System.out.println("Домашнее задание - 3. Циклы. Часть 2");
        System.out.println("Задание 1");

        int currentYear = 2017;
        int period = 79;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        do {
            startYear = startYear + period;
            System.out.println(startYear);
        }
        while (startYear + period <= endYear);

        //Задание 2
        System.out.println("Задание 2");

        int two = 2;
        for (int number = 1; number <= 10; number ++) {
            System.out.println(two + "*" + number + "=" + two * number);
        }
    }
}