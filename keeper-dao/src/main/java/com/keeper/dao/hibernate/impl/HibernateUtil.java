package com.keeper.dao.hibernate.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by AlexVasil on 26.03.2017
 *
 */

public class HibernateUtil {
    private static final Logger logger = LoggerFactory.getLogger(HibernateUtil.class);

    private static SessionFactory sessionFactory;

//    static {
//        try {
//            // Create the SessionFactory from hibernate.cfg.xml
//            Configuration configuration = new Configuration();
//            configuration.configure("hibernate-standalone.cfg.xml");
//            logger.info("Hibernate Configuration loaded");
//
//            //apply configuration property settings to StandardServiceRegistryBuilder
//            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//            logger.info("Hibernate serviceRegistry created");
//
//            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//        }
//        catch (Throwable ex) {
//            // Make sure you log the exception, as it might be swallowed
//            logger.error("Initial SessionFactory creation failed.", ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Convenience method to get the current session.
     */
    public static Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * Empty method. A call to this method causes the static initializer to be run, and thus boots Hibernate.
     */
    public static void boot() {}

    /**
     * Shuts down Hibernate, otherwise the Main thread may not be closed.
     */
    public static void shutdown() {
        sessionFactory.close();
    }
}
