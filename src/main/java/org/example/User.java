package org.example;

import lombok.Value;
import lombok.With;
@With
@Value
public class User {
    Integer id;
    String name;
    Integer age;
    public User(){
        this.id=1;
        this.name="Yura";
        this.age=(int)(Math.random()*100);
    }
}
