package com.mohsinkd786.exceptions;

import java.sql.SQLException;
import java.util.concurrent.TimeoutException;

public class ThrowException {

	void sayHello(boolean sayMsg) throws Exception {
		// raise an exception
		if (sayMsg) {

			// throw msg with cause
			Throwable thr = new Throwable("Failed to Connect"); // cause
			Throwable thx = new Throwable("SQl Exception ", thr); //throwable object
			
			throw new SQLException(thx);
			
		} else {
			throw new TimeoutException("Timeout Exception");
		}
	}
}
