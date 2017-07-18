package ru.job4j.array;

/**.
 * Класс работы со строками
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 18.07.2017
 */
public class StringContains {
	/**.
	 * метод проверяет если ли в исходной строке заданная строка
	 * @param orig - исходная строка
	 * @param sub - поисковая строка
	 * @return - true или false
	 */
	public boolean cont(String orig, String sub) {
        int lenOrig = orig.length();
        int lenSub = sub.length() - 1;
        for (int i = 0; i < lenOrig; i++) {
            if (orig.charAt(i) == sub.charAt(0) && i + lenSub < lenOrig && orig.charAt(i + lenSub) == sub.charAt(lenSub)) {
                if (orig.substring(i, i + lenSub + 1).equals(sub)) {
                    return true;
                }
            }
        }
        return false;
    }
}