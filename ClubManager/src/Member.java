
public class Member extends Person implements MemberComparable{

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
		String name = super.toString() + " "+this.memshipNum;
		return name;
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		if(o.memshipNum>this.memshipNum) {
			return -1;
		}
		else if(o.memshipNum<this.memshipNum) {
			return 1;
		}
		else
			return 0;
	}




}
