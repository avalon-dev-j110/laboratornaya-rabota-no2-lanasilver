package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        
        /*Circle circle = new Circle();
        System.out.println("Now the circle is " + circle + System.lineSeparator());
        System.out.println("Circumference is equal to = " + circle.getCircumference() + System.lineSeparator());
        System.out.println("Area is equal to = " + circle.getArea());
        */
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.*/
        
        Shape[] shapes1 = generateShapes(10);
        System.out.println("---------------------");
        
        /*
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
        
        System.out.println("The Max Area is: " + getMaxArea(shapes1));
        
        
    }
    
    private static Shape[] generateShapes(int figures) {
        Shape[] shapes = new Shape[figures];
        Random random = new Random();
        for (int i = 0; i < shapes.length; i++){
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0:
                    shapes[i] = new Circle();
                    System.out.println("Новый круг_№_: " + random.nextInt(11));
                    System.out.println("И площадь данного круга = " + shapes[i].getArea());
                    System.out.println("----------------");
                    break;
                case 1:
                    shapes[i] = new Rectangle();
                    System.out.println("Новый прямоугольник_№_: " + random.nextInt(11));
                    System.out.println("И площадь данного прямоугольника = " + shapes[i].getArea());
                    System.out.println("----------------");
                    break;
                case 2:
                    shapes[i] = new Triangle();
                    System.out.println("Новый треугольник_№_: " + random.nextInt(11));
                    System.out.println("И площадь данного треугольника = " + shapes[i].getArea());
                    System.out.println("----------------");
                    break;       
            }
        }
        return shapes;
    }
    
    private static float getMaxArea(Shape[] shapes){
        float maxArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            float area = shapes[i].getArea();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
    
}
