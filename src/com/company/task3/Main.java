package com.company.task3;

public class Main {

    public static void main(String[] args) {

        CreditCard myCreditCard = new CreditCard();
        myCreditCard.cardNumber = "Карточка";
        myCreditCard.owner = "Вася";
        myCreditCard.type = CreditCard.Type.VISA;

        CreditCard.Type type = CreditCard.Type.VISA;

        switch (type) {
            case VISA:
                System.out.println("Ув." + myCreditCard.owner + " поздравляем, вы используете нормальную карту.");
                break;
            case MASTERCARD:
                System.out.println("Ув. " + myCreditCard.owner + " поздравляем, вы используете нормальную карту.");
                break;
            case MIR:
                System.out.println(myCreditCard.owner + " пошел ты на х#й вместе со своим русским кораблем!!!");
                break;
            default:
                System.out.println("Неизвестный тип карты: {type}");
        }
    }
}