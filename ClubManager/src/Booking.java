import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Booking {
	private Member mem;
	private Facility fac;
	private LocalDateTime startDate;
	private LocalDateTime endDate;

	public Booking(Member mem, Facility fac, LocalDateTime startDate, LocalDateTime endDate) throws BadBookingException{
		if(startDate.isAfter(endDate)) {
			throw new BadBookingException("Incorrect date");
		}
		else {
		this.mem = mem;
		this.fac = fac;
		this.startDate = startDate;
		this.endDate = endDate;
		}
	}

	public Booking(Member mem, LocalDateTime startDate, LocalDateTime endDate) throws BadBookingException{
		throw new BadBookingException("none facilities");
	}

	public Booking(Facility fac, LocalDateTime startDate, LocalDateTime endDate) throws BadBookingException{
		throw new BadBookingException("none member");
	}


	public Booking(Member mem, Facility fac, LocalDateTime Date) throws BadBookingException{
		throw new BadBookingException("need more date");
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Facility getFac() {
		return fac;
	}

	public void setFac(Facility fac) {
		this.fac = fac;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Boolean Overlap(Booking bk) {
		if (this.fac == bk.fac && this.startDate == bk.startDate && this.endDate == bk.endDate) {
			return true;
		} else
			return false;
	}

	public String toString() {
    	String str = this.mem.toString()+this.fac.getName()+this.startDate.format(DateTimeFormatter.ofPattern("DD-MM-YY"));
    	return str;
    }

}
