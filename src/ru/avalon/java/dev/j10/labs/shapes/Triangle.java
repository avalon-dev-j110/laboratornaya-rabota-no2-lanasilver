package ru.avalon.java.dev.j10.labs.shapes;
import java.util.Random;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */ 
/*1. Используйте наследование.*/

public class Triangle implements Polygon {

    private float a;
    private float b;
    private float c;
    
    /*
     * TODO: Реализовать класс 'Triangle'
     */
    
    public Triangle() {
        this.a = createSide();
        this.b = createSide();
        this.c = createSide();
    }
    
    /* 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float createSide() {
        Random random = new Random();
        float side = random.nextInt(8) + 5;
        return side;
    }
    
    @Override
    public float getPerimeter() {
        return a + b + c;
    }
    
    @Override 
    public float getArea(){
        float halfPer = getPerimeter()/2;
        return (float) Math.sqrt(halfPer*((halfPer - a)*(halfPer - b)*(halfPer - c)));
    }
    
}

    
