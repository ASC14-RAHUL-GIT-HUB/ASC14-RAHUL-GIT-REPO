package com.vls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RVB
{
    public static void main( String[] args )
    {
        System.err.println( "Rahul V B" );
        SpringApplication.run(RVB.class, args);
        System.err.println( "app is running bruh" );
    }
}
