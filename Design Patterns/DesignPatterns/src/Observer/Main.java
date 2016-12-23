/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author user1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Subject channel=new Subject();
        
        new Brian(channel);
        new Nancy(channel);
        
        channel.setState("HBO");
        channel.setState("Cartoon Net Work");
        
    }
    
}
