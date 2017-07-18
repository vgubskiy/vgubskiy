package ru.job4j.array;
import java.util.Arrays;
/**.
 * Класс удаления дубликатов из массива
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 17.07.2017
 */
public class ArrayDublicate {
	/**.
	 * метод удаляет дубликаты из массива
	 * @param array - исходный массив
	 * @return - массив без дубликатов
	 */
	public String[] remove(String[] array) {
        int len = array.length - 1;
        for (int i = 0; i <= len; i++) {
            String s = array[i];
            for (int j = i + 1; j <= len; j++) {
                if (s.equals(array[j])) {
                    array[j] = "";
                }
            }
        }
        int counter = 1;
        for (int i = 1; i <= len; i++) {
            if (array[i].equals("")) {
                for (int j = i + 1; j <= len; j++) {
                    if (!array[j].equals("")) {
                        array[i] = array[j];
                        array[j] = "";
                        counter++;
                        break;
                    }
                }
            } else {
                counter++;
                continue;
            }
        }
        return Arrays.copyOf(array, counter);
    }
}