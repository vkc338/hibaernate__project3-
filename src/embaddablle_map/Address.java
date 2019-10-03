package embaddablle_map;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	private String Cityname;
	private String Areaname;
	public String getCityname() {
		return Cityname;
	}
	public void setCityname(String cityname) {
		Cityname = cityname;
	}
	public String getAreaname() {
		return Areaname;
	}
	public void setAreaname(String areaname) {
		Areaname = areaname;
	}
	

}
