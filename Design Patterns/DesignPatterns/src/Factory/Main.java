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
public class Main {
    
    public static void main(String[] args) {

        Factory shapeFactory = new Factory();

        Shape type1 = shapeFactory.getShape("CIRCLE");  //get an object of Circle and call its draw method.
        type1.draw();   //call draw method of Circle

        Shape type2 = shapeFactory.getShape("RECTANGLE");
        type2.draw();

        Shape type3 = shapeFactory.getShape("SQUARE");
        type3.draw();
    }

}
