package ru.job4j.tracker;

import java.util.Scanner;

/**.
 * Класс ввода данных
 * @author Valeriy Gubskiy
 * @since 17.08.2017
 * @version 1.0
 */
public class ConsoleInput implements Input {
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
        scanner.nextLine();
        return result;
    }
    /**.
     * Метод вывода строки для запроса ввода пользоателя
     * @param string - вывод строки запроса к пользователю
     * @return - строка вопроса для пользователя
     */
    public String ask(String string) {
        System.out.println(string);
        return scanner.nextLine();
    }
}
