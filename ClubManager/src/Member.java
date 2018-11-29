
public class Member extends Person{

	public Member(String surname, String firstname) {
		super(surname, firstname);
		// TODO Auto-generated constructor stub
	}

	public Member(String surname, String firstname, String secondname) {
		super(surname, firstname, secondname);
		// TODO Auto-generated constructor stub
	}

	private int memshipNum;

	public Member(String surname, String firstname, String secondname, int memshipNum) {
		super(surname, firstname, secondname);
		this.memshipNum = memshipNum;
	}

	public Member(String surname, String firstname, int memshipNum) {
		super(surname, firstname);
		this.memshipNum = memshipNum;
	}

	public int getMemshipNum() {
		return memshipNum;
	}

	public void setMemshipNum(int memshipNum) {
		this.memshipNum = memshipNum;
	}
	
	public String toString()
	{
		String name = super.toString() + this.memshipNum;
		return name;
	}
}
