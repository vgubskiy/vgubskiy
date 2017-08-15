package ru.job4j.tracker;

import java.util.Arrays;

/**.
 * Класс трекера
 */
public class Tracker {
    /**.
     * Массив харнилища заявок
     */
    private Item[] items = new Item[100];

    /**.
     * Метод добавления заявки в трекер
     * @param item - объект заявки
     * @return - возвращает добавленную заявку
     */
    public Item add(Item item) {
        int position = 0;
        while (position < 100 && items[position] != null) {
            position++;
        }
        items[position] = item;
        return items[position];
    }
    /**.
     * Метод поиска заявки по ID
     * @param id - айди заявки, которую необходимо найти
     * @return - объект искомой заявки
     */
    public Item findById(String id) {
        Item result = null;
        for (int position = 0; position < 100; position++) {
            if (items[position] != null && items[position].getItemId().equals(id)) {
                result = items[position];
                break;
            }
        }
        return result;
    }

    /**.
     * Метод поиска заявки по имени
     * @param name - имя заявки, которую необходимо найти
     * @return - объект искомой заявки
     */
    public Item findByName(String name) {
        Item result = null;
        for (int position = 0; position < 100; position++) {
            if (items[position] != null && items[position].getItemName().equals(name)) {
                result = items[position];
                break;
            }
        }
        return result;
    }

    /**.
     * Метод вывода всех заявок
     * @return - массив всех заявок
     */
    public Item[] findAll() {
        int resultPosition = 0;
        Item[] result = new Item[100];
        for (int itemPosition = 0; itemPosition < 100; itemPosition++) {
            if (items[itemPosition] != null) {
                result[resultPosition] = items[itemPosition];
                resultPosition++;
            }
        }
        result = Arrays.copyOf(result, resultPosition);
        return result;
    }

    /**.
     * Метод удаления заявки по ID из трекера
     * @param item - объект удаляемой заявки
     */
    public void delete(Item item) {
        for (int position = 0; position < 100; position++) {
            if (items[position].getItemId().equals(item.getItemId())) {
               items[position] = null;
               break;
            }
        }
    }

    /**.
     * Метод замены заявки
     * @param item - объект заменяемой заявки
     */
    public void update(Item item) {
        for (int position = 0; position < 100; position++) {
            if (items[position].getItemId().equals(item.getItemId())) {
                items[position] = item;
                break;
            }
        }
    }
}
