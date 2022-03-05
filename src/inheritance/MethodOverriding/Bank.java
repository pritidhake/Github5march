package inheritance.MethodOverriding;

public class Bank {
    double getRateOfInterest(){
        System.out.println("In Bank");
        return 7;
    }
}
class SBI extends Bank{
    double getRateOfInterest(){
        System.out.println("In SBI Bank");
        return 8;
    }
}
class ICICI extends Bank{
    double getRateOfInterest(){
        System.out.println("In ICICI Bank");
        return 9;
    }
}
class BankImpl{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getRateOfInterest();
        ICICI icici = new ICICI();
        icici.getRateOfInterest();
    }
}