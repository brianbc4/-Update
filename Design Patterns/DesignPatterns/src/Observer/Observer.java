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
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}



class Brian extends Observer{

    public Brian(Subject subject){
    this.subject=subject;
    this.subject.attach(this);
    }
    @Override
    public void update() {
    System.out.println("Brian is watching " + subject.getState());
    }
}

class Nancy extends Observer{

    public Nancy(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
    System.out.println("Nancy is watching:" + subject.getState());
    }

}













