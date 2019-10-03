package pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Student st= new Student();
		
		st.setName("Sultani");
		st.setAddress("Baramati");
		session.save(st);
		session.beginTransaction().commit();
	}

}
