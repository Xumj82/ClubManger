import java.util.Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import sun.invoke.empty.Empty;

public class Person {
    
	private String surname,firstname,secondname;
	
	//@Override
	public String toString() {
		// TODO Auto-generated method stub
		String name = this.surname +" "+ this.firstname +" "+ this.secondname;
		return name;
	}
	
	
	
	public Person(String surname, String firstname, String secondname) {
		this.surname = surname;
		this.firstname = firstname;
		this.secondname = secondname;
	}

    public Person(String surname, String firstname) {
		this.surname = surname;
		this.firstname = firstname;
		this.secondname = "";
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
    
	public void Show(){
		System.out.println(this.toString());
	}
}
