package entity;

public class Flight {
	int flightId;
	String ticketCost;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(String ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Flight(int flightId, String ticketCost) {
		super();
		this.flightId = flightId;
		this.ticketCost = ticketCost;
	}

}
