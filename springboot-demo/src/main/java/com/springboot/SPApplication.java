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
package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 *@ClassName: SpringBootApplication
 *@Description: TODO()
 *@author admin
 *@date 2017年4月16日 上午9:10:11
 */
//@EnableAutoConfiguration		//Springboot应用自动扫描并注册bean
@ServletComponentScan			//servlet扫描器，扫描listener、filter、servlet
@SpringBootApplication
public class SPApplication {

	/**
	@Bean
    public EmbeddedServletContainerFactory servletContainer() {  
        JettyEmbeddedServletContainerFactory factory =  
                new JettyEmbeddedServletContainerFactory();  
        return factory;  
    }  
    */
	
	public static void main(String[] args) {
		SpringApplication.run(SPApplication.class, args);
	}
	
}


/**
 * 启动方式分为两种（Linux）：
 * 1、第一种：
 *		进入工程根目录（与src、target、pom.xml一个目录）
 *		mvn spring-boot:run
 * 2、第二种：
 * 		进入工程根目录（与src、target、pom.xml一个目录）
 * 		mvn install
 * 	 	cd target
 * 		java -jar springboot-demo.jar
 * 		注意：使用java -jar启动可以按dev或qa或生产环境的配置文件来启动程序，如下：
 * 			java -jar springboot-demo.jar --spring.profiles.active=pro
 */
	