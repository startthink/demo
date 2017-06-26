package com.springboot.result;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *@ClassName: Result
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午1:08:46
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class Result<T> implements Serializable {

	/**
	 *@Fields serialVersionUID : TODO()
	 */
	private static final long serialVersionUID = -964608447546018692L;

	private String code;
	
	private String msg;
	
	private T data;

	/**
	 *@return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 *@param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 *@return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 *@param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 *@return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 *@param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
