package ru.job4j.tracker;

/**.
 * Класс реализации меню
 */
public class MenuTracker {
    /**.
     * Объект трекер
     */
    private Tracker tracker;
    /**.
     * Объект ввода данных
     */
    private Input input;
    /**.
     * Массив пунктов меню
     */
    private UserActions[] userActions = new UserActions[7];
    /**.
     * Конструктор класса
     * @param tracker - объект трекера
     * @param input - объект вводных данных
     */
    public MenuTracker(Tracker tracker, Input input) {
        this.tracker = tracker;
        this.input = input;
    }
    /**.
     * Заполнение массива действий в меню
     */
    private void fillActions() {
        userActions[0] = new Exit();
        userActions[1] = new AddItem();
        userActions[2] = new ShowAll();
        userActions[3] = new ModifyItem();
        userActions[4] = new DeleteItem();
        userActions[5] = new FindItemById();
        userActions[6] = new FindItemByName();
    }
    /**.
     * Отображение меню
     */
    public void menuShow() {
        fillActions();
        for (UserActions action: userActions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**.
     * Выполнение выбранного действия
     * @param key - номер пункта меню
     */
    public void executeAction(int key) {
        userActions[key].execute(tracker, input);
    }
    /**.
     * Создаем внутренний класс дейcтвия пользователя ВЫХОД
     */
    private class Exit implements UserActions {
        /**.
         * Метод вывода номера пункта меню текущего действия
         * @return - вывод номера 0
         */
        public int key() {
            return 0;
        }
        /**.
         * Вывод названия пункта меню
         * @return - строка названия пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "EXIT");
        }

        /**.
         * Метод выполнения действия выход из программы
         * @param tracker - объект самого трекера
         * @param input - объект вводных данных
         */
        public void execute(Tracker tracker, Input input) {
            System.out.println("EXIT program");
        }
    }
    /**.
     * Создаем внутренний класс дейcтвия пользователя СОЗДАНИЕ ЗАЯВКИ
     */
    private class AddItem implements UserActions {
        /**.
         * Метод вывода номера пункта меню текущего действия
         * @return - вывод номера 1
         */
        public int key() {
            return 1;
        }
        /**.
         * Вывод названия пункта меню
         * @return - строка названия пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }

        /**.
         * Метод выполнения действия добавления новой заявки в трекер
         * @param tracker - объект самого трекера
         * @param input - объект вводных данных
         */
        public void execute(Tracker tracker, Input input) {
            String itemId = input.ask("Enter info Id: ");
            String itemName = input.ask("Enter Item name: ");
            String itemDesc = input.ask("Enter Item description: ");
            Item item = new Item(itemId, itemName, itemDesc);
            tracker.add(item);
            System.out.println("Item " + itemName + " created!");
            System.out.println("");
        }
    }
    /**.
     * Создаем внутренний класс дейcтвия пользователя ПОКАЗАТЬ ВСЕ
     */
    private class ShowAll implements UserActions {
        /**.
         * Метод вывода номера пункта меню текущего действия
         * @return - вывод номера 1
         */
        public int key() {
            return 2;
        }
        /**.
         * Вывод названия пункта меню
         * @return - строка названия пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }

        /**.
         * Метод выполнения действия отобразить все
         * @param tracker - объект самого трекера
         * @param input - объект вводных данных
         */
        public void execute(Tracker tracker, Input input) {
            Item[] items = tracker.findAll();
            if (items.length > 0) {
                System.out.println("Items list:");
                for (int i = 0; i < items.length; i++) {
                    System.out.print(items[i].getItemId() + " " + items[i].getItemName() + " " + items[i].getItemDesc());
                }
            } else {
                System.out.println("The tracker is EMPTY!");
            }
            System.out.println("");
            System.out.println("");
        }
    }
    /**.
     * Создаем внутренний класс дейcтвия пользователя ИЗМЕНЕНИЕ ЗАЯВКИ
     */
    private class ModifyItem implements UserActions {
        /**.
         * Метод вывода номера пункта меню текущего действия
         * @return - вывод номера 1
         */
        public int key() {
            return 3;
        }
        /**.
         * Вывод названия пункта меню
         * @return - строка названия пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Modify item");
        }

        /**.
         * Метод выполнения действия изменения заявки
         * @param tracker - объект самого трекера
         * @param input - объект вводных данных
         */
        public void execute(Tracker tracker, Input input) {
            System.out.println("Item " + " changed!");
            System.out.println("");
        }
    }
    /**.
     * Создаем внутренний класс дейcтвия пользователя УДАЛЕНИЕ ЗАЯВКИ
     */
    private class DeleteItem implements UserActions {
        /**.
         * Метод вывода номера пункта меню текущего действия
         * @return - вывод номера 1
         */
        public int key() {
            return 4;
        }
        /**.
         * Вывод названия пункта меню
         * @return - строка названия пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }

        /**.
         * Метод выполнения действия удаления заявки из трекера
         * @param tracker - объект самого трекера
         * @param input - объект вводных данных
         */
        public void execute(Tracker tracker, Input input) {
            String itemName = input.ask("Enter Item name to delete: ");
            Item itemToDelete = tracker.findByName(itemName);
            if (itemToDelete != null) {
                tracker.delete(itemToDelete);
                System.out.println("Item " + itemToDelete.getItemName() + " DELETED!");
            } else {
                System.out.println("There is no such info: " + itemName);
            }
        }
    }
    /**.
     * Создаем внутренний класс дейcтвия пользователя ПОИСКА ЗАЯВКИ ПО ID
     */
    private static class FindItemById implements UserActions {
        /**.
         * Метод вывода номера пункта меню текущего действия
         * @return - вывод номера 1
         */
        public int key() {
            return 5;
        }
        /**.
         * Вывод названия пункта меню
         * @return - строка названия пункта меню
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id");
        }

        /**.
         * Метод выполнения действия поиска заявки по Id
         * @param tracker - объект самого трекера
         * @param input - объект вводных данных
         */
        public void execute(Tracker tracker, Input input) {
            String itemId = input.ask("Enter Item Id to find: ");
            Item itemToFind = tracker.findById(itemId);
            if (itemToFind != null) {
                System.out.println("Item FOUND: " + itemToFind.getItemName());
            } else {
                System.out.println("Item with Id " + itemId + " NOT FOUND!");
            }
        }
    }

}

/**.
 * Создаем внутренний класс дейcтвия пользователя ПОИСКА ЗАЯВКИ ПО NAME
 */
class FindItemByName implements UserActions {
    /**.
     * Метод вывода номера пункта меню текущего действия
     * @return - вывод номера 1
     */
    public int key() {
        return 6;
    }
    /**.
     * Вывод названия пункта меню
     * @return - строка названия пункта меню
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Find item by Id");
    }

    /**.
     * Метод выполнения действия поиска заявки по Name
     * @param tracker - объект самого трекера
     * @param input - объект вводных данных
     */
    public void execute(Tracker tracker, Input input) {
        String itemname = input.ask("Enter Item Name to find: ");
        Item itemToFind = tracker.findByName(itemname);
        if (itemToFind != null) {
            System.out.println("Item FOUND: " + itemToFind.getItemId());
        } else {
            System.out.println("Item with Name " + itemname + " NOT FOUND!");
        }
    }
}
