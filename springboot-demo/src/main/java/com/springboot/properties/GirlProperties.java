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
package com.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: GirlProperties
 * @Description: TODO
 * @Author: TN
 * @Version: v0.0.1
 */
@Component
@ConfigurationProperties(prefix = "girl") //从yml中获取前缀为girl的配置信息
public class GirlProperties {

	private String cupSize;
	private Integer age;
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
	public Integer getAge() {
		return age;
	}
	/**
	 *@param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
