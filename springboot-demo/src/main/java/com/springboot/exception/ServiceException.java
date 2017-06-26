package com.springboot.exception;

import com.springboot.enums.Constants;

/**
 *@ClassName: ServiceException
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午9:39:16
 */
public class ServiceException extends Exception {

	/**
	 *@Fields serialVersionUID : TODO()
	 */
	private static final long serialVersionUID = -5863476546768577300L;

    private String code;
    
	/**
	 * Default Constructor.
	 */
	public ServiceException(){
		super();
	}
	
	/**
	 * Construcor for passing message.
	 */
	public ServiceException(final String message){
		super(message);
	}

	/**
	 * Construcor for passing cause.
	 */
	public ServiceException(final Throwable cause){
		super(cause);
	}

	/**
	 * Constructor for passing message and cause.
	 * @param message
	 * @param cause
	 */
	public ServiceException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construcor for passing constant.
	 */
	public ServiceException(final Constants constant){
		super(constant.getMsg());
		this.code = constant.getCode();
	}
    
    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}
