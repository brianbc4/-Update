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
public class SingleObject {
    
   private static SingleObject instance = new SingleObject();   //create an object of SingleObject

   private SingleObject(){}   //make the constructor private so that this class cannot be instantiated
   
   
   public static SingleObject getInstance(){  //Get the only object available
   return instance;
   }
    
   public void showMessage(){
   System.out.println("yo!!");
   }
}
