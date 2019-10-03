package embaddablle_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student stu= new Student();
		/*stu.setRollno(26);*/
		stu.setName("VIPIN");
		
		Address adr= new Address();
		adr.setCityname("Pune");
		adr.setAreaname("WARJE");
		
		/*Address ad1= new Address();
		ad1.setCityname("Mumbai");
		ad1.setAreaname("Kharghar");*/
		
		Set<Address> s= new HashSet<>();
		s.add(adr);
		/*s.add(ad1);*/
		stu.setSaddr(s);
		stu.getSaddr().add(adr);
		/*stu.getSaddr().add(ad1);*/
		session.save(stu);
		session.beginTransaction().commit();
		
	}
}
