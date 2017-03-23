package jason.krywenkyj.airticket.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;

public class TicketTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Passenger passenger = new Passenger();
		Seat seat = new Seat();
		seat.setRow(1);
		seat.setLetter('A');
		Ticket ticket = new Ticket(passenger, seat, 150);
		Assert.assertTrue(ticket.getTicketNo() > 1000000 );
	}
	@Test(expected=Exception.class)
	public void testTicketBad() {
		Ticket ticket = new Ticket(null, new Seat(), -100);
		Assert.assertTrue(ticket.getTicketNo() > 1000000 );
	}
}
