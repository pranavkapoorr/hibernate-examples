package com.pranavkapoorr.hibernate_with_annotation;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class StoreData {    
public static void main(String[] args) {    
        
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build();  
Session session = factory.openSession();  
Transaction t = session.beginTransaction();   
            
    Contact c1=new Contact();    
    c1.setId(101);    
    c1.setFirstName("Pranav");    
    c1.setLastName("Kapoor");    
        
    session.save(c1);  
    t.commit();  
    System.out.println("successfully saved");    
    factory.close();  
    session.close();    
        
}    
}  