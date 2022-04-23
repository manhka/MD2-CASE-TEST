package config;

import model.PlayerRunning;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWrite<T> {
    public List<T> readFromFile(String path) {
        List<T> tList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
//            System.out.println("");
        }
        return tList;
    }
    public void writeIntoFile(String path, List<T> tList){
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(path);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
//            System.out.println("");
        }
    }
}
