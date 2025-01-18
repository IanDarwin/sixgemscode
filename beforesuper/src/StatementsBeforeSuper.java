import java.time.LocalDate;

class One {
	int dom;
	One(int dom) {
		if (dom <= 0 || dom > 31)
			throw new IllegalArgumentException(
				"Day of Month out of range in call to One()");
		super();
		this.dom = dom;
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
		System.out.println("Day of Month is " + o.dom);
	}
}
