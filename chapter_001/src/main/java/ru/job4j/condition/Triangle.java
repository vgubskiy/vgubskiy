package ru.job4j.condition;

/**.
* Класс фигуры ТРЕУГОЛЬНИК
* по заданным координатам трех точек
* @version 1.0
* @since 07.07.2017
* @author Valeriy Gubskiy
*/
public class Triangle {
	/**.
	* Объект первой точки а
	*/
	private Point a;
	/**.
	* Объект второй точки b
	*/
	private Point b;
	/**.
	* Объект третьей точки c
	*/
	private Point c;
	/**.
	* Конструктор
	* @param a - точка a
	* @param b - точка b
	* @param c - точка c
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**.
	* Метод вычисляет площадь треугольника
	* @return - возвращает значение площади
	*/
	public double area() {
		return Math.abs(((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2);
	}
}