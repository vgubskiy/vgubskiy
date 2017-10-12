package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс тестов Tracker
 */
public class TrackerTest {
    /**.
     * Создаем объект класса Tracker
     */
    private Tracker tracker = new Tracker();
    /**.
     * Создаем объект заявки
     */
    private Item item = new Item("item1", "item1Name", "item1Description");
    /**.
     * Тест метода add
     */
    @Test
    public void whenAddItemInTrackerThenItemInTracker() {
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /**.
     * Тест метода findById
     */
    @Test
    public void whenFindItemByIdThenGetItemWithThatId() {
        tracker.add(item);
        Item result = tracker.findById(item.getItemId());
        assertThat(result, is(item));
    }
    /**.
     * Тест метода findByName
     */
    @Test
    public void whenFindItemByNameThenGetItemWithThatName() {
        tracker.add(item);
        Item result = tracker.findByName(item.getItemName());
        assertThat(result, is(item));
    }
    /**.
     * Тест метода delete
     */
    @Test
    public void whenDeleteItemThenTrackerWithoutThisItem() {
        Item item = new Item("id10", "item10", "desc10");
        assertThat(tracker.add(item), is(item));
        tracker.delete(item);
        Item expected = null;
        assertThat(tracker.findById("id10"), is(expected));
    }
    /**.
     * Тест метода update
     */
    @Test
    public void whenUpdateItemThenTrackerWithUpdatedItem() {
        Item item = new Item("id20", "item20", "desc20");
        assertThat(tracker.add(item), is(item));
        Item newItem = new Item("id20", "item22", "desc22");
        tracker.update(newItem);
        assertThat(tracker.findById("id20").getItemName(), is("item22"));
    }
    /**.
     * Тест метода findAll
     */
    @Test
    public void whenFindAllinTrackerThenRecieveAllItems() {
        Item[] expect = new Item[3];
        for (int i = 0; i < 3; i++) {
            Item item = new Item("id" + i, "ask" + i, "desc" + i);
            tracker.add(item);
            expect[i] = item;
        }
        assertThat(tracker.findAll(), is(expect));
    }
}
