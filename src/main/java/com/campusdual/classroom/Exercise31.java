package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
      /* Try-catch normal con fiunally
       BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }*/

        //Try with resources
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

