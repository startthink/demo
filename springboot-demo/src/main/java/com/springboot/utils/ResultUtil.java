package com.springboot.utils;

import com.springboot.enums.Constants;
import com.springboot.result.Result;

/**
 *@ClassName: ResultUtil
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午10:29:25
 */
public class ResultUtil {

    public static Result<Object> success() {
        return success(null);
    }

    public static Result<Object> success(final Object object) {
        final Result<Object> result = new Result<Object>();
        result.setCode("100000");
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result<Object> error(final String code) {
    	final Result<Object> result = new Result<Object>();
        result.setCode(code);
        result.setMsg(Constants.getMsgByCode(code));
        return result;
    }
    
    public static Result<Object> error(final String code, final String msg) {
    	final Result<Object> result = new Result<Object>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result<Object> error(final Constants constant) {
    	final Result<Object> result = new Result<Object>();
        result.setCode(constant.getCode());
        result.setMsg(constant.getMsg());
        return result;
    }
}
