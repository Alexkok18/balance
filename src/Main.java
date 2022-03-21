public class Main {
    public static void main(String[] args) {

        // Входные данные
        int payment = 1100;
        int balance = 100;

        // Логика процесса
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;

        } else  {
            bonus = 0;
        }
        int money = balance + payment + bonus;

        System.out.println("Ваш баланс :" + money + "рублей");
    }
}