package ru.job4j.professions;
/**.
 * Класс професии
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class Profession {
    /**
     * .
     * Поле профессия
     */
    private String profession;
    /**
     * .
     * Поле имя
     */
    private String firstName;
    /**
     * .
     * Поле фамилия
     */
    private String lastName;
    /**
     * .
     * Поле специальность
     */
    private String specialization;
    /**
     * .
     * Поле образование
     */
    private String education;
    /**
     * .
     * Поле стаж
     */
    private int stage;
    /**
     * .
     * Поле возраст
     */
    private int age;

    /**
     * .
     * Конструктор профессии со всеми параметрами
     *
     * @param profession     - профессия
     * @param firstName      - имя
     * @param lastName       - фамилия
     * @param age            -возраст
     * @param stage          - стаж
     * @param education      - образование
     * @param specialization - специализация
     */
    Profession(String profession,
               String firstName,
               String lastName,
               int age,
               int stage,
               String education,
               String specialization) {
        this.profession = profession;
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.specialization = specialization;
        this.education = education;
        this.stage = stage;
    }

    /**
     * .
     * ВТорой констркутор только с 3 параметрами
     *
     * @param firstName - имя
     * @param lastName  - фамилия
     * @param age       - возраст
     */
    Profession(String firstName,
               String lastName,
               int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * .
     * метод возврщает инфорамцию о профессии
     *
     * @return - строка с образованием, специализацией и стажем
     */
    public String profInfo() {
        return "Образование: " + education + ", "
                + "специализация: " + specialization + ", "
                + "стаж: " + stage;
    }

    /**
     * .
     * метод возврщает инфорамцию о человеке
     *
     * @return - строка с фио и полом
     */
    public String personalInfo() {
        return "Имя: " + getFirstName() + ", "
                + "Фамилия: " + getLastName() + ", "
                + "Возраст: " + getAge();
    }

    /**
     * .
     * геттер для "профессия"
     *
     * @return - возвращает профессию
     */
    protected String getProfession() {
        return profession;
    }

    /**
     * .
     * геттер для "имя"
     *
     * @return - возвращает имя
     */
    protected String getFirstName() {
        return firstName;
    }

    /**
     * .
     * геттер для "фамилия"
     *
     * @return - возвращает фамилию
     */
    protected String getLastName() {
        return lastName;
    }

    /**
     * .
     * геттер для "возраст"
     *
     * @return - возвращает возраст
     */
    protected int getAge() {
        return age;
    }

    /**
     * .
     * геттер для "стаж"
     *
     * @return - возвращает стаж
     */
    protected int getStage() {
        return stage;
    }

    /**
     * .
     * геттер для "образование"
     *
     * @return - возвращает образование
     */
    protected String getEducation() {
        return education;
    }

    /**
     * .
     * геттер для "специальность"
     *
     * @return - возвращает специальность
     */
    protected String getSpecialization() {
        return specialization;
    }

    /**
     * .
     * сеттер для "профессия"
     *
     * @param profession - профессия
     */
    protected void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * .
     * сеттер для "имя"
     *
     * @param firstName - имя
     */
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * .
     * сеттер для "фамилия"
     *
     * @param lastName - фамилия
     */
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * .
     * сеттер для "возраст"
     *
     * @param age - возраст
     */
    protected void setAge(int age) {
        this.age = age;
    }

    /**
     * .
     * сеттер для "стаж"
     *
     * @param stage - стаж
     */
    protected void setStage(int stage) {
        this.stage = stage;
    }

    /**
     * .
     * сеттер для "образование"
     *
     * @param education - образование
     */
    protected void setEducation(String education) {
        this.education = education;
    }

    /**
     * .
     * сеттер для "специальность"
     *
     * @param specialization - специализация
     */
    protected void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
