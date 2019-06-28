package com.example.demo.service;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.RangeBaseParameter;
import com.example.demo.model.Seq;
import com.example.demo.model.User;
import com.example.demo.dao.HibernateUtil;

@Service

public class UserService {
	
	public List<User> listofemployees(){
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			session.beginTransaction();
			List<User> list = session.createCriteria(User.class).list();
			session.getTransaction().commit();
			return list;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public void addPerson(User user){
		
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	/************************* Seq ********************************/
	public Seq findSquenceByClass(String className) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction=session.beginTransaction();
		try {
			Query query = session.createQuery("select s from Seq s where s.name=:class");
			query.setParameter("class", className);
			return (Seq) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.clear();
			session.close();
		}
		return null;
	}
	
	public void UpdateSeq(Seq seq) {
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.update(seq);
			session.getTransaction().commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void deleteUser(User user) {
		try {
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
	
	
	public User findUserById(String id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			Transaction transaction=session.beginTransaction();
			Query query = session.createQuery("select i from User i where i.user_id=:id");
			query.setParameter("id", id);
			return (User) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.clear();
			session.close();
		}
		return null;
	}
	
	
	public void UpdateUser(User user) {
		try {
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

}
