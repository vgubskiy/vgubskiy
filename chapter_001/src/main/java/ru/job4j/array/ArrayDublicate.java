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
        int unique = len + 1;
        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (array[i].equals("")) {
                    while (j <= len && array[j].equals("")) {
                        j++;
                    }
                    if (j > len) {
                        i = len + 1;
                        break;
                    }
                    array[i] = array[j];
                    array[j] = "";
                } else {
                    if (array[i].equals(array[j])) {
                        array[j] = "";
                        unique--;
                    }
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}