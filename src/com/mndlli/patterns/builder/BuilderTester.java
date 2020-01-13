package com.mndlli.patterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BuilderTester {
    
    
    public static void main(String[] args) throws ParseException {
        
        
        User user1 = new User.UserBuilder("user1", "Iggy", "Pop")
                             .build();
        System.out.println(user1);
        
        
        User user2 = new User.UserBuilder("user2", "John", "Lennon")
                             .setCellphone("+14313731111")
                             .build();
        System.out.println(user2);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date dt = sdf.parse("1967/02/20");
        
        User user3 = new User.UserBuilder("user3", "Kurt", "Cobain")
                             .setCellphone("+12043733333")
                             .setBirthdate(dt)
                             .build();
        System.out.println(user3);
        
    }

}
