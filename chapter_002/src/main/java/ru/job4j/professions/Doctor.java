package ru.job4j.professions;
/**.
 * Класс профессии ДОКТОР
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class Doctor extends Profession {
    /**.
     * Конструктор профессии Doctor
     * @param profession - профессия
     * @param firstName - имя
     * @param lastName - фамилия
     * @param age -возраст
     * @param stage - стаж
     * @param education - образование
     * @param specialization - специализация
     */
    Doctor(String profession,
           String firstName,
           String lastName,
           int age,
           int stage,
           String education,
           String specialization) {
        super(profession, firstName, lastName, age, stage, education, specialization);
    }
    /**.
     * Метод heal
     * @param pacient - объект типа Pacient
     * @return - строка с информацией о том кого лечит доктор
     */
    public String heal(Pacient pacient) {
        return getProfession() + " " + getFirstName() + " " + getLastName()
                + " лечит пациента " + pacient.getFirstName() + " " + pacient.getLastName()
                + " с диагнозом " + pacient.getDiagnose();
    }
}