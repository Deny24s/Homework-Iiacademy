package com.company;

public class Color { //Создали класс

    private final int Red = 1;    //Данные описываемого классом объекта
    private final int Orange = 2;
    private final int Yellow = 3;
    private final int Green = 4;
    private final int Aqua = 5;
    private final int Blue = 6;
    private final int Purple = 7;
    private int ColorNumber;
    private String Name;

    public Color(int ColorNumber) {//Конструктор
        this.ColorNumber = ColorNumber;
    }//Конструктор

    public int getNumber() {        //метод 1
        return ColorNumber;
    } //метод1

    public String getName() {     //метод 2

        switch (ColorNumber) {
            case Red:
                Name = "Красный";
                break;
            case Orange:
                Name = "Оранжевый";
                break;
            case Yellow:
                Name = "Желтый";
                break;
            case Green:
                Name = "Зеленый";
                break;
            case Aqua:
                Name = "Голубой";
                break;
            case Blue:
                Name = "Синий";
                break;
            case Purple:
                Name = "Фиолетовый";
                break;
            default:
                Name = "Неизвестно";
        }
       return Name;
    }
}