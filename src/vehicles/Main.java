package vehicles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("D:\\myFile\\Hi.txt");
        Vehicle vehicle = null;

        String [] tokens = new String[20];
        Writer writer = new FileWriter(file);
        CreateVehicle createVehicle = new CreateVehicle(vehicle);

        for (int i = 0; i <1 ; i++) {
            System.out.println("What vehicle you want to add?");
            tokens[0] = bf.readLine();
            vehicle = createVehicle.create(tokens,bf);
            writer.write(String.valueOf(vehicle));
        }

        writer.close();


        FileReader fr=new FileReader(file);
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }

}




