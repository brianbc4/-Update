/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author user1
 */
public interface Shape {
    void draw();
}


class Rectangle implements Shape{
    
    @Override
    public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
    System.out.println("Inside Square::draw() method.");
    }
}


class Circle implements Shape{

    @Override
    public void draw() {
    System.out.println("Inside Circle::draw() method.");
    }
}