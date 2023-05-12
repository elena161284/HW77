public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Задача 1");
        int accumulation = 15000;
        int total = 0;
        int munth = 0;
        while (total <= 2459000) {
            total = total + accumulation;
            munth = munth + 1;
            System.out.println("Месяц " + munth + " сумма накоплений равна " + total + " рублей.");
        }

        System.out.println();

        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        int initialNumber1 = 11;
        for (; initialNumber1 > 1; ) {
            initialNumber1 = initialNumber1 - 1;
            System.out.print(initialNumber1 + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int size = 12_000_000; // население
        int size2 = 0;
        int size3 = 9 * (size / 1000);
        int year = 0;

        while (year < 10) {
            year = year + 1;
            size2 = size2 + size3;
            System.out.println("В " + year + " году " + (size2 + size) + " человек.");
        }

        System.out.println();

        System.out.println("Задача 4");
        int depositAmount = 15000;
        int amountAccumulated = 0;
        int i = 0;
        for (; amountAccumulated <= 12_000_000; i++) {
            amountAccumulated = amountAccumulated + amountAccumulated * 7 / 100;
            amountAccumulated = amountAccumulated + depositAmount;

            System.out.println("Месяц " + i + " итого " + amountAccumulated);
        }
        System.out.println();

        System.out.println("Задача 5");
        int depositAmount1 = 15000;
        int amountAccumulated1 = 0;
        int i1 = 0;
        for (; amountAccumulated1 <= 12_000_000; i1++) {
            amountAccumulated1 = amountAccumulated1 + amountAccumulated1 * 7 / 100;
            amountAccumulated1 = amountAccumulated1 + depositAmount1;
            if (i1 % 6 == 0) {
                System.out.println("Месяц " + i1 + " итого " + amountAccumulated1);
            }
            System.out.println();

            System.out.println("Задача 6");
            int depositAmount2 = 15000;
            int amountAccumulated2 = 0;
            int i2 = 0;
            for (; i2 <= 108; i2 = i2 + 1) {
                amountAccumulated2 = amountAccumulated2 + amountAccumulated2 * 7 / 100;
                amountAccumulated2 = amountAccumulated2 + depositAmount2;
                if (i2 % 6 == 0) {
                    System.out.println("Месяц " + i2 + " итого " + amountAccumulated2);
                }
                System.out.println();

                System.out.println("Задача 7");
                int i3 = 7;
                for (; i3 <= 30; i3 = i3 + 7) {
                    System.out.println("Сегодня пятница, " + i3 + "-е число. Необходимо подготовить отчет.");
                }
                System.out.println();

                System.out.println("Задача 8");
                int yearOfAppearance = 1896;
                for (; yearOfAppearance < 2123; yearOfAppearance = yearOfAppearance + 79) {
                    System.out.println(yearOfAppearance);
                }

            }
        }
    }
}
