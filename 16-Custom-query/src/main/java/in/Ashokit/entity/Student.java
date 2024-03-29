package in.Ashokit.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private String qualification;
	private Character G;

	public Student(Integer sid, String sName, String qualification, Character g) {
		this.sid = sid;
		this.sname = sName;
		this.qualification = qualification;
		this.G = g;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sname;
	}

	public void setsName(String sName) {
		this.sname = sName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Character getG() {
		return G;
	}

	public void setG(Character g) {
		this.G = g;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sname + ", qualification=" + qualification + ", G=" + G + "]";
	}

}
