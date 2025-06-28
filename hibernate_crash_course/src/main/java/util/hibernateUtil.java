package util;

import java.lang.module.Configuration;

import com.hibernate.*;
import com.mysql.cj.xdevapi.SessionFactory;


public class hibernateUtil {
    
    private static SessionFactory sessionFactory;

    static{
        try {
            if ( sessionFactory == null ){
                sessionFactory = new Configuration().configure().buildSessionFactory() ; 
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
