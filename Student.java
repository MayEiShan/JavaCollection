package Collection;

public class Student {
	public String name=" ";
	public String phone=" ";
	public String rollno=" ";
	public String address=" ";
	public Student() {}
	public Student(String name,String phone,String rollno,String address) {
		this.name=name;
		this.phone=phone;
		this.rollno=rollno;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		String str="Name:"+getName()+"\nPhone:"+getPhone()+"\nRollno:"+getRollno()+"\nAddress:"+getAddress()+"\n";
		return str;
	}

}
