package ru.job4j.calculator;

/**.
* Класс калькулятора. Выполняет 4 математические операции:
* сложение, вычитание, умножение, деление
* @author Valeriy Gubskiy
* @version 1.0
* @since 27.06.2017
*/

public class Calculator {
	/**.
	* Класс калькулятора
	*/
	private double result;
	/**.
	* Метод сложения
	* @param first первое число
	* @param second второе число
	*/
	void add(double first, double second) {
		this.result = first + second;
	}
	/**.
	* Метод вычитания
	* @param first первое число
	* @param second второе число
	*/
	void substruct(double first, double second) {
		this.result = first - second;
	}
	/**.
	* Метод деления
	* @param first первое число
	* @param second второе число
	*/
	void div(double first, double second) {
		this.result = first / second;
	}
	/**.
	* Метод умножения
	* @param first - первое число
	* @param second - второе число
	*/
	void multiple(double first, double second) {
		this.result = first * second;
	}
	/**.
	* Метод возвращает значение результата матемтической операции
	* @return this.result - результат
	*/
	double getResult() {
		return this.result;
	}
}