package io.github.jmgarridopaz.bluezone.hexagon;

import java.time.Clock;
import java.util.Map;
import java.util.Set;


public interface ForParkingCars {

	/**
	 * Returns all the available rates in the city, indexed by name.
	 * 
	 * @return	a map of RateData objects, with the rate name as the keyDD. @see RateData
	 */
	public Map<String, RateData> getAllRatesByName();

	
	/**
	 * Issues a permit for a car parked at a regulated area, valid until a datetime, paying it with a card.
	 * Returns a ticket with the permit information.
	 * 
	 * First the permit price is calculated, depending on the number of minutes of the permit period,
	 * according to the rate of the area where the car is parked at.
	 * Then, permit price is charged to the payment card.
	 * And finally the permit is stored.
	 * 
	 * @param	clock			Clock to get current datetime from, since it will be the starting datetime of the permit period
	 * 
	 * @param	permitRequest	DTO with the info needed for issuing the permit. @see PermitRequest
	 * 
	 * @return	permitTicket	DTO with the info of the issued permit. @see PermitTicket
	 */
	public PermitTicket issuePermit ( Clock clock, PermitRequest permitRequest );

}
