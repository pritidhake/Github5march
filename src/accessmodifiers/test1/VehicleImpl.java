package accessmodifiers.test1;

import accessmodifiers.test.Vehicle;

public class VehicleImpl extends Vehicle {
    public static void main(String[] args) {
        VehicleImpl v1 = new VehicleImpl();
        System.out.println(v1.protectedDataMember);
    }
}
