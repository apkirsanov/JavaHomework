package homework4_1;

public class Cards {
    public static void main(String[] args) {
        CreditCards cardMir = new CreditCards("2345 2356 7668 9890", 1849);
        CreditCards cardVisa = new CreditCards("5423 7658 4267 8742", 4355);
        CreditCards cardMaster = new CreditCards("8745 2347 6552 3362", 8513);
        cardMir.putMoney(400);
        cardVisa.putMoney(233);
        cardMaster.withdrawMoney(500);
        cardMir.printInfo();
        cardVisa.printInfo();
        cardMaster.printInfo();
    }
}
