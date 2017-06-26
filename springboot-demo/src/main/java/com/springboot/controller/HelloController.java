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
package com.springboot.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.springboot.entity.Girl;
import com.springboot.properties.GirlProperties;
import com.springboot.service.GirlService;
import com.springboot.utils.ResultUtil;
import com.springboot.vo.GirlVo;

/**
 *@ClassName: HelloController
 *@Description: TODO()
 *@author admin
 *@date 2017年4月16日 上午9:39:44
 */
@RestController				//这个注解是spring4之后新加的注解，它是@ResponseBody和@Controller组合起来的一个注解
@RequestMapping("/hello")
public class HelloController {

	/** 注入配置文件 */
	@Autowired
	private GirlProperties girlProperties;
	
	/** 注入Service */
	@Autowired
	private GirlService girlService;
	
	/**
	 *@Title: say
	 *@Description: TODO()
	 *@return String
	 *@author admin
	 *@date 2017年4月16日 下午6:07:07
	 *@param myId
	 *@return
	 */
	
	@GetMapping(value = "/say")													//@RequestMapping(value = {"/say", "/hi"}, method = RequestMethod.GET)
	public String say(@PathVariable("id") Integer myId){						//say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId)
		return girlProperties.getCupSize()+girlProperties.getAge();
	}
	
	@GetMapping(value = "/girls")
	public List<Girl> girlList(){
		return girlService.findAll();
	}
	
	/**
	 *@Title: addGirl
	 *@Description: TODO()
	 *@return Object
	 *@author admin
	 *@date 2017年4月17日 下午10:55:14
	 *@param girl
	 *@param bindingResult
	 */
	@PostMapping(value = "/addGirl")											//@RequestMapping(value = "/addGirl", method = RequestMethod.POST)
	public Object addGirl(@Valid final GirlVo girlVo, final BindingResult bindingResult) throws Exception{
		if(bindingResult.hasErrors()){
			return ResultUtil.error(bindingResult.getFieldError().getDefaultMessage());
		}
		
		return ResultUtil.success(girlService.save(girlVo));
	}
	
	@DeleteMapping(value = "/girls/del/{id}")
	public void delGirl(@PathVariable("id") Integer id){
		girlService.delete(id);
	}

	@GetMapping(value = "/girls/findByAge/{age}")
	public Object findByAge(@PathVariable("age") Integer age){
		return girlService.findByAge(age);
	}
	
	
	
	

	public static String objectToJsonString(final Object object){
		final SerializeConfig mapping = new SerializeConfig();
		mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
		return JSON.toJSONString(object,mapping,SerializerFeature.WriteDateUseDateFormat);
	}
	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setCupSize("C");
		girl.setAge(26);
		System.out.println(objectToJsonString(girl));
	}
	
	
	
	/**
	正确响应的json格式：
	{
		"code": 0,
		"msg": "金额必须传递",
		"data": {
			"id": 20,
			"cupSize": "B",
			"age": 25,
			"money": 1.2
		}
	}
	 错误响应的json格式：
	{
		"code":1,
		"msg":"金额必须传递",
		"data":null
	}
	 


	 */
	
}
