import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
public class BookingRegister {

	private HashMap<Facility, ArrayList<Booking>> BR = new HashMap<>();
	

	public BookingRegister() {
		
	}

	public void addBooking(Member mem,Facility fa,LocalDateTime startDa,LocalDateTime endDa) throws BadBookingException {
		Booking bk = new Booking(mem, fa, startDa, endDa);
		if(BR.containsKey(fa)){
			for(Booking b : BR.get(fa) ) {
				if(b.Overlap(bk)) {
					System.out.println("Overlap booking");
					throw new BadBookingException("Overlap");
				}
				else {
					BR.get(fa).add(bk);
					System.out.println("add booking of "+fa.getName());
				}
			}
		}
		else {
			ArrayList<Booking> bookingList = new ArrayList<>();
			bookingList.add(bk);
			BR.put(fa, bookingList);
			System.out.println("creat a new booking of "+fa.getName());
		}
	}
	
	public ArrayList<Booking> getBooking(Facility fa,LocalDateTime startDa,LocalDateTime endDa){
		if(BR.containsKey(fa)) {
			ArrayList<Booking> blist = new ArrayList<>();
			for(Booking b : BR.get(fa)) {
				if(b.getFac()==fa&&b.getStartDate()==startDa&&b.getEndDate()==endDa) {
					blist.add(b);
				}
				else {
					System.out.println("no booking");
				}
			}
			return blist;
		}
		else {
			System.out.println("no facility");
			return null;
		}
	}
	
	public void removeBooking(Booking bk) {
		if(BR.containsKey(bk.getFac())) {
			for(Booking b : BR.get(bk.getFac())) {
				if(b.Overlap(bk)) {
					BR.get(bk.getFac()).remove(b);
				}
				else {
					System.out.println("no booking");
				}
			}
		}
		else {
			System.out.println("no facility");
		}
	}
}
