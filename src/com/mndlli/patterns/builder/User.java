package com.mndlli.patterns.builder;

import java.util.Date;

public class User {
    
    //REQUIRED attributes
    private String username;
    private String firstName;
    private String lastName;
    
    //OPTIONAL attributes
    private Date birthdate;
    private String cellphone;
    
    
    private User(UserBuilder builder) {
        this.username = builder.username;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthdate = builder.birthdate;
        this.cellphone = builder.cellphone;
    }
        
    
    
    public String getUsername() {
        return this.username;
    }


    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }


    public Date getBirthdate() {
        return this.birthdate;
    }


    public String getCellphone() {
        return this.cellphone;
    }

    


    @Override
    public String toString() {
        return "User [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", birthdate="
                + birthdate + ", cellphone=" + cellphone + "]";
    }




    public static class UserBuilder {

        private String username;
        private String firstName;
        private String lastName;
        private Date birthdate;
        private String cellphone;
        
        
        public UserBuilder(String username, String firstName, String lastName) {
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;   
        }
        
        
        public UserBuilder setBirthdate(Date birthdate) {
            this.birthdate = birthdate;
            return this;
        }
        
        
        public UserBuilder setCellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }
        
        
        public User build() {
            return new User(this);
        }
        
        
    }
    

}
