
import java.time.LocalDateTime;
import java.util.*;

public class Club {

	private HashMap<Integer, Member> members = new HashMap<>();
	private HashMap<String, Facility> facilities = new HashMap<>();
	private BookingRegister BookingReg = new BookingRegister();
	private ArrayList<Member> memberList = new ArrayList<>();

	private static int curNumber = 0;

	public Member addMember(String surname, String firstname, String secondname) {
		Member mem = new Member(surname, firstname, secondname, ++curNumber);
		memberList.add(mem);
		members.put(curNumber, mem);
		return mem;
	}

	public void removeMember(int memberID) {
		members.remove(memberID);
		System.out.println("remove last member");
	}

	public void showMems() {
		System.out.println("show all:");
		for (Member x : members.values()) {
			x.Show();
		}
	}

	public Facility addFacility(String name, String Des) {
		Facility fa = new Facility(name, Des);
		facilities.put(name, fa);
		return fa;
	}

	public Facility GetFacility(String name) {
		return facilities.get(name);
	}

	public ArrayList<Facility> GetFaclilitys() {
		ArrayList<Facility> fas = new ArrayList<>();
		java.util.Iterator<Facility> ite = facilities.values().iterator();
		while (ite.hasNext()) {
			fas.add(ite.next());
		}
		return fas;
	}

	public void removeFacility(String name) {
		if (!facilities.isEmpty()) {
			facilities.remove(this.GetFacility(name).getName());
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

	public void addBooking(int memNum, String Fac, LocalDateTime startDa, LocalDateTime endDa)
			throws BadBookingException {
		if (members.containsKey(memNum) && facilities.containsKey(Fac)) {
			BookingReg.addBooking(members.get(memNum), facilities.get(Fac), startDa, endDa);
			System.out.println("addBooking Done");
		} else {
			throw new BadBookingException("wrong num or facility name");
		}
	}

	public void getBooking(String facName, LocalDateTime startDa, LocalDateTime endDa) {
		if (facilities.containsKey(facName)) {
			for (Booking bk : BookingReg.getBooking(this.GetFacility(facName), startDa, endDa)) {
				System.out.println(bk.toString());
			}
		} else {
			System.out.println("booking not found");
		}
	}

	public void ShowKEY() {
		Iterator<Integer> iteM = members.keySet().iterator();
		Iterator<String> iteF = facilities.keySet().iterator();

		while (iteM.hasNext()) {
			System.out.println(iteM.next());
		}
		while (iteF.hasNext()) {
			System.out.println(iteF.next());
		}
	}

	public void sortMemberList() {
		memberList.sort(null);
	}

	public void showList() {
		for (Member m : memberList) {
			System.out.println(m.getMemshipNum() + m.getFirstname());
		}
	}
}
