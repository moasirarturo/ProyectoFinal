/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moasirh.model;

import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T107
 */
public class DAOtipo {
    public String tipo() throws Exception {
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria crit=session.createCriteria(Tipo.class);//.add(Restrictions.idEq(this));
        Tipo mapeo=(Tipo)crit.uniqueResult();
        ObjectMapper mapper=new ObjectMapper();
        Map<String,Tipo> singletonMap = Collections.singletonMap("tipo", mapeo);
        transaction.commit();
        session.close(); 
        System.out.println(mapper.writeValueAsString(singletonMap)); 
        return mapper.writeValueAsString(singletonMap); 
    }
}