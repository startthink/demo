package com.springboot.exception;

/**
 *@ClassName: DaoException
 *@Description: TODO()
 *@author admin
 *@date 2017年4月18日 下午10:24:42
 */
public class DaoException extends Exception {

    /**
	 *@Fields serialVersionUID : TODO()
	 */
	private static final long serialVersionUID = 8110537125644711768L;
	
	/**
	 * Default Constructor.
	 */
	public DaoException(){
		super();
	}
	
	/**
	 * Construcor for passing message.
	 */
	public DaoException(final String message){
		super(message);
	}

	/**
	 * Construcor for passing cause.
	 */
	public DaoException(final Throwable cause){
		super(cause);
	}

	/**
	 * Constructor for passing message and cause.
	 * @param message
	 * @param cause
	 */
	public DaoException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
