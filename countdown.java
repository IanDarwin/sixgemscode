import java.time.*;
void main() {
	System.out.print("Time left to JavaOne, Java 24 and JCB5 is ");
	Period p = Period.between(LocalDate.now(), LocalDate.of(2025,03,18));
	int nMonths = p.getMonths();
	if (nMonths > 0) {
		System.out.print(nMonths + (nMonths > 1 ? " months " : " month "));
	}
	if (p.getDays() > 0) {
		System.out.print(p.getDays() + " days.");
	} else if (nMonths /* also */ == 0) {
		System.out.println("Right now!?");
	}
	System.out.println();
}
