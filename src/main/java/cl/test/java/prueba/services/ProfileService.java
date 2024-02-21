package cl.test.java.prueba.services;

import cl.test.java.prueba.exception.BciAppTestException;

/**
 * 
 * @author s2526158
 *
 */
public interface ProfileService {

	public Object getProfile(String id) throws BciAppTestException;
}
