package ru.job4j.professions;
/**.
 * Класс пациента
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class Pacient {
    /**.
     * Поле имя
     */
    private String firtstName;
    /**.
     * Поле фаиилия
     */
    private String lastName;
    /**.
     * Поле диагноз
     */
    private String diagnosis;

    /**.
     * Геттер для получения имени пацинета
     * @return - строка имени
     */
    public String getFirstName() {
        return firtstName;
    }
    /**.
     * Геттер для получения фамилии пацинета
     * @return - строка фамилии
     */
    public String getLastName() {
        return lastName;
    }
    /**.
     * Геттер для получения диагноза пацинета
     * @return - строка диагноза
     */
    public String getDiagnose() {
        return diagnosis;
    }

    /**.
     * Сеттер для установки имени пацинета
     * @param firtstName  - строка имени
     */
    public void setFirstName(String firtstName) {
        this.firtstName = firtstName;
    }
    /**.
     * Сеттер для установки фамилии пацинета
     * @param lastName  - строка фамилии
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**.
     * Сеттер для установки диагноза пацинета
     * @param diagnosis  - строка диагноза
     */
    public void setDiagnose(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**.
     * Конструктор
     * @param firtstName - имя
     * @param lastName - фамилия
     * @param diagnosis - диагноз
     */
    Pacient(String firtstName, String lastName, String diagnosis) {
        this.firtstName = firtstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
    }
}
