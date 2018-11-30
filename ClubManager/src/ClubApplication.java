import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import javafx.util.converter.LocalDateStringConverter;

public class ClubApplication {

	public static void main(String[] args) throws BadBookingException, FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("This is ClubApp..."); Member P1 = new
		 * Member("Zhang","Wei","Tom",123); Person P2 = new Member("Zhang","Wei",123);
		 * System.out.println("Name of 1st person:"); P1.Show();
<<<<<<< HEAD
		 * System.out.println("Name of 2nd person:"); P2.Show();
		 * 6666666666
		 * 666bendayedaociyiyou
=======
		 * System.out.println("Name of 2nd person:"); P2.Show(); 6666666666 666
>>>>>>> branch 'master' of https://github.com/Xumj82/ClubManger.git
		 */
		// Date
		String DatePath = "C:\\Users\\11351\\Desktop\\Date.txt";
		File F = new File(DatePath);
		Scanner sc = new Scanner(F);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
		ArrayList<LocalDateTime> startDa = new ArrayList<>();
		ArrayList<LocalDateTime> endDa = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			LocalDateTime da = LocalDateTime.parse(sc.nextLine(), dtf);
			startDa.add(da);
			da = LocalDateTime.parse(sc.nextLine(), dtf);
			endDa.add(da);
		}
		// LocalDateTime startDa1 = LocalDateTime.parse(sc.nextLine(),dtf);

		for (LocalDateTime da : startDa) {
			System.out.println(da.toString());
		}

		for (LocalDateTime da : endDa) {
			System.out.println(da.toString());
		}

		Club yzh = new Club();
		// add Facilities
		for (int i = 1; i < 9; i++) {
			yzh.addFacility("Room" + i, "888");

		}

		// add Member
		for (int i = 1; i < 9; i++) {
			yzh.addMember("x" + i, "m" + i, "j" + i);
		}

		// show members
		yzh.showMems();

		// show facilities
		System.out.println("show facilities:");
		yzh.ShowFacilities();
		yzh.ShowKEY();
		yzh.addBooking(1, "Room1", startDa.get(0), endDa.get(0));
		yzh.addBooking(2, "Room2", startDa.get(1), endDa.get(1));
		yzh.getBooking("Room1", startDa.get(0), endDa.get(0));

		//sort
		yzh.sortMemberList();
		yzh.showList();

	}

}
