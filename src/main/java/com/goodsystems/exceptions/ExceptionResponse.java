package com.goodsystems.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date timesStamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timesStamp, String message, String details) {
		this.timesStamp = timesStamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimesStamp() {
		return timesStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}	
}
