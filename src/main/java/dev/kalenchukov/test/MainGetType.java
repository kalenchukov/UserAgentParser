package dev.kalenchukov.test;

import dev.kalenchukov.useragentparser.Browser;
import dev.kalenchukov.useragentparser.Device;
import dev.kalenchukov.useragentparser.OperatingSystem;

class MainGetType
{
	public static void main(String[] args)
	{
		// Возвращает название браузера по идентификатору
		System.out.println(Browser.getById("3"));

		// Возвращает идентификатор браузера по названию
		System.out.println(Browser.getByName("Firefox"));

		// Возвращает список всех браузеров
		System.out.println(Browser.getAll());

		// Возвращает тип устройства по идентификатору
		System.out.println(Device.getById("2"));

		// Возвращает идентификатор устройства по типу
		System.out.println(Device.getByType("Mobile"));

		// Возвращает все типы устройств
		System.out.println(Device.getAll());

		// Возвращает название операционной системы по идентификатору
		System.out.println(OperatingSystem.getById("7"));

		// Возвращает идентификатор операционной системы по названию
		System.out.println(OperatingSystem.getByName("Linux"));

		// Возвращает список всех операционных систем
		System.out.println(OperatingSystem.getAll());
	}
}
