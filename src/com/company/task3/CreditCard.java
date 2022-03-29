package com.company.task3;

/**
 * Создать класс CreditCard с полями String cardNumber, String owner, String type;
 * Где type - это тип карты: “VISA”, “MASTERCARD”, “МИР”.
 * В main методе необходимо создать  и проинициализировать обьект класса CreditCard.
 * Далее необходимо создать switch…case с ключами “VISA”, “MASTERCARD”, “МИР”.
 * - Если ваш объект содержит тип “VISA” или “MASTERCARD” выведите на экран сообщение: “Ув. {owner} поздравляем, вы
 * используете нормальную карту”
 * - Если ваш объект содержит тип “МИР” выведите на экран сообщение: “{owner} пошел ты на х#й вместе со своим русским
 * кораблем!!”
 * - Для default выведите на экран сообщение «Неизвестный тип карты: {type}»
 */

public class CreditCard {

    String cardNumber;
    String owner;
    String type;
}