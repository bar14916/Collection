package com.company;

import java.util.ArrayList;

public class Box {
    static ArrayList<Box> boxArrayList = new ArrayList<>();
    private final int length;
    private final int width;
    private final int height;
    private final int weight;

    Box(int length, int width, int height, int weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        boxArrayList.add(this);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}