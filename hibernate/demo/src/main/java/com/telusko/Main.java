package com.telusko;

import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Alien a1 = new Alien() ; 
        a1.setAid(101) ; 
        a1.setAname("yash");
        a1.setTech("java");

        // hey hibernate save with a1 object 

        Configuration config = new Configuration() ; 
        config.addAnnotatedClass(com.telusko.Alien.class) ; 
        config.configure() ; 

        SessionFactory factory = config.buildSessionFactory() ; 

        Session session = factory.openSession() ; 

        org.hibernate.Transaction transaction = session.beginTransaction() ; 
 
        session.persist(a1) ; 

        transaction.commit() ; 


    }
}