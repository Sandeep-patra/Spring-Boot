package in.Ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	Integer pid;
	String pName;
	Double price;
	String cmpName;
	
	public Product() {
		
	}
	public Product(int pid, String pName, double price, String cmpName) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.price = price;
		this.cmpName = cmpName;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", price=" + price + ", cmpName=" + cmpName + "]";
	}
	
	

}
