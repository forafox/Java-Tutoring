# Уроки программирования на Java
## Адаптирован под курс ИТМО "Программирование на Java"
1. За теоретическую основу взята книга "Философия Java" Брюс Эккель
2. Некоторые задания, теоретические вопросы взяты с лабораторных работ ИТМО по программированию на Java

### План занятий
1. Введение
    + Введение в объекты
    + Все является объектом
    + Операторы
    + Управляющие конструкции
    > Домашняя работа - лабораторная №1
2. Занятие 2
    + Знакомство с Git.
        + Основы работы с удаленным репозиторием
    + Инициализация и завершение
      + Конструкторы
      + Перезагрузка методов
        + Конструкторы по умолчанию
        + Ключевое слово this
        + Ключевое слово static
      + Очистка: финализация и уборка мусора
   > Домашняя работа - домашнее задание №2
3. Занятие 3
   + Инициализация членов класса
      + Явная инициализация
   + Инициализация конструктором
      + Порядок инициализации
      + Инициализация статических данных
      + Явная инициализация статических данных
         + Инициализация нестатических данных экземпляра
   + Инициализация массивов
      + Списки аргументов переменной длины
   + Перечисления (Введение)
   > Домашняя работа - домашнее задание №3
### Домашние задания
4. Занятие 4. Глава 6 Управление доступом
    + Пакет как библиотечный модуль
    + Спецификаторы доступа Java
      + Доступ в пределах пакета
      + public
      + private
      + protected
    + Синтаксис композиции. Глава 7. Повторное использование классов
    + Синтаксис наследования
    + Сочетание композиции и наследования
5. Занятие 5. 
    + Восходящее преобразование
    + Ключевое слово final
        + Потеря типа объекта
    + Связывание "метод-вызов" (late binding) Позднее связывание
    + Конструкторы и полиморфизм
        + Порядок вызова конструктора
        + Наследование и заверщающие действия
        + Поведение полиморфных методов при вызове из конструктора
    + Наследование при проектировании
        + Нисходящее преобразование и динамическое определение типов
6. Занятие 6
    + Абстрактные классы и методы

2. [Лабораторная работа №1](#homework1)
2. [Домашнее задание №2](#homework2)
3. [Домашнее задание №3](#homework3)
4. [Домашнее задание №4](#homework4)
5. [Домашнее задание №5](#homework5)

### Описание домашних заданий
####  Домашнее задание №1 <a name="homework1"></a>
//TO DO
####  Домашнее задание №2 <a name="homework2"></a>
##### Задание 1: Конструктор
Создайте класс "Книга" (`Book`), у которого есть следующие поля:

- Название книги (`title`)
- Автор книги (`author`)
- Год выпуска (`year`)
- Количество страниц (`pages`)

Напишите конструктор класса, который будет принимать значения для всех полей при создании экземпляра класса. Создайте несколько объектов этого класса и выведите информацию о каждой книге.

##### Задание 2: Ключевое слово `this`
Модифицируйте класс "Книга" так, чтобы при создании экземпляра класса значения полей передавались через параметры конструктора, а затем присваивались полям с использованием ключевого слова `this`.

##### Задание 3: Повторное использование `this()` в конструкторе вызывает другой конструктор.
Добавьте в класс "Книга" второй конструктор, который принимает только название книги и автора, а год выпуска и количество страниц устанавливаются в значения по умолчанию. Используйте ключевое слово `this` для вызова первого конструктора, чтобы избежать дублирования кода. Создайте объекты, используя оба конструктора, и выведите информацию о книгах.

##### Задание 4: Перезагрузка методов
Добавьте в класс "Книга" метод `getSummary()`, который будет возвращать краткое описание книги. Затем создайте еще один метод `getSummary()`, но с другой сигнатурой (например, принимающий параметр), который будет возвращать более подробное описание книги. Перезагрузите метод `getSummary()` с использованием разных типов параметров. Выведите результат вызова каждого из методов для нескольких книг.

####  Домашнее задание №3 <a name="homework3"></a>
##### Задание 1: Инициализация статических и нестатических членов класса
1. Создайте класс под названием "Car", представляющий автомобиль. У класса должны быть следующие поля:
   + модель автомобиля (не статическое поле)
   + год выпуска (не статическое поле)
   + количество колес (статическое поле)

2. Добавьте конструктор для инициализации модели и года выпуска.
3. Создайте блок инициализации static{}, который устанавливает значение статического поля "количество колес" равным 4.
4. Напишите метод "printInfo()", который выводит информацию о модели, годе выпуска и количестве колес на экран.
5. В методе main() создайте несколько объектов класса Car с разными характеристиками и вызовите метод "printInfo()" для каждого объекта
##### Задание 2: Использование Enum
1. Создайте перечисление (Enum) под названием "Season", представляющее собой времена года: Зима, Весна, Лето, Осень.
2. По аналогии с реализацией метода `describe` класса `Burrito` реализуйте метод, предоставляющий описание времен года.
##### Домашнее задание задание 4: Повторение теории. Ответ на теоретические вопросы. <a name="homework4"></a>
##### Домашнее задание задание 5: Модификаторы доступа. Наследование и Композиция <a name="homework5"></a>
Разработайте иерархию классов для управления автомобилями с использованием следующих концепций:
1. Модификаторы доступа:
   + Примените различные модификаторы доступа к полям и методам в классах.
2. Наследование:
   + Создайте базовый абстрактный класс Car с общими характеристиками (марка, год выпуска, текущая скорость).Отнаследуйте от него классы ElectricCar и GasolineCar, добавив соответствующие поля и методы.
3. Композиция:
   + Создайте класс Engine с методами для управления скоростью автомобиля.Используйте композицию, чтобы включить объект класса Engine в классы ElectricCar и GasolineCar.
4. Восходящее преобразование:
   + Реализуйте пример, демонстрирующий восходящее преобразование(Ex. Класс гонка, который как-то манипулирует с машинами)
5. Ключевое слово final:
   + Создайте класс RacingCar, который расширяет класс GasolineCar и имеет поле для хранения максимальной скорости, объявленное с ключевым словом final.
