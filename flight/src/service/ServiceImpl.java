package service;

import exceptionPackage.DaoException;
import exceptionPackage.ServiceException;

public class ServiceImpl implements Service {

	@Override
	public void addToFlight(int flightId, String flightName, double ticketCost) throws ServiceException {
		try
		{
			daoLayer.addFlightToDB(flightId,flightName,ticketCost);
		}catch(DaoException e)
		{
			throw new ServiceException(e);
		}
		
	}

	@Override
	public void assignFlight(String flightName, String personName) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToPerson(int personId, String personName, double accountBal) throws DaoException, ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flightDetails() throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPerson() throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
