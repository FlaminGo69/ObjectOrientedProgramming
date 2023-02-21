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
	 * 		| 0 <= this.hours && this.hours < 24 &&
	 * 		| 0 <= this.minutes && this.minutes < 60
	 */

	private int hours;
	private int minutes;
	
	//Voorwaarden constructor en getters
	/**
	 * @pre 
	 * 		| 0 <= initialHours && initialHours < 24 &&
	 * 		| 0 <= initialMinutes && initialMinutes < 60
	 * @post | getHours() == initialHours
	 * @post | getMinutes() == initialMinutes
	 * @inspects | this
	 */
	
	public TimeOfDay(int initialHours, int initialMinutes) {
		this.hours = initialHours;
		this.minutes = initialMinutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	//Voorwaarden setHours
	/**
	 * @pre | 0 <= hours && hours < 24
	 * @post | this.getHours() == hours
	 * @post | this.getMinutes() == old(this.getMinutes())
	 * @mutates | this
	 */
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	//Voorwaarden setMinutes
	/**
	 * @pre | 0 <= minutes && minutes < 60
	 * @post | this.getMinutes() == minutes
	 * @post | this.getHours() == old(this.getHours())
	 * @mutates | this
	 */
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
