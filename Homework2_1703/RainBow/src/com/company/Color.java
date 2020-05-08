package com.company;

public class Color { //Создали класс

    private final int Red = 1;    //Данные описываемого классом объекта
    private final int Orange = 2;
    private final int Yellow = 3;
    private final int Green = 4;
    private final int Aqua = 5;
    private final int Blue = 6;
    private final int Purple = 7;
    private int colorNumber;
    private String name;

    public Color(int ColorNumber) {//Конструктор
        this.colorNumber = ColorNumber;
    }//Конструктор

    public int getNumber() {        //метод 1
        return colorNumber;
    } //метод1

    public String getName() {     //метод 2

        switch (colorNumber) {
            case Red:
                name = "Красный";
                break;
            case Orange:
                name = "Оранжевый";
                break;
            case Yellow:
                name = "Желтый";
                break;
            case Green:
                name = "Зеленый";
                break;
            case Aqua:
                name = "Голубой";
                break;
            case Blue:
                name = "Синий";
                break;
            case Purple:
                name = "Фиолетовый";
                break;
            default:
                name = "Неизвестно";
        }
       return name;
    }
}