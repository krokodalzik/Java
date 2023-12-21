package com.example;

import com.example.animal.Dog;
import com.example.ball.Ball;
import com.example.book.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Dog d1 = new Dog("Mike", 2);
          Dog d2 = new Dog("Helen", 7);
          Dog d3 = new Dog("Bob", 12);

          System.out.println(d1);
          System.out.println(d2);
          System.out.println(d3);
          d1.intoHumanAge();
          d2.intoHumanAge();
          d3.intoHumanAge();

          Ball b1 = new Ball(10," Green");

          System.out.println(b1);

          var book = new Book();

          System.out.println(book.getAge(1953));
          System.out.println(book.getName("Harry Potter"));


    }
}