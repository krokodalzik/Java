package com.example.ball;

public class Ball {
    private int size;
    private String color;

    public Ball(int n, String a){
        size = n;
        color = a;
    }

    public int getSize(int size){
        return size;
    }
    public String getColor(String color){
        return color;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return this.size+this.color;
    }


}
