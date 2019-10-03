package embaddablle_map;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Rollno;
	private String name;
	
	@ElementCollection
	private Set<Address> saddr= new HashSet<>();

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getSaddr() {
		return saddr;
	}

	public void setSaddr(Set<Address> saddr) {
		this.saddr = saddr;
	}

	}
	

