package com.example.demo.service;

import java.util.List;

import org.hibernate.Session;

import com.example.demo.dao.HibernateUtil;
import com.example.demo.model.RangeBaseParameter;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.RangeBaseParameter;
import com.example.demo.model.TextBaseParameter;
import com.example.demo.model.Seq;
import com.example.demo.model.User;
import com.example.demo.dao.HibernateUtil;

@Service


public class TestService {

	
	
	//Range Base Parameter
		public List<RangeBaseParameter> listofrangebase(){
			try{
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				List<RangeBaseParameter> list = session.createCriteria(RangeBaseParameter.class).list();
				session.getTransaction().commit();
				return list;
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		

		//Text Base Parameter
			public List<TextBaseParameter> listoftextbase(){
				try{
					Session session = HibernateUtil.getSessionFactory().getCurrentSession();
					session.beginTransaction();
					List<TextBaseParameter> list1 = session.createCriteria(TextBaseParameter.class).list();
					session.getTransaction().commit();
					return list1;
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return null;
			}
			
			//Range Base Parameter By ID
			public List<RangeBaseParameter> findRangeList(String propertyId){
				
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				try{
					Transaction transaction = session.beginTransaction();
					
					String reangeStr = propertyId != null? " And v.propertyId.propertyId=:propertyId " : "";
					
					Query q = session.createQuery("select v from RangeBaseParameter v where v.propertyId<>null" + reangeStr);
					
					if(propertyId != null){
					q.setParameter("propertyId", propertyId);
					}
					
					List<RangeBaseParameter> venList = q.list();
					for(RangeBaseParameter ven : venList){
						ven.getPropertyId();
						
					}
					return venList;
					
				}catch(Exception e){
					e.printStackTrace();
				}
				finally{
					session.close();
				}
				return null;
				
			}
			
			public JSONArray findJsonArrayForVendor(List<RangeBaseParameter> venList){
				
				JSONArray venArray = new JSONArray();
				JSONObject rangeobj = null;
				
					
					for(RangeBaseParameter ven : venList){
						rangeobj = new JSONObject();
						try{
							
							rangeobj.put("ID", ven.getPropertyId());
							rangeobj.put("Name", ven.getPropertyName());
							rangeobj.put("Max Value", ven.getMaxValue());
							rangeobj.put("Min Value", ven.getValue());
							rangeobj.put("Uom", ven.getUom());
							
							venArray.put(rangeobj);
							
						}catch(Exception e){
							e.printStackTrace();
						}
						
					}
					
				
				
				return venArray;
			}
			
			

			//Text Base Parameter
				public List<RangeBaseParameter> listofRangebase(){
					try{
						Session session = HibernateUtil.getSessionFactory().getCurrentSession();
						
						session.beginTransaction();
						List<RangeBaseParameter> list = session.createCriteria(RangeBaseParameter.class).list();
						session.getTransaction().commit();
						return list;
						
					}
					catch(Exception e){
						e.printStackTrace();
					}
					return null;
				}
			
}
