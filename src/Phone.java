/*1. Класс Phone.
  + Создайте класс Phone, который содержит переменные number, model и weight.
  + Создайте три экземпляра этого класса.
  + Выведите на консоль значения их переменных.
  + Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
  + Выводит на консоль сообщение “Звонит {name}”.
  + Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
  + Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
  + Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
  + Добавить конструктор без параметров.
  + Вызвать из конструктора с тремя параметрами конструктор с двумя.
   Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
    Вызвать этот метод.*/
public class Phone {

    private int number;
    private String model;
    private double weight;


    @Override
    public String toString() {
        return number + " " + model + " " + weight;
    }

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name);
        System.out.println(number);
    }
}
