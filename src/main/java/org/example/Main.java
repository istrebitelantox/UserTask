package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //User user=new User();
        String[] names={"Yura","Dima","Pasha","Vika","Polya","Masha"};
        int[] arr=new Random().ints(1,1001).distinct().limit(1000).toArray();
        List<User> users= new ArrayList<>();
        List<User> male= new ArrayList<>();
        List<User> oldMans= new ArrayList<>();
        for(int i=0;i<1000;i++){
            User user=new User(arr[i],names[(int)(Math.random()* names.length)],(int)(Math.random()*100));
/*            user.setId(arr[i]);
            user.setName(names[(int)(Math.random()*10)]);
            user.setAge((int)(Math.random()*100));*/
            /*users.add("ID : "+user.getId()+" | Name : "+user.getName()+" | Age: "+user.getAge());*/
            users.add(user);
            System.out.println(users.get(i));
        }
/*        System.out.println(man);
        System.out.println(older);*/
        for(User user:users){
            if(user.getName().equals("Dima")|user.getName().equals("Yura")|user.getName().equals("Pasha"))
            {
                male.add(user);
            }
            if(user.getAge()>50){
                oldMans.add(user);
            }
        }
        System.out.println("Male: "+male+" \n Count of man: "+male.size());
        System.out.println("Old mans: "+oldMans+" \n Count of oldmans: "+oldMans.size());
    }
}