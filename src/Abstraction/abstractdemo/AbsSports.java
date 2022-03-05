package Abstraction.abstractdemo;

public abstract class AbsSports {
    public abstract void play(); // abstract method
    protected void exercise(){ //concrete method
        System.out.println("Exercise");
    }
    public void show(){
        exercise();
    }
}
