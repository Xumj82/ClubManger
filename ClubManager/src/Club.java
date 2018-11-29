import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Club {

	private int curNumber;

	Stack<Member> members = new Stack<Member>();
	HashMap<String, Facility> fac = new HashMap<>();

	static int i = 1;

	public Member addMember(String surname, String firstname, String secondname) {
		Member mem = new Member(surname, firstname, secondname, i++);
		members.push(mem);
		return members.peek();
	}

	public void removeMember() {
		members.pop();
	}

	public void showMems() {
		for (Member x : members) {
			x.Show();
		}
	}

	public Facility addFacility(String name, String Des) {
		Facility fa = new Facility(name, Des);
		fac.put(name, fa);
		return fa;
	}

	public Facility GetFacility(String name) {
        	return fac.get(name);	
	}

	public ArrayList<Facility> GetFaclilitys() {
		ArrayList<Facility> fas = new ArrayList<>();
		java.util.Iterator<Facility> ite = fac.values().iterator();
		while (ite.hasNext()) {
			fas.add(ite.next());
		}
		return fas;
	}

	public void removeFacility(String name) {
		if (!fac.isEmpty()) {
			fac.remove(this.GetFacility(name).getName());
			System.out.println(name + " removed");
		} else {
			System.out.println("connot find the facility");
		}
	}

	public void ShowFacilities() {
		for (Facility fa : this.GetFaclilitys()) {
			System.out.println(fa);
		}
	}
}
