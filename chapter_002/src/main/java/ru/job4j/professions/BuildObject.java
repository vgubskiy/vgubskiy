package ru.job4j.professions;
/**.
 * Класс строительного объекта
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class BuildObject {
    /**.
     * Поле название объекта
     */
    private String name;
    /**.
     * Поле страна
     */
    private String country;
    /**.
     * Конструктор класса BuildObject без страны
     * @param name - название объекта
     */
    BuildObject(String name) {
        this.name = name;
    }
    /**.
     * Конструктор класса BuildObject со страной
     * @param name - название объекта
     * @param country - страна где строится объект
     */
    BuildObject(String name, String country) {
        this.name = name;
        this.country = country;
    }
    /**.
     * Геттер поля названия объекта
     * @return - название объекта
     */
    public String getName() {
        return name;
    }
    /**.
     * Геттер поля страны
     * @return - страна
     */
    public String getCountry() {
        return country;
    }
    /**.
     * Cеттер поля названия объекта
     * @param name  - название объекта
     */
    public void setName(String name) {
        this.name = name;
    }
    /**.
     * Cеттер поля страны
     * @param country - страна
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
