package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateVehicle {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Vehicle vehicle;

    public CreateVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

   public Vehicle create(String [] tokens, BufferedReader bf) throws IOException {
         Vehicle currentVehicle = null;

       if(tokens[0].equals("Car")){
           System.out.println("What is the car model ?");
           tokens[1] = bf.readLine();
           System.out.println("What type of engine is it ?");
           tokens[2] = bf.readLine();
           System.out.println("What year it was produced ?");
           tokens[3] = bf.readLine();
           System.out.println("What is the price ?");
           tokens[4]= bf.readLine();
           System.out.println("What is the type coupe ?");
           tokens[5] = bf.readLine();
           System.out.println("What is the count passengers ?");
           tokens[6] = bf.readLine();
           currentVehicle = new Car(tokens[1],tokens[2],Integer.parseInt(tokens[3]),
                   Double.parseDouble(tokens[4]),tokens[5],Integer.parseInt(tokens[6]));

       }else if(tokens[0].equals("Van")){
           System.out.println("What is the Van model ?");
           tokens[1] = bf.readLine();
           System.out.println("What type of engine is it ?");
           tokens[2] = bf.readLine();
           System.out.println("What year it was produced ?");
           tokens[3] = bf.readLine();
           System.out.println("What is the price ?");
           tokens[4]= bf.readLine();
           System.out.println("What is the tonnage ?");
           tokens[5] = bf.readLine();
           currentVehicle = new Van(tokens[1],tokens[2],Integer.parseInt(tokens[3]),
                   Double.parseDouble(tokens[4]),Double.parseDouble(tokens[5]));

       }else if(tokens[0].equals("BigTruck")){
           System.out.println("What is the BigTruck model ?");
           tokens[1] = bf.readLine();
           System.out.println("What type of engine is it ?");
           tokens[2] = bf.readLine();
           System.out.println("What year it was produced ?");
           tokens[3] = bf.readLine();
           System.out.println("What is the price ?");
           tokens[4]= bf.readLine();
           System.out.println("What is the tonnage ?");
           tokens[5] = bf.readLine();
           currentVehicle = new BigTruck(tokens[1],tokens[2],Integer.parseInt(tokens[3]),
                   Double.parseDouble(tokens[4]),Double.parseDouble(tokens[5]));
       }


       return currentVehicle ;
   }

}
