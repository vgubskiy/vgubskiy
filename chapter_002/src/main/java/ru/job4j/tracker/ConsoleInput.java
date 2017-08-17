package ru.job4j.tracker;

import java.util.Scanner;

/**.
 * Класс ввода данных
 * @author Valeriy Gubskiy
 * @since 17.08.2017
 * @version 1.0
 */
public class ConsoleInput {
    /**.
     * Создаем объект типа сканнер
     */
    private Scanner scanner = new Scanner(System.in);

    /**.
     * Метод ввода номера пункта меню
     * @param question - строка запроса ввода номера
     * @return - номер пункта меню
     */
    public int option(String question) {
        System.out.print(question);

        while (!scanner.hasNextInt()) {
            System.out.println("Enter the number!");
            scanner.next();
        }
        int result = scanner.nextInt();
        return result;
    }

    /**.
     * Метод плучения строки из ввода ползоателя
     * @param string - вывод строки запроса к пользователю
     * @return - строка ввда пользователя
     */
    public String item(String string) {
        System.out.print(string);
        return scanner.next();
    }
}
