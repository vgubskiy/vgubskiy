package ru.job4j.tracker;

import java.sql.Timestamp;

/**.
 * Класс заявки
 */
public class Item {
    /**.
     * Уникальный идентификатор заявки
     */
    private String id;
    /**.
     * Название заявки
     */
    private String name;
    /**.
     * Описание заявки
     */
    private String desc;
    /**.
     * Дата создания заявки
     */
    private long created;
    /**.
     * Массив с коменатриями к заявке
     */
    private String[] comments;
    /**.
     * Констурктор заявки
     * @param id - айди
     * @param name - имя
     * @param desc - описание
     */
    public Item(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.created = timestamp.getTime();
    }
    /**.
     ********** ГЕТТЕРЫ ***********
     */
    /**.
     * ID зявки
     * @return - строка ID
     */
    public String getItemId() {
        return id;
    }
    /**.
     * Имя зявки
     * @return - строка имени
     */
    public String getItemName() {
        return name;
    }
    /**.
     * Описание заявки
     * @return - строка описания
     */
    public String getItemDesc() {
        return desc;
    }
}
