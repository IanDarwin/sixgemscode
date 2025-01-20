import java.time.LocalDate;

class One {
	int dayOfMonth;
	One(int dayOfMonth) {
		if (dayOfMonth <= 0 || dayOfMonth > 31)
			throw new IllegalArgumentException(
				"Day of Month out of range in call to One()");
		super();
		this.dayOfMonth = dayOfMonth;
	}
}

class Two extends One {
	Two() {
		var x = LocalDate.now().getDayOfMonth();
		super(x);
	}
}

public class StatementsBeforeSuper {
	void main() {
		var o = new Two();
		System.out.println("Day of Month is " + o.dayOfMonth);
	}
}
