package service;

import exceptionPackage.DaoException;
import exceptionPackage.ServiceException;

public interface Service {

	void addToFlight(int flightId, String flightName, double ticketCost) throws ServiceException;

	void assignFlight(String flightName, String personName) throws ServiceException;

	void addToPerson(int personId, String personName, double accountBal) throws DaoException,ServiceException;

	void flightDetails() throws ServiceException;

	void showPerson() throws ServiceException;

}
