package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorUser {
    User user=new User();
    List<User> users=new ArrayList<>();
    String[] names={"Yura","Dima","Pasha","Vika","Polya","Masha"};
    int[] arr=new Random().ints(1,1001).distinct().limit(1000).toArray();
    public List newUser(){
        for(int i=0;i<1000;i++){
            User randomUser=user.withId(arr[i])
                    .withName(names[(int)(Math.random()* names.length)])
                    .withAge((int)(Math.random()*100));
            users.add(randomUser);
        }
        return users;
    }

}

