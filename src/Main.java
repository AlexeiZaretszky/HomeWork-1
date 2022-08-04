public class Main {
    public static void main(String[] args) {
        // Задание 1


        byte mouse = 5;
        int cat = 3;
        short turtle = 15;
        long year = 365L;
        float saltWeight = 2.1f;
        double sugarWeight = 6.5;
        boolean turtleIsAbult = turtle > 20;
        char bar = 35;
        System.out.println(turtleIsAbult);

        //Задание 2

        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double weightDifferenceBoxers = boxerOne + boxerTwo;
        double weightDifference = boxerOne - boxerTwo;
        System.out.println("Общий вес войцов " + weightDifferenceBoxers);
        System.out.println("Разница в весе " + weightDifference);


       //Задание 3


        double totalWeightBananas = 5;
        double totalWeightRawEggs = 4;
        double totalWeightIceCreamSundae = 2;
        double totalWeightMilk = 2;
        double totalNumberBreakfast = totalWeightBananas * 80 + totalWeightRawEggs * 70 + totalWeightIceCreamSundae * 100 + totalWeightMilk * 105;
        System.out.println("Общий вес продукты " + totalNumberBreakfast + "грамм " );
        double totalNumberProducts = totalNumberBreakfast / 1000;
        System.out.println("Общий весс " + totalNumberProducts + "кг ");

        //Задание 4


        int sportsmanWeight = 7;
        int athleteLosesWeight = 250;
        int ifAnAthleteLosesWeight = 500;

        int athleteWillResetPerDay = sportsmanWeight * 1000;
        System.out.println("Общий вес ктоторый нужно сборосиь " + athleteWillResetPerDay + " грамм " );
        int numberGramsPerDay = 7000 / athleteLosesWeight;
       System.out.println("Если сбрасывать по 250, то выйдет " + numberGramsPerDay +  " Дней " );
       int numberDays = 7000 / ifAnAthleteLosesWeight;
       System.out.println("Если сбрасывать по 500, то выйдет " + numberDays + " Дней ");
       int averageNumberDays = 42 / 2;
        System.out.println("Среднее количество " + averageNumberDays + " Дней ");

        //Задание 5


        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;

        float upSalaryMashaPercent = Masha * 0.1f;
        float upSalaryDenisPercent = Denis * 0.1f;
        float upSalaryKristinaPercent= Kristina * 0.1f;

        float upSalaryMasha = Masha + upSalaryMashaPercent;
        float upSalaryDenis = Denis + upSalaryDenisPercent;
        float upSalaryKristina = Kristina + upSalaryKristinaPercent;

        float annualIncomeMasha = (upSalaryMasha * 12) - (Masha * 12);
        float annualIncomeDenis = (upSalaryDenis * 12) - (Denis * 12);
        float annualIncomeKristina = (upSalaryKristina * 12) - ( Kristina * 12);

       System.out.println("Маша теперь полчает " + upSalaryMasha + " Рублей. Годовой доход поднялся на " + annualIncomeMasha + " Рублей ");
       System.out.println("Денис теперь полуает " + upSalaryDenis + " Рублей. Годовой доход поднялся на " + annualIncomeDenis + " Рублей " );
       System.out.println("Кристина теперь получает " + upSalaryKristina + " Рублей. Годовой доход поднялся на" + annualIncomeKristina + " Рублей ");





         ;

























































    }
}