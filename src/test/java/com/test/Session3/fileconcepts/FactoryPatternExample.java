package com.test.Session3.fileconcepts;

interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle ::draw() Method");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle ::draw() Method");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square:: draw() Method");
    }
}



 class ShapeFactory {

     public Shape getShape(String shapeType) {
         if (shapeType == null) {
             return null;
         }
         if (shapeType.equalsIgnoreCase("CIRCLE")) {
             return new Circle();

         } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
             return new Rectangle();

         } else if (shapeType.equalsIgnoreCase("SQUARE")) {
             return new Square();
         }

         return null;
     }
 }

    public class FactoryPatternExample {
        public static void main(String[] args) {
            new ShapeFactory().getShape("CIRCLE").draw();
            new ShapeFactory().getShape("RECTANGLE").draw();
            new ShapeFactory().getShape("SQUARE").draw();
        }
}

