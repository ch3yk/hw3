public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int pineapple = 4;
        byte people = 32;
        short cost = 27999;
        long childInCity = 5271364L;
        System.out.println("Значение переменной pineapple с типом int  равно " + pineapple);
        System.out.println("Значение переменной people с типом byte  равно " + people);
        System.out.println("Значение переменной cost с типом short  равно " + cost);
        System.out.println("Значение переменной childInCity с типом long  равно " + childInCity);
        System.out.println("Задача 2");
        double one = 27.12;
        long two = 987678965549L;
        float three = 2.786F;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;
        System.out.println("Задача 3");
        int ludPav = 23;
        int anSer = 27;
        int ekAnd = 30;
        int allPaper = 480;
        double evryStudentPaper = allPaper / (ludPav+anSer+ekAnd);
        System.out.println(evryStudentPaper);
        System.out.println("Задача 4");
        byte proizvMash = 16;
        byte time = 2;
        double proizvInOneMin = proizvMash/time;
        double inTwenMin = proizvInOneMin * 20;
        double inSytki = proizvInOneMin * 1440;
        double inThreeDnya = proizvInOneMin * 4320;
        double inOneMesyac = proizvInOneMin * 44640;
        System.out.println("За 20 минут, машина произвела  " + inTwenMin + " штук бутылок");
        System.out.println("За сутки, машина произвела  " + inSytki + " штук бутылок");
        System.out.println("За 3 дня, машина произвела  " + inThreeDnya + " штук бутылок");
        System.out.println("За 1 месяц, машина произвела  " + inOneMesyac + " штук бутылок");

    }

    public static void task2 () {
        System.out.println("Задача 5");
        byte allPaint = 120;
        int room = allPaint/(2+4);
        int white = room * 2;
        int brown = room * 4;
        System.out.println("В школе, где " + room +" классов, нужно " + white + " банок белой краски " + brown +" банок коричневой краски");
        System.out.println("Задача 6");
        short banan = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        int massGram = banan + milk + iceCream + egg;
        float massKilo = massGram / 1000F;
        System.out.println("Весс в граммах " + massGram);
        System.out.println("Весс в килограммх " + massKilo);
        System.out.println("Задача 7");
        int kilo = 7000;
        int maximum = kilo / 250;
        int minimum = kilo / 500;
        int average = (minimum+maximum)/2;
        System.out.println("Спортсмену нужно минимум "+minimum+" дней для похудения");
        System.out.println("Спортсмену нужно максимум "+maximum+" дней для похудения");
        System.out.println("Спортсмену нужно в среднем "+average+" день для похудения");
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaProcent = masha*0.1F;
        float denisProcent =  denis*0.1F;
        float kristinaProcent = kristina*0.1F;
        double yearMasha = (masha*12)+mashaProcent;
        double yearDenis = (denis*12)+denisProcent;
        double yearKristina = (kristina*12)+kristinaProcent;
        System.out.println("Маша теперь получает " +yearMasha+ " рублей. Годовой доход вырос на " + mashaProcent +" рублей");
        System.out.println("Денис теперь получает " +yearDenis+ " рублей. Годовой доход вырос на " + denisProcent +" рублей");
        System.out.println("Кристина теперь получает " +yearKristina+ " рублей. Годовой доход вырос на " + kristinaProcent +" рублей");
    }
}