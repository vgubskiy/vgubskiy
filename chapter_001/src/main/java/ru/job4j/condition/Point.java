package ru.job4j.condition;

/**.
* Класс для определения положения точки
* по заданным координатам Х и У
* @version 1.0
* @since 07.07.2017
* @author Valeriy Gubskiy
*/
public class Point {
	/**.
	* Координата Х точки
	*/
	private int x;
	/**.
	* Координата У точки
	*/
	private int y;
	/**.
	* Конструктор
	* @param x - координата Х
	* @param y - координата У
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**.
	* Метод возвращает координату Х
	* @return - возвращает значание координаты Х
	*/
	public int getX() {
		return this.x;
	}
	/**.
	* Метод возвращает координату Y
	* @return - возвращает значание координаты Y
	*/
	public int getY() {
		return this.y;
	}
	/**.
	* Метод проверяет принадлежит ли заданная точка с координатами X и Y
	* функции y(x) = a * x + b
	* @param a - число а в функции
	* @param b - число b в функции
	* @return - возвращете true, либо false
	*/
	public boolean is(int a, int b) {
		return this.y == a * this.x + b;
	}
}