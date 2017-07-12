package ru.job4j.loop;

/**.
* Класс факториала
* @version 1.0
* @since 11.07.2017
* @author Valeriy Gubskiy
*/
public class Factorial {
	/**.
	* Метод вычисляет факторал задаваемого целого числа
	* @param n - число, факториал которого требуется расчитать
	* @return - возвращете резульатат
	*/
	public int calc(int n) {
		int result = 1;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
		}
		return result;
	}
}