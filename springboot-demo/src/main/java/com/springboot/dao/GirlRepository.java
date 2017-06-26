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
package com.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Girl;
/**
 *@ClassName: GirlRepository
 *@Description: TODO()
 *@author admin
 *@date 2017年4月16日 下午6:04:44
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

	/** 通过年龄查询*/
	public List<Girl> findByAge(Integer age);
}
