package ru.avalon.java.dev.j10.labs.shapes;
import java.util.Random;
/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */

/*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
    */

public class Rectangle implements Polygon {
    
    private float a;
    private float b;
    //private float c; = float a (противоположная сторона, зеркальное отражение)
    //private float d; = та же история => mirroring float b
    
    public Rectangle() {
       this.a = createSide();
       this.b = createSide();
    }
    
    /*
     * 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float createSide(){
        Random r = new Random();
        float side = r.nextInt(10) + 1;
        return side;
    }
    
    @Override 
    public float getArea(){
        return (a * b);
    }
    
    @Override
    public float getPerimeter(){
        return (2*(a + b));
    }
 
}
