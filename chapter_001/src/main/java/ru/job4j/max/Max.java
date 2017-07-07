package ru.job4j.max;

/**.
* Класс для определения максимального
* значения из двух целочисленных чисел
* @version 1.0
* @since 07.07.2017
* @author Valeriy Gubskiy
*/
public class Max {
	/**.
	* Метода возвращает максимальное значение из двух
	* @param first - первое целочисленное значение
	* @param second - второе целочисленное значение
	* @return - возвращет максимальное из двух
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
}