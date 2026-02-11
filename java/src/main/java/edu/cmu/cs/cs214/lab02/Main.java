package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        // 1. Rectangle үүсгэх
        Shape rectangle = new Rectangle(2, 3);
        Renderer renderer = new Renderer(rectangle);
        renderer.draw();

        // 2. Circle үүсгэх (Renderer-ийг өөрчлөх шаардлагагүй!)
        Shape circle = new Circle(5);
        renderer = new Renderer(circle); 
        renderer.draw();

        // 3. Square үүсгэх
        Shape square = new Square(4);
        renderer = new Renderer(square);
        renderer.draw();
    }
}