package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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

        male=users.stream().filter(x-> (x.toString().contains("Pasha")
                        | x.toString().contains("Yura")
                        | (x.toString().contains("Dima"))))
                .collect(Collectors.toList());
        System.out.println("\nMale: "+male+" \n Count of male: "+male.size());

        oldMans=users.stream()
                .filter(x-> (x.getAge()>50))
                .collect(Collectors.toList());
        System.out.println("Old mans: "+oldMans+" \n Count of oldmans: "+oldMans.size());

        List<User> forYoungToOld=users.stream()
                .sorted((f1,f2)->Long.compare(f2.getAge(), f1.getAge()))
                .toList();
        System.out.println("Sorted from young to old: "+forYoungToOld);

        List<User> users1=users.stream().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(users1);
/*        Альтернативный вариант фильтрации
        stream.filter(x-> (x.getName().equals("Pasha")|x.getName().equals("Yura")|(x.getName().equals("Dima"))==true)|(x.getAge()>50))
                .forEach(System.out::println);*/

    }
}