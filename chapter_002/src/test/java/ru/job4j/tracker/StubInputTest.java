package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс тестов пунктов меню
 */
public class StubInputTest {
    /**.
     * Создаем объект класса Tracker
     */
    private Tracker tracker = new Tracker();
    /**.
     * Тест 1 пункта меню - добавление заявки в трекер
     */
    @Test
    public void whenChooseAddNewItemThenNewItemInTracker() {
        /**.
         * Создаем объект вводных данных
         */
        StubInput input = new StubInput(1, "id2", "name2", "desc2", 0);
        /**.
         * Создаем объект меню
         */
        StartUi startUi = new StartUi(tracker, input);
        startUi.init();

        assertThat(tracker.findAll()[0].getItemName(), is("name2"));
    }
}
