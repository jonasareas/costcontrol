package com.wimm.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class DataBaseConnectionTest {

    private EntityManagerFactory entityManagerFactory;

    @Before
    public void before() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("mysql-ds");
    }

    @After
    public void after() throws Exception {
        entityManagerFactory.close();
    }

    @Test
    public void connectionTest() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNativeQuery("show databases");
        List<String> results = query.getResultList();
        Assert.assertTrue(results.contains("costcontroldb"));
    }
}
