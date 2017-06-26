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
package com.springboot.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.GirlRepository;
import com.springboot.entity.Girl;
import com.springboot.enums.Constants;
import com.springboot.exception.ServiceException;
import com.springboot.vo.GirlVo;

/**
 *@ClassName: GirlService
 *@Description: TODO()
 *@author admin
 *@date 2017年4月16日 下午6:33:56
 */
@Service
public class GirlService {

	/** 注入DAO */
	@Autowired
	private GirlRepository girlRepository;
	
	/**
	 *@Title: insertTwo
	 *@Description: 注解式事物控制
	 *@return void
	 *@author admin
	 *@date 2017年4月16日 下午6:38:04
	 */
	@Transactional
	public void insertTwo(){

	}
	
	public List<Girl> findAll(){
		return girlRepository.findAll();
	}
	
	public List<Girl> findByAge(Integer age){
		return girlRepository.findByAge(age);
	}

	/**
	 *@Title: save
	 *@Description: 注解式事物控制
	 *@return Girl
	 *@author admin
	 *@date 2017年4月18日 上午11:20:37
	 *@param girl
	 */
	@Transactional
	public Girl save(final GirlVo girlVo) throws ServiceException{
		/*
		//额外新增一个girl，用来测试事物
        Girl girlA = new Girl();
        //girlA.setName("张三");
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);
        */
		final Girl girl = new Girl();
        BeanUtils.copyProperties(girlVo, girl);
        
        try {
			Integer.parseInt("aa");
		} catch (Exception e) {
			throw new ServiceException(Constants.GIRL_SERVICE_EXCEPTION);
		}
        
		return girlRepository.save(girl);
	}
	
	public void delete(final Integer id){
		girlRepository.delete(id);
	}
	
}
