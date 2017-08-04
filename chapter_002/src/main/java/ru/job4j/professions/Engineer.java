package ru.job4j.professions;
/**.
 * Класс профессии ИНЖЕНЕР
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 02.08.2017
 */
public class Engineer extends Profession {
    /**.
     * Область работы инженера
     */
    private String work;
    /**.
     * Конструктор для Engineer с тремя параметрами
     * @param firstName - имя
     * @param lastName - фамилия
     * @param age -возраст
     */
    Engineer(String firstName,
            String lastName,
            int age) {
        super(firstName, lastName, age);
        super.setProfession("Инженер");
        super.setAge(0);
    }
    /**.
     * метод build
     * @param object - объект типа buildObject (то, что строит инжинер)
     * @return - строка с инофрмацией от том, что строит инжинер
     */
    public String build(BuildObject object) {
        return getProfession() + " " + getFirstName()
                + " " + getLastName() + " занимается строительством "
                + object.getName() + " в стране " + object.getCountry();
    }
    /**.
     * метод build
     * @return - строка с инофрмацией от том проектированием каких объектов занимется инженер
     */
    public String project() {
        return getProfession() + " " + getFirstName()
                + " " + getLastName() + " проектирует объекты в области "
                + work;
    }
    /**.
     * Геттер для области работы
     * @return - возвращает область работы
     */
    public String getWork() {
        return work;
    }
    /**.
     * Cеттер для области работы
     * @param work  - устанавливает области работы
     */
    public void setWork(String work) {
        this.work = work;
    }
}
