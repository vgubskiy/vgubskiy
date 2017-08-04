package ru.job4j.professions;
/**.
 * Класс студента
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class Student {
    /**.
     * Поле имя
     */
    private String firtstName;
    /**.
     * Поле фамилия
     */
    private String lastName;
    /**.
     * Конструктор класса Student
     * @param firtstName - имя студента
     * @param lastName - фамилия студента
     */
    Student(String firtstName, String lastName) {
        this.firtstName = firtstName;
        this.lastName = lastName;
    }
    /**.
     * Геттер поля имя
     * @return - имя студента
     */
    public String getFirstName() {
        return this.firtstName;
    }
    /**.
     * Геттер поля фамилия
     * @return - фамилия студента
     */
    public String getLastName() {
        return this.lastName;
    }
    /**.
     * Сеттер поля имя
     * @param firtstName  - имя студента
     */
    public void setFirstName(String firtstName) {
        this.firtstName = firtstName;
    }
    /**.
     * Сеттер поля фамилия
     * @param lastName  - фамилия студента
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
