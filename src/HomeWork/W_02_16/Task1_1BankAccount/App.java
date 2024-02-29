package HomeWork.W_02_16.Task1_1BankAccount;


public class App {
            public static void main(String[] args) {
            BankAccount account = new BankAccount(1560, "Alina Mauer"); // Создаем счет с начальным балансом 100
            account.deposit(543); // Вносим на счет 500
            account.withdraw(343); // Снимаем со счета 200
            System.out.println("Текущий баланс счета: "+ "Alina Mauer   " + account.getBalance()); // Получаем текущий баланс
        }
    }



