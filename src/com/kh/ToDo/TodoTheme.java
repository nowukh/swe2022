package com.kh.ToDo;

public class TodoTheme {
    static Color color = Color.BLUE;
    static Background background = Background.MOUNTAIN;

    enum Color{
        BLUE, RED, PURPLE, GREEN, SKYBLUE
    }
    enum Background{
        MOUNTAIN, OASIS, RIVER, AIRPLANE, CITY, CLEAR
    }
    static void setColor(Color c){ color = c; }
    static void setBackground(Background b){ background = b; }

}
