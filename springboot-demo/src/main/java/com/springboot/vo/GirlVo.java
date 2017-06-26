package com.springboot.vo;

import java.io.Serializable;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.springboot.enums.Constants;

/**
 *@ClassName: GirlVo
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午10:59:42
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class GirlVo implements Serializable{

	/**
	 *@Fields serialVersionUID : TODO()
	 */
	private static final long serialVersionUID = -7006837775743772536L;

	private Integer id;
    @NotBlank(message = Constants.RE_GIRL_NAME_IS_NULL)
	private String name;
    @Min(value = 18, message = Constants.RE_GIRL_PRIMARY_SCHOOL)
	private Integer age;
    @NotBlank(message = Constants.RE_GIRL_CUP_SIZE_MUST_INPUT)
	private String cupSize;
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
	
	/**(non-Javadoc)
	 *@Title: toString
	 *@Description: 
	 *@see java.lang.Object#toString()
	 *@author admin
	 *@date 2017年4月18日 上午11:36:34
	 */
	@Override
	public String toString() {
		return "GirlVo [id=" + id + ", name=" + name + ", age=" + age + ", cupSize=" + cupSize + "]";
	}
	
    
    
}
