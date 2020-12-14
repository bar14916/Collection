package com.company;

import java.util.*;

public class Results {
    public static void getResults(ArrayList<Box> boxArrayList) {
        int allWeight = 0;
        int allVolume = 0, volume;
        int size = boxArrayList.size();
        double averageWeight;
        Box tmp;

        //поиск самой легкой и самой тяжелой коробки
        boxArrayList.sort(Comparator.comparing(Box::getWeight));
        System.out.printf("Самая тяжелая коробка имеет размеры - %dx%dx%d, самая легкая коробка имеет размеры - %dx%dx%d\n",
                boxArrayList.get(boxArrayList.size() - 1).getLength(), boxArrayList.get(boxArrayList.size() - 1).getWidth(),
                boxArrayList.get(boxArrayList.size() - 1).getHeight(), boxArrayList.get(0).getLength(),
                boxArrayList.get(0).getWidth(), boxArrayList.get(0).getHeight());

        //поиск суммарного веса и объема
        Iterator<Box> iterator = boxArrayList.iterator();
        while (iterator.hasNext()) {
            tmp = iterator.next();
            allWeight += tmp.getWeight();
            volume = tmp.getLength() * tmp.getWidth() * tmp.getHeight();
            if (volume > 100) iterator.remove();
            allVolume += volume;
        }
        System.out.printf("Суммарный вес - %d, суммарный объем - %d\n", allWeight, allVolume);

        //распределение на два списка
        ArrayList<Box> boxArrayList1 = new ArrayList<>();
        ArrayList<Box> boxArrayList2 = new ArrayList<>();
        for (Box t : boxArrayList) {
            if (t.getWeight() > allWeight / size) boxArrayList1.add(t);
            else boxArrayList2.add(t);
        }
        System.out.printf("коробок меньше 100 л - %d шт, из них:\n", boxArrayList.size());
        System.out.printf("тяжелых коробок - %d шт\n", boxArrayList1.size());
        System.out.printf("легких коробок - %d шт\n", boxArrayList2.size());
    }
}