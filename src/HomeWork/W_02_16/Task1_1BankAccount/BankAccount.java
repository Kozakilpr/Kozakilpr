package HomeWork.W_02_16.Task1_1BankAccount;

public class BankAccount {

        private double balance;// Инкапсулированный баланс счета
        private String Name;


        // Конструктор для инициализации счета с начальным балансом
        public BankAccount(double initialBalance, String Name) {
            balance = initialBalance;
            this.Name = Name;

        }

        // Метод для внесения средств на счет
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Средства успешно внесены. Новый баланс: " + balance);
            } else {
                System.out.println("Неверная сумма для внесения.");
            }
        }

        // Метод для снятия средств со счета
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Средства успешно сняты. Новый баланс: " + balance);
            } else {
                System.out.println("Неверная сумма для снятия или недостаточно средств на счете.");
            }
        }

        // Метод для получения текущего баланса счета (без возможности изменения извне)
        public double getBalance() {
            return balance;
        }
    }


