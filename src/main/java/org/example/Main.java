package org.example;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        String[] names={"Yura","Dima","Pasha","Kolya","Petya","Vasya","Misha","Vanya","Vova","Polya","Gena"};
        int[] arr=new Random().ints(1,99).distinct().limit(10).toArray();
        ArrayList<String>users=new ArrayList<String>();
        for(int i=0;i<10;i++){
            user.setId(arr[i]);
            user.setName(names[(int)(Math.random()*10)]);
            user.setAge((int)(Math.random()*100));
            users.add("ID : "+user.getId()+" | Name : "+user.getName()+" | Age: "+user.getAge());
            System.out.println(users.get(i));
        }
        System.out.println(users);

    }
}