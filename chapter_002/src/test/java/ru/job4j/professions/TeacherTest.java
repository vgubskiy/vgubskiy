package ru.job4j.professions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
 * Класс тестов Doctor
 */
public class TeacherTest {
    /**.
     * Создаем объект класса Teacher
     */
    private Teacher teacher = new Teacher("Марина",
            "Иванова",
            35,
            "Биология");
    /**.
     * Создаем объект класса Student
     */
    private Student student = new Student("Андрей", "Конюхов");

    /**.
     * Тест метода teach
     */
    @Test
    public void whenTeacherTeachStudentThenShowNameTeacherAndStudent() {
        String expect = "Учитель Марина Иванова учит студента Андрей Конюхов";
        String result = teacher.teach(student);
        assertThat(result, is(expect));
    }
    /**.
     * Тест метода profInfo
     */
    @Test
    public void whenProfInfoThenShowProfSubjectAndStage() {
        teacher.setStage(5);
        String expect = "Образование: Педагогическое, преподаваемый предмет: Биология, стаж: 5";
        String result = teacher.profInfo();
        assertThat(result, is(expect));
    }
}
