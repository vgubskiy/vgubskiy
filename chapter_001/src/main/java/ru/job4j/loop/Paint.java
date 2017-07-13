package ru.job4j.loop;

/**.
 * Класс Paint
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 13.07.2017
 */
 public class Paint {
	/**.
	 * Метот псотроения пирамиды
	 * @param h - высота пирамиды
	 * @return - строка
	 */
	public String piramid(int h) {
		//создаем объект для всей пирамиды
		StringBuilder piramida = new StringBuilder("");
		//вычисляем количество символов в основании пирамиды
		int endline = 1 + (2 * (h - 1));
		//проходим циклом по каждой сроке пирамиды
		for (int i = 1; i <= h; i++) {
			//создаем строку для текущего уровня пирамиды
			StringBuilder line = new StringBuilder("");
			//вычисялем количество отображаемых маркеров на текущем уровне
			int markers = 1 + (2 * (i - 1));
			//вычисляем количество пробелов на текущем уровне
			int spaces = endline - markers;
			//заполняем текущий уровень необходимым числом пробелов
			while (spaces != 0) {
				line.append(" ");
				spaces--;
			}
			//вычисляем длину уровня
			int length = line.length();
			//вставялем в строку уровня наши маркеры
			while (markers != 0) {
				line.insert(length / 2, '^');
				markers--;
			}
			//добавляем к пирамиду текущий уровень
			piramida.append(line);
			//если уровень не основание пирамиды добавляем перенос строки
			if (i < h) {
				piramida.append(System.getProperty("line.separator"));
			}
		}
		//возвращаем нашу пирамиду в виду строки
		return piramida.toString();
	}
 }