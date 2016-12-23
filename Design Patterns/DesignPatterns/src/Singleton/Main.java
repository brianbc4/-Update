/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author user1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//      SingleObject object = new SingleObject();  //Compile Time Error: The constructor SingleObject() is not visible

        SingleObject object = SingleObject.getInstance(); //Get the only object available

        object.showMessage();  //show the message
    }
    
}
