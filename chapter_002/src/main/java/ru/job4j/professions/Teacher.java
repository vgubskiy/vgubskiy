package ru.job4j.professions;
/**.
 * Класс профессии УЧИТЕЛЬ
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class Teacher extends Profession {
    /**.
     * Предмет обучения
     */
    private String subject;
    /**.
     * Конструктор профессии Teacher
     * @param firstName - имя
     * @param lastName - фамилия
     * @param age -возраст
     * @param subject - преподваваемый предмет
     */
    Teacher(String firstName,
            String lastName,
            int age,
            String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
        super.setProfession("Учитель");
        super.setEducation("Педагогическое");
        super.setAge(0);
    }
    /**.
     * Геттер для пердмета обучения
     * @return - возвращает предмет обучения
     */
    public String getSubject() {
        return subject;
    }
    /**.
     * Cеттер для пердмета обучения
     * @param subject  - устанавливает предмет обучения
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**.
     * Метод teach
     * @param student - объект типа Student
     * @return - строка с инофрмацией от том, кого учит учитель
     */
    public String teach(Student student) {
        return getProfession() + " " + getFirstName()
                + " " + getLastName() + " учит студента "
                + student.getFirstName() + " " + student.getLastName();
    }
    /**.
     * Переопределение родительского метода profInfo
     * @return - инофрмация о образовании, преподаваемом предмете и стаже
     */
    @Override
    public String profInfo() {
        return "Образование: " + super.getEducation() + ", "
                + "преподаваемый предмет: " + subject + ", "
                + "стаж: " + super.getStage();
    }
}
