package ru.job4j.tracker;

/**.
 * Класс запуска программы трекера
 */
public class StartUi {
    /**.
     * Задаем константы для элементов меню
     * первый пункт меню
     */
    private static final String MENU1 = "Add new Item";
    /**.
     * Второй пункт меню
     */
    private static final String MENU2 = "Show all Items";
    /**.
     * Третий пункт меню
     */
    private static final String MENU3 = "Edit Item";
    /**.
     * Четвертый пункт меню
     */
    private static final String MENU4 = "Delete Item";
    /**.
     * Пятый пункт меню
     */
    private static final String MENU5 = "Find Item by Id";
    /**.
     * Шестой пункт меню
     */
    private static final String MENU6 = "Find Item by Name";
    /**.
     * Последний пункт меню - ВЫХОД из меню
     */
    private static final String EXIT = "Exit programm";
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
     * Метод построения и отображения меню
     */
    private static void showMenu() {
        String[] menu = new String[7];
        menu[1] = MENU1;
        menu[2] = MENU2;
        menu[3] = MENU3;
        menu[4] = MENU4;
        menu[5] = MENU5;
        menu[6] = MENU6;
        menu[0] = EXIT;
        System.out.println("----------------------------");
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ". " + menu[i]);
        }
        System.out.println("");
        System.out.println(0 + ". " + menu[0]);
        System.out.println("----------------------------");
    }

    /**.
     * Метод создания заявки в трекере при выборе пользователем первого пункта меню
     * @param input - вводные данные от пользователя
     * @param tracker - объект трекера
     */
    private static void createItem(Input input, Tracker tracker) {
        String itemId = input.ask("Enter ask Id: ");
        String itemName = input.ask("Enter Item name: ");
        String itemDesc = input.ask("Enter Item description: ");
        Item item = new Item(itemId, itemName, itemDesc);
        System.out.println("Item " + tracker.add(item).getItemName() + " created!");
        System.out.println("");
    }
    /**.
     * Метод отображения всех заявок в трекере при выборе пользователем второго пункта меню
     * @param tracker - объект трекера
     */
    private static void showAllItems(Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            System.out.println("Items list:");
            for (int i = 0; i < items.length; i++) {
                System.out.print(items[i].getItemId() + ", " + items[i].getItemName() + ", " + items[i].getItemDesc());
            }
        } else {
            System.out.println("The tracker is EMPTY!");
        }
        System.out.println("");
        System.out.println("");
    }
    /**.
     * Метод изменения заявки в трекере при выборе пользователем третьего пункта меню
     * @param input - вводные данные от пользователя
     * @param tracker - объект трекера
     */
    private static void modifyItem(Input input, Tracker tracker) {
        System.out.println("Modify method");
    }
    /**.
     * Метод удаления заявки из трекера при выборе пользователем четвертого пункта меню
     * @param input - вводные данные от пользователя
     * @param tracker - объект трекера
     */
    private static void deleteItem(Input input, Tracker tracker) {
        String itemName = input.ask("Enter Item name to delete: ");
        Item itemToDelete = tracker.findByName(itemName);
        if (itemToDelete != null) {
            tracker.delete(itemToDelete);
            System.out.println("Item " + itemToDelete.getItemName() + " DELETED!");
        } else {
            System.out.println("There is no such ask: " + itemName);
        }
    }
    /**.
     * Метод поиска заявки по Id в трекере при выборе пользователем пятого пункта меню
     * @param input - вводные данные от пользователя
     * @param tracker - объект трекера
     */
    private static void findItembyId(Input input, Tracker tracker) {
        String itemId = input.ask("Enter Item Id to find: ");
        Item itemToFind = tracker.findById(itemId);
        if (itemToFind != null) {
            System.out.println("Item FOUND: " + itemToFind.getItemName());
        } else {
            System.out.println("Item with Id " + itemId + " NOT FOUND!");
        }
    }
    /**.
     * Метод поиска заявки по имени в трекере при выборе пользователем шестого пункта меню
     * @param input - вводные данные от пользователя
     * @param tracker - объект трекера
     */
    private static void findItembyName(Input input, Tracker tracker) {
        String itemname = input.ask("Enter Item Name to find: ");
        Item itemToFind = tracker.findByName(itemname);
        if (itemToFind != null) {
            System.out.println("Item FOUND: " + itemToFind.getItemId());
        } else {
            System.out.println("Item with Name " + itemname + " NOT FOUND!");
        }
    }

    /**.
     * Метод запуска
     */
    public void init() {
        boolean loop = true;
        while (loop) {
            showMenu();
            int option = input.option("Choose an option: ");
            System.out.println("");
            switch (option) {
                case 0:
                    System.out.println("EXIT program");
                    loop = false;
                    break;
                case 1:
                    createItem(input, tracker);
                    break;
                case 2:
                    showAllItems(tracker);
                    break;
                case 3:
                    modifyItem(input, tracker);
                    break;
                case 4:
                    deleteItem(input, tracker);
                    break;
                case 5:
                    findItembyId(input, tracker);
                    break;
                case 6:
                    findItembyName(input, tracker);
                    break;
                default:
                    System.out.println("Choose 0 to 6!");
                    System.out.println("");
                    break;
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
