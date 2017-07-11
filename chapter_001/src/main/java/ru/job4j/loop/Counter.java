package ru.job4j.loop;

/**.
* Класс считает числа в заданном диапазоне
* @version 1.0
* @since 10.07.2017
* @author Valeriy Gubskiy
*/
public class Counter {
	/**.
	* Метод считает сумму четных чисел в заданном диапазоне
	* @param start - начало диапазона
	* @param finish - конец диапазона
	* @return - возвращете сумму
	*/
	public int add(int start, int finish) {
		int summ = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				summ += i;
			}
		}
		return summ;
	}
}