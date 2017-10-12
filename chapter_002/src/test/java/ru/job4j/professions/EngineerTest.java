package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс тестов Engineer
 */
public class EngineerTest {
    /**.
     * Создаем объект класса Engineer
     */
    private Engineer eng = new Engineer("Акрадий",
            "Попов",
            55);
    /**.
     * Создаем объект класса BuildObject
     */
    private BuildObject buildObject = new BuildObject("Мост", "Москва");

    /**.
     * Тест метода build
     */
    @Test
    public void whenEngineerBuildObjectThenShowEngineerNameAndObjectName() {
        String expect = "Инженер Акрадий Попов занимается строительством Мост в стране Москва";
        String result = eng.build(buildObject);
        assertThat(result, is(expect));
    }
    /**.
     * Тест метода project
     */
    @Test
    public void whenEngineerProjectThenShowWorkingArea() {
        eng.setWork("Речные сооружения");
        String expect = "Инженер Акрадий Попов проектирует объекты в области Речные сооружения";
        String result = eng.project();
        assertThat(result, is(expect));
    }
}
