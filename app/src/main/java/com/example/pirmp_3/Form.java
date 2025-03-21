package com.example.pirmp_3;


import java.io.Serializable;


public class Form implements Serializable
{

    private String firstName, lastName;


    public Form( String firstName, String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

}
