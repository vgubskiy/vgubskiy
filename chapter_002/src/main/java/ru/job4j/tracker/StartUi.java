package ru.job4j.tracker;

/**.
 * Класс запуска программы трекера
 */
public class StartUi {
    /**.
     * Создаем трекер
     */
    private Tracker tracker = new Tracker();
    /**.
     * Создаем ввод данных
     */
    private Input input = new ConsoleInput();
    /**.
     * Создаем конструктор
     * @param tracker - объект трекер
     * @param input - объект ввода данных
     */
    public StartUi(Tracker tracker, Input input) {
        this.tracker = tracker;
        this.input = input;
    }
    /**.
     * Метод запуска
     */
    public void init() {
        boolean loop = true;
        MenuTracker menuTracker = new MenuTracker(tracker, input);
        while (loop) {
            menuTracker.menuShow();
            int key = input.option("Choose an option: ");
            System.out.println("");
            menuTracker.executeAction(key);
            if (key == 0) {
                loop = false;
            }
        }
    }
    /**.
     * Точка входа в программу
     * @param args - аргументы запуска программы
     */
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        StartUi startUI = new StartUi(tracker, input);
        startUI.init();
    }
}
