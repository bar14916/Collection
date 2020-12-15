package com.company;

public class Main {

    public static void main(String[] args) {
/*Создать класс Box, содержащий следующие характеристики коробки: длина,
ширина, высота, вес. Создать коллекцию, содержащую объекты класса Box, и
выполнить над её элементами следующие операции:
а. вычислить суммарный объём и суммарный вес всех коробок;
б. вывести на экран размеры самой лёгкой и самой тяжёлой коробок;
в. удалить из коллекции все коробки, объём которых превышает 100 литров;
г. распределить коробки по двум другим коллекциям в зависимости от их веса:
если вес коробки меньше или равен среднему весу всех коробок, считать
коробку лёгкой, иначе – тяжёлой.*/
        Box b1 = new Box(6, 4, 3, 34);
        Box b2 = new Box(2, 4, 5, 74);
        Box b3 = new Box(6, 6, 9, 44);
        Box b4 = new Box(3, 5, 9, 54);
        Box b5 = new Box(8, 1, 6, 14);
        Box b6 = new Box(3, 2, 3, 40);

        Results.getResults(Box.boxArrayList);
    }
}
