package Abstraction.abstractdemo;

public class football extends AbsSports {

    @Override
    public void play() {
        System.out.println("Playing football");
    }
    public void exercise(){
        System.out.println("For football exercise");
    }

    public static void main(String[] args) {
        football obj=new football();
        obj.play();
        obj.exercise();
    }
}
