package ru.job4j.tracker;

/**.
 * Интерфейс действий пользователя
 */
public interface UserActions {
    /**.
     * Номер пункта меню
     * @return - вывод номера пункта меню
     */
    int key();

    /**.
     * Вопрос для пользователя
     * @return - вывод вопроса
     */
    String info();

    /**.
     * Выполнение выбранной задачи в меню
     * @param tracker - объект самого трекера
     * @param input - объект вводных данных
     */
    void execute(Tracker tracker, Input input);
}
