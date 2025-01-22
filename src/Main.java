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
    }
}