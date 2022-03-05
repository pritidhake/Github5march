package Encapsulation;
//  wrapping of data in single unit
//  making field private and giving access via
//  advantage- you can make clas read only or write only
//  you can protect from unauthorized access
//  right click generate for getters n setters
public class EncapsulationDemo {
    int id;
    String name;
    String address;

    public void setId(int id){
        if (id==0){
            System.out.println("Id is 0");
        }else {
            this.id = id;
        }
    }
    public int getId(){
        return id;
    }
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.id=1;
        obj.name= "Priti";
        obj.address="Pune";
        System.out.println("id:"+obj.id+" Name:"+obj.name+" Address:"+obj.address);
    }
}


