package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay NewTime = new TimeOfDay(18, 14);
		int hours =  NewTime.getHours();
		int minutes = NewTime.getMinutes();
		NewTime.setHours(23);
		NewTime.setMinutes(37);
	}

}
