package Encapsulation;

public class Student {
    int id;
    String name;
    //setters = to set value
    //getters = to get value
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String nm){
       name = nm;
    }
    public String getName(){
      return name;
    }
    //setters
    public void setPassword(String pw){
        String Password = pw;
    }
    //getters
    public int getAge(int age){
       return age;
    }
}
class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(11);
        System.out.println(s1.getId());
        s1.setName("Preeti");
        System.out.println(s1.getName());
        s1.setPassword("1234");
        //System.out.println(s1.setPassword());
        System.out.println(s1.getAge(12));
    }
}