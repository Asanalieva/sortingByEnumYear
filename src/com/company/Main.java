package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Car("Lexus 200",2012,TypeofEngine.ELECTROMOBILE);
        Vehicle car2 = new Car("BMW X",1990,TypeofEngine.FUEL);
        Vehicle car3 = new Car("TESLA S",2029,TypeofEngine.ELECTROMOBILE);//out
        Vehicle car4 = new Car("TESLA Y",1281,TypeofEngine.FUEL);//in
        Vehicle car5 = new Car("Rameo Bugatti",1922,TypeofEngine.FUEL);
        Vehicle car6 = new Car("Honda",2220,TypeofEngine.HYBRID);//out
        Vehicle car7 = new Car("VOLKSWAGEN",2945,TypeofEngine.ELECTROMOBILE);//out
        Vehicle car8 = new Car("Range Rover",1345,TypeofEngine.HYBRID);//in

        Vehicle truck1 = new Truck("Chevrolet Silverado",2022,TypeofEngine.HYBRID);
        Vehicle truck2 = new Truck("Chevrolet Tornado",2567,TypeofEngine.FUEL);//out
        Vehicle truck3 = new Truck("Ford Ranger",1999,TypeofEngine.ELECTROMOBILE);
        Vehicle truck4 = new Truck("Ford F-150",234,TypeofEngine.HYBRID);//out
        Vehicle truck5 = new Truck("GMC Sierra 1500",2002,TypeofEngine.ELECTROMOBILE);
        Vehicle truck6 = new Truck("Mitsubishi Strada",2018,TypeofEngine.HYBRID);
        Vehicle truck7 = new Truck("Nissan Navara",2930,TypeofEngine.ELECTROMOBILE);//out


        Vehicle[] vehicles = {car1,car3,car7,truck3,truck5,truck7,car6,car8,truck1,truck4,truck6,car1,car2,car4,car5,truck2};

        for(Vehicle vehicle : vehicles){
            try{
                System.out.println(vehicle.getModel() + " " + vehicle.getYearOfIssue()+"");
            }
            catch (InvalidYearException e){
                System.err.println(vehicle.getModel() +  " " + e.getMessage());
            }
        }
        System.out.println("-----------------------------------------------");

        for(Vehicle electromobile : vehicles){
            if(electromobile.getTypeOfEngine().equals(TypeofEngine.ELECTROMOBILE)){
                System.out.println(electromobile.getModel() +" " + electromobile.getTypeOfEngine());
            }
        }
        System.out.println("-----------------------------------------------");
        for(Vehicle hybrid : vehicles){
            if(hybrid.getTypeOfEngine().equals(TypeofEngine.HYBRID)){
                System.out.println(hybrid.getModel() +" " + hybrid.getTypeOfEngine());
            }
        }
        System.out.println("----------------------------");
        for(Vehicle  fuel : vehicles){
            if(fuel.getTypeOfEngine().equals(TypeofEngine.FUEL)){
                System.out.println(fuel.getModel() +" " + fuel.getTypeOfEngine());
            }
        }

    }
}
