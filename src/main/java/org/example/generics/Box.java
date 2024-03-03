package org.example.generics;


//Реализуйте класс Box. Этот класс будет хранить одно значение. У класса должен быть конструктор, который на
// вход принимает начальное значение, а также у класса должен быть метод getValue(), который может вернуть
// установленное при создании значение. Единственная загвоздка - класс должен уметь хранить значение любого типа.
// Подумайте, как вы будете решать задачу на данном этапе. А в следующих уроках мы узнаем, как это делается при
// помощи дженериков
public class Box {

    private final Object obj;

    public Box (Object obj) {
        this.obj = obj;
    }

    public Object getValue() {
        return obj;
    }

    public static void main(String[] args) {
//        var box = new Box("word");
//        var value = (String) box.getValue(); // word
//        System.out.println(value);


        var box = new Box(10);
        var value = (Integer) box.getValue(); // 10
        System.out.println(value);

    }

}
