package timeofday;

//Voorwaarden voor rauwe abstracte toestanden

/**
 * @invar hours and minutes are not negative en not greater than 24/60 (exclusive)
 * 		| 0 <= getHours() && getHours() < 24 &&
 * 		| 0 <= getMinutes() && getMinutes() < 60
 */

class TimeOfDay {
	//Voorwaarden geldige abstracte toestanden
	
	/**
	 * @invar hours and minutes are not negative en not greater than 24/60 (exclusive)
	 * 		| 0 <= this.minutesSinceMidnight/60 && this.minutesSinceMidnight/60 < 24 &&
	 * 		| 0 <= this.minutesSinceMidnight%60 && this.minutesSinceMidnight%60 < 60
	 */

	private int minutesSinceMidnight;
	
	//Voorwaarden constructor en getters
	
	/**
	 * @pre 
	 * 		|
	 * 		| 0 <= Integer.parseInt(initialTime.split(":")[0]) && Integer.parseInt(initialTime.split(":")[0]) < 24 &&
	 * 		| 0 <= Integer.parseInt(initialTime.split(":")[1]) && Integer.parseInt(initialTime.split(":")[1]) < 60
	 * @post | getHours() == Integer.parseInt(initialTime.split(":")[0])
	 * @post | getMinutes() == Integer.parseInt(initialTime.split(":")[1])
	 * @inspects | this
	 */

	
	public TimeOfDay(String initialTime) {
		int initialMinutes = Integer.parseInt(initialTime.split(":")[1]);
		int initialHours = Integer.parseInt(initialTime.split(":")[0]);
		this.minutesSinceMidnight = initialMinutes + 60*initialHours;
	}
	
	public int getHours() {
		return minutesSinceMidnight/60;
	}
	
	public int getMinutes() {
		return minutesSinceMidnight%60;
	}
	
	//Voorwaarden setHours
	
	/**
	 * @pre | 0 <= hours && hours < 24
	 * @post | this.getHours() == hours
	 * @post | this.getMinutes() == old(this.getMinutes())
	 * @mutates | this
	 */
	
	public void setHours(int hours) {
		int oldMinutes = this.minutesSinceMidnight%60;
		this.minutesSinceMidnight = hours*60 + oldMinutes;
	}
	
	//Voorwaarden setMinutes
	
	/**
	 * @pre | 0 <= minutes && minutes < 60
	 * @post | this.getMinutes() == minutes
	 * @post | this.getHours() == old(this.getHours())
	 * @mutates | this
	 */
	
	public void setMinutes(int minutes) {
		int oldHours = minutesSinceMidnight/60;
		this.minutesSinceMidnight = oldHours*60 + minutes;
	}
}
