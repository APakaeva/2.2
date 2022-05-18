public class Main {
    public static void main(String[] args) {
        int amount = 100; //бабки на счету
        int refill = 1100; //пополнение

        int bonus;
        if (refill >= 1000) {

            bonus = refill / 100;          //расчет бонусов
        } else {
            bonus = 0;
        }
        int total;
        if (bonus > 0) {
            total = amount + refill + bonus;     //итоговая сумма пополнения
        } else {
            total = amount + refill;
        }

        System.out.println("Бонусные рубли - " + bonus);
        System.out.println("Сумма пополнения с учетом бонусов - " + total);


    }
}
