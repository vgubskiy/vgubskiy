package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс тестов Doctor
 */
public class DoctorTest {
    /**.
     * Создаем объект класса Doctor
     */
    private Doctor doc = new Doctor("Доктор",
            "Василий",
            "Смирнов",
            44,
            10,
            "Медицинское",
            "Терапевт");
    /**.
     * Создаем объект класса Pacient
     */
    private Pacient pac = new Pacient("Алексей", "Иванов", "Насморк");
    /**.
     * Тест метода heal
     */
    @Test
    public void whenDocHealPacientThenShowNameDocAndPacient() {

        String expect1 = "Доктор Василий Смирнов лечит пациента Алексей Иванов с диагнозом Насморк";
        String result1 = doc.heal(pac);
        assertThat(result1, is(expect1));

        pac.setDiagnose("Кашель");
        String expect2 = "Доктор Василий Смирнов лечит пациента Алексей Иванов с диагнозом Кашель";
        String result2 = doc.heal(pac);
        assertThat(result2, is(expect2));
    }
    /**.
     * Тест метода personalInfo
     */
    @Test
    public void whenPersonalInfoThenShowNameLastNameAge() {
        String expect = "Имя: Василий, Фамилия: Смирнов, Возраст: 44";
        String result = doc.personalInfo();
        assertThat(result, is(expect));
    }
}
