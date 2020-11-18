package org.example;

import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("json1.json"));

            // convert JSON string to User object
            Car car1 = gson.fromJson(reader, Car.class);

            System.out.println(car1.doors);

            // close reader
            reader.close();


        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
