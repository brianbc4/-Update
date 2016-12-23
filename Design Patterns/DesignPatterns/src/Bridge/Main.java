/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author user1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,50, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();
    }
    
}
