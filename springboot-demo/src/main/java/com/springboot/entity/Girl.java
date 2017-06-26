/*
* Conditions Of Use
*
* This software was developed by employees of the Sigmatrix(Beijing) Corporation.
* This software is provided by sigmatrix as a service and is expressly
* provided "AS IS."  Sigmatrix MAKES NO WARRANTY OF ANY KIND, EXPRESS, IMPLIED
* OR STATUTORY, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTY OF
* MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NON-INFRINGEMENT
* AND DATA ACCURACY.  Sigmatrix does not warrant or make any representations
* regarding the use of the software or the results thereof, including but
* not limited to the correctness, accuracy, reliability or usefulness of
* the software.
*
* Permission to use this software is contingent upon your acceptance
* of the terms of this agreement.
*
*/
package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 *@ClassName: Girl
 *@Description: TODO()
 *@author admin
 *@date 2017年4月16日 下午5:35:26
 */
@Entity
public class Girl implements Serializable {

	/**
	 *@Fields serialVersionUID : TODO()
	 */
	private static final long serialVersionUID = 6249551731064717596L;
	
	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private Integer age;

	private String cupSize;
	
	public Girl(){
	}
	/**
	 *@return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 *@param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 *@return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 *@param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *@return the cupSize
	 */
	public String getCupSize() {
		return cupSize;
	}
	/**
	 *@param cupSize the cupSize to set
	 */
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
	/**
	 *@return the age
	 */
	@Min(value = 18, message = "未成年禁止入内")
	public Integer getAge() {
		return age;
	}
	/**
	 *@param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/**(non-Javadoc)
	 *@Title: toString
	 *@Description: 
	 *@see java.lang.Object#toString()
	 *@author admin
	 *@date 2017年4月18日 上午11:35:27
	 */
	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", age=" + age + ", cupSize=" + cupSize + "]";
	}

	
}
