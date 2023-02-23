package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay NewTime = new TimeOfDay("1:54");
		NewTime.setHours(2);
		NewTime.setMinutes(37);
		assert(NewTime.getMinutes() == 37);
	}

}
