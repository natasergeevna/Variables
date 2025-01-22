public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.printf("Задача 1\n");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //task 2
        System.out.printf("\nЗадача 2\n");
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);

        //task 3
        System.out.printf("\nЗадача 3\n");
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7339;
        System.out.println(paper);

        //task 4
        System.out.printf("\nЗадача 4\n");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //task 5
        System.out.printf("\nЗадача 5\n");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //task 6
        System.out.printf("\nЗадача 6\n");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var allWeight = weight1 + weight2;
        var diffWeight = weight2 - weight1;
        System.out.println("Общая масса 2-х бойцов " + allWeight);
        System.out.println("Разница между массами бойцов " + diffWeight);

        //task 7
        System.out.printf("\nЗадача 7\n");
        diffWeight = weight2 % weight1;
        System.out.println("Разница между массами бойцов " + diffWeight);

        //task 8
        System.out.printf("\nЗадача 8\n");
        var hours = 640;
        var hourOnePeople = 8;
        var allPeople = hours / hourOnePeople;
        System.out.println("Всего работников в компании — " + allPeople + " человек");
        allPeople += 94;
        hours = allPeople * hourOnePeople;
        System.out.println("Если в компании работает " + allPeople + " человека, то всего " + hours + " часов работы может быть поделено между сотрудниками");

        //part 2
        //task 1
        System.out.println("\nЗадача 1");
        int a = 12798;
        byte b = 125;
        short c = 490;
        long d = 89181905L;
        float e = 2.6f;
        double f = 5.2758278998729;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //task 2
        System.out.println("\nЗадача 2\n");
        float aa = 27.12f;
        long bb = 987_678_965_549L;
        float cc = 2.768f;
        int dd = 569;
        short ee = -159;
        int ff = 27897;
        byte gg = 67;

        //task 3
        System.out.println("Задача 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int paper_ = 480;
        int paperOnePeople = paper_ / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + paperOnePeople + " листов бумаги");

        //task 4
        System.out.println("\nЗадача 4");
        int bottle = 16;
        int minute = 2;
        int minute20 = bottle / minute * 20;
        int day = minute20 * 3 * 24;
        int day3 = day * 3;
        int month = day * 31;
        System.out.println("За 20 минут машина произвела " + minute20 + " штук бутылок");
        System.out.println("За день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        //task 5
        System.out.println("\nЗадача 5");
        int jarColor = 120;
        int jarWhite = 2;
        int jarBrown = 4;
        int classes = jarColor / (jarWhite + jarBrown);
        jarWhite *= classes;
        jarBrown *= classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + jarWhite + " банок белой краски и " + jarBrown + " банок коричневой краски");

        //task 6
        System.out.println("\nЗадача 6");
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        float weight = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        weight /= 1000;
        System.out.println("Спортивный завтрак весит " + weight + " кг");

        //task 7
        System.out.println("\nЗадача 7");
        int weightKg = 7;
        int weight250 = weightKg * 1000 / 250;
        int weight500 = weightKg * 1000 / 500;
        int loseDayWeight = (weight250 + weight500) / 2;
        System.out.println("Если в день сбрасывать по 250 грамм, то понадобится " + weight250 + " дней");
        System.out.println("Если в день сбрасывать по 500 грамм, то понадобится " + weight500 + " дней");
        System.out.println("В среднем, чтобы похудеть понадобится " + loseDayWeight + " дней");

        //task 7
        System.out.println("\nЗадача 7");
        float price = 0.1f;
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float newSalaryM = salaryM * (1 + price);
        float newSalaryD = salaryD * (1 + price);
        float newSalaryK = salaryK * (1 + price);
        System.out.println("Маша теперь получает " + newSalaryM + " рублей. Годовой доход вырос на " + (newSalaryM - salaryM) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryD + " рублей. Годовой доход вырос на " + (newSalaryD - salaryD) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryK + " рублей. Годовой доход вырос на " + (newSalaryK - salaryK) + " рублей");
    }
}