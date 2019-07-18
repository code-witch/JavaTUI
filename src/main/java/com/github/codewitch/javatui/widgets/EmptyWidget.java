package com.github.codewitch.javatui.widgets;

import javafx.scene.layout.StackPane;

public class EmptyWidget extends Widget<StackPane> {

    public EmptyWidget(int x, int y) {
        super(x, y, new StackPane());
    }
    @Override
    public String toString() {
        return "EmptyWidget{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
