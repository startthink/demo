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
package com.springboot.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.enums.Constants;
import com.springboot.exception.ServiceException;
import com.springboot.result.Result;
import com.springboot.utils.ResultUtil;

/**
 *@ClassName: ExceptionHandle
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午10:08:52
 */
@ControllerAdvice
public class ExceptionHandle {

	/** logger */
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     *@Title: handle
     *@Description: 统一异常处理，直接返回前端
     *@return Result<Object>
     *@author admin
     *@date 2017年4月17日 下午10:34:45
     *@param e
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<Object> handle(final Exception e) {
        if (e instanceof ServiceException) {
        	final ServiceException cException = (ServiceException) e;
        	logger.info("【业务异常】={}",cException.getCode());
            return ResultUtil.error(cException.getCode(), cException.getMessage());
        }else {
            logger.error("【系统异常】={}", e);
            return ResultUtil.error(Constants.UNKONW_ERROR);
        }
    }
}
