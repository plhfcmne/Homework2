public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int negativ=-20000;
        byte melochApriyatno=12;
        short flashStandart=32767;
        long superRich=922300000000000L;
        float neponyatnoe=45.3f;
        double interestingNumber=-1.454556667676586;
        System.out.println("Значение переменной negativ с типом int равно "+negativ);
        System.out.println("Значение переменной melochApriyatno с типом byte равно "+melochApriyatno);
        System.out.println("Значение переменной flashStandart с типом short равно "+flashStandart);
        System.out.println("Значение переменной superRich с типом long равно "+superRich);
        System.out.println("Значение переменной neponyatnoe с типом float равно "+neponyatnoe);
        System.out.println("Значение переменной interestingNumber с типом double равно "+interestingNumber);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int d=569;
        byte f=67;
        short e=-159;
        short g=27897;
        long a=987678965549L;
        float b=27.12f;
        float c=2.786f;
        System.out.println("Значение переменной с типом int равно "+d);
        System.out.println("Значение переменной с типом byte равно "+f);
        System.out.println("Значение переменной с типом short равно "+g+" и "+e);
        System.out.println("Значение переменной с типом long равно "+a);
        System.out.println("Значение переменной с типом float равно "+b+" и "+c);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte a=23;
        byte b=27;
        byte c=30;
        int totalPupils= a+b+c;
        short sheets=480;
        int personalSheet=sheets/totalPupils;
        System.out.println("Каждому ученику достанется по "+personalSheet+" листов");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte zaMinutu=16/2;
        short twentyMin= (short)(zaMinutu*20);
        short oneDay=(short)(24*60*zaMinutu);
        int threeDay=oneDay*3;
        int oneMonth=oneDay*30;
                System.out.println("За 20 минут машина произвела "+twentyMin+" штук бутылок");
                System.out.println("За 1 день машина произвела "+oneDay+" штук бутылок");
                System.out.println("За 3 дня машина произвела "+threeDay+" штук бутылок");
                System.out.println("За 1 месяц машина произвела "+oneMonth+" штук бутылок");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint=120;
        byte whitePaint=2;
        byte brownPaint=4;
        byte forOneClass=(byte)(whitePaint+brownPaint);
        byte totalClass=(byte)(totalPaint/forOneClass);
        byte totalWhite=(byte)(whitePaint*totalClass);
        byte totalBrown=(byte)(brownPaint*totalClass);
        System.out.println("В школе, где "+totalClass+" классов, нужно "+totalWhite+" банок белой краски и "+totalBrown+" банок коричневой краски");

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte weightBanana=80;
        byte banana=5;
        byte weighMilk=105;
        byte volume=100;
        short volumeMilk=200;
        short milk=(short)(volumeMilk/volume);
        byte weightIceCream=100;
        byte iceCream=2;
        byte weightEgg=70;
        byte egg=4;
        short weight=(short)(weightBanana*banana+weighMilk*milk+weightIceCream*iceCream+weightEgg*egg);
        short kilo=1000;
        float kiloWeight=weight/(float)kilo;
        System.out.println("Вес спортзавтрака "+weight+" грамм или "+kiloWeight+" килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte aim=7;
        short kilo=1000;
        short a=250;
        short b=500;
        float dayA=aim*kilo/(float)a;
        float dayB=aim*kilo/(float)b;
        float middle=(a+b)/2f;
        float dayM=aim*kilo/middle;
        System.out.println("Спортсмену необходимо "+dayA+" дней при потере в весе ежедневно по "+a+" гр");
        System.out.println("Спортсмену необходимо "+dayB+" дней при потере в весе ежедневно по "+b+" гр");
        System.out.println("Спортсмену необходимо "+Math.round(dayM)+" дней при потере в весе в среднем ежедневно по "+middle+" гр");

    }
    public static void task8() {
        System.out.println("Задача 8");
        int mary=67760;
        int den=83690;
        int kristy=76230;
        float prize=0.112354566f;
        float totalPrize=1+prize;
        float prizeMary=mary*totalPrize;
        float prizeDen=den*totalPrize;
        float prizeKristy=kristy*totalPrize;
        byte year=12;
        float deltaMary=prizeMary*year-mary*year;
        float deltaDen=prizeDen*year-den*year;
        float deltaKristy=prizeKristy*year-kristy*year;
        System.out.println("Маша теперь получает "+String.format("%.2f",prizeMary)+" рублей. Годовой доход вырос на "+deltaMary+" рублей");
        System.out.println("Денис теперь получает "+String.format("%.2f",prizeDen)+" рублей. Годовой доход вырос на "+deltaDen+" рублей");
        System.out.println("Кристина теперь получает "+String.format("%.2f",prizeKristy)+" рублей. Годовой доход вырос на "+deltaKristy+" рублей");

    }
}