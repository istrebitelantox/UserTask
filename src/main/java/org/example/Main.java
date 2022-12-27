package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //User user=new User();
        String[] names={"Yura","Dima","Pasha","Vika","Polya","Masha"};
        int[] arr=new Random().ints(1,1001).distinct().limit(1000).toArray();
        List<User> users= new ArrayList<>();
        List<User> male;
        List<User> oldMans;
        for(int i=0;i<1000;i++){
            User user=new User(arr[i],names[(int)(Math.random()* names.length)],(int)(Math.random()*100));
            users.add(user);
            System.out.println(users.get(i));
        }

        male=users.stream().filter(x-> (x.toString().contains("Pasha")|x.toString().contains("Yura")|(x.toString().contains("Dima")))==true)
                .collect(Collectors.toList());
        System.out.println("\nMale: "+male+" \n Count of male: "+male.size());
        oldMans=users.stream().filter(x-> (x.getAge()>50))
                .collect(Collectors.toList());
        System.out.println("Old mans: "+oldMans+" \n Count of oldmans: "+oldMans.size());
        //Альтернативный вариант фильтрации
/*        stream.filter(x-> (x.getName().equals("Pasha")|x.getName().equals("Yura")|(x.getName().equals("Dima"))==true)|(x.getAge()>50))
                .forEach(System.out::println);*/

    }
}