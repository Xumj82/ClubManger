import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;

import javafx.util.converter.LocalDateStringConverter;

public class ClubApplication {

	public static void main(String[] args) throws BadBookingException {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("This is ClubApp..."); Member P1 = new
		 * Member("Zhang","Wei","Tom",123); Person P2 = new Member("Zhang","Wei",123);
		 * System.out.println("Name of 1st person:"); P1.Show();
		 * System.out.println("Name of 2nd person:"); P2.Show();
		 * 6666666666
		 * 666
		 */
		Club c = new Club();
		Member mem = c.addMember("Zhang", "Wei", "Tom");
		Member mem0 = c.addMember("Li", "Jun", "Tony");
		Member mem1 = c.addMember("Li", "Jun", "Tony");
		Member mem2 = c.addMember("Li", "Jun", "Tony");
		Member mem3 = c.addMember("Li", "Jun", "Tony");
		Member mem4 = c.addMember("Li", "Jun", "Tony");
		c.showMems();
		c.removeMember();
		c.removeMember();
		c.showMems();
		
		Facility fa1 = c.addFacility("fa1", null);
		Facility fa2 = c.addFacility("fa2", null);
		Facility fa3 = c.addFacility("fa3", null);
		Facility fa4 = c.addFacility("fa4", null);
		Facility fa5 = c.addFacility("fa5", null);
		Facility fa6 = c.addFacility("fa6", null);
		Facility fa7 = c.addFacility("fa7", null);
		System.out.println("show all:");
		c.ShowFacilities();
		for(Facility fa:c.GetFaclilitys()) {
			System.out.println(fa.getName());
		}
		System.out.println("remove fa7 fa4:");
		c.removeFacility("fa7");
		c.removeFacility("fa4");
		System.out.println("获得fa3和fa4的name:");
		c.GetFacility("fa3");
		c.GetFacility("fa4");
		System.out.println("show all:");
		c.ShowFacilities();	
		LocalDateTime da = LocalDateTime.now();
		Booking bk = new Booking(mem, fa1, da);
	}

}
