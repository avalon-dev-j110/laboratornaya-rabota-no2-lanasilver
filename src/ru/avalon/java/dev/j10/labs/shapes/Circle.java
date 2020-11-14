package ru.avalon.java.dev.j10.labs.shapes;
import java.util.Random;
/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
/*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
    */
public class Circle implements Ellipse {
    private static float x;//расстояние от "0" до случайно выбранного числа, как отрезок на плоскости, по идее это радиус круга
    private float y;//"Y" должен быть равен "Х", так как у круга не может быть радиусов с неодинаковыми значениями
    
    public Circle (){
      this.x = getX();
        System.out.println("X.circle is now equal = " + x);
      this.y = x;
      //this.y = getY();
        System.out.println("Y.circle is now supposed to be the same as X, and it is = " + y);
    }
    
    /*
     * 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float getX() {
       Random random = new Random(); 
       float x = random.nextInt(7) + 1;
       return x;
    }
    
    @Override
    public float getY() {
    float y = x; 
    return y;
    }
    
    @Override
    public float getCircumference() {
        return (float) (Math.PI*(x + y));// x + y = diameter or (2*radius) --- radius is either "x" or "y" (since they should have the same value)
    }
    
    @Override
    public float getArea(){ //PI*radius*radius
        //System.out.println("This is the area of a circle");
        return (float) (Math.PI*x*x);
    }
}
