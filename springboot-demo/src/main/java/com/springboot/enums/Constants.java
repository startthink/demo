package com.springboot.enums;

/**
 *@ClassName: Constants
 *@Description: TODO()
 *@author admin
 *@date 2017年4月17日 下午9:46:38
 */
public enum Constants {
	UNKONW_ERROR						("-1", "未知错误"),
    SUCCESS								("100000", "成功"),
    GIRL_NAME_IS_NULL					("100001","name不能为空"),
    GIRL_PRIMARY_SCHOOL					("100002", "小于18岁禁止入内"),
    GIRL_CUP_SIZE_MUST_INPUT			("100003", "cupSize字段必须输入"),
    GIRL_SERVICE_EXCEPTION				("100004", "测试service层异常"),
    ;

	public static final String RE_UNKONW_ERROR = 								"-1";
	public static final String RE_SUCCESS = 									"100000";
	public static final String RE_GIRL_NAME_IS_NULL = 							"100001";
	public static final String RE_GIRL_PRIMARY_SCHOOL = 						"100002";
	public static final String RE_GIRL_CUP_SIZE_MUST_INPUT = 					"100003";
	public static final String RE_GIRL_SERVICE_EXCEPTION = 						"100004";
	
    private String code;
    
    private String msg;
    
    /** 构造方法，注意：构造方法不能为public，因为enum并不可以被实例化 */
    private Constants(final String code) {
        this.code = code;
    }
    
    /** 构造方法，注意：构造方法不能为public，因为enum并不可以被实例化 */
    private Constants(final String code, final String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public static String getMsgByCode(final String code){
    	for(final Constants constant : Constants.values()){
    		if(constant.getCode().equals(code)){
    			return constant.getMsg();
    		}
		}
    	return "";
    }
    
    public String getCode() {
        return code;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public static void main(String[] args) {
		for(final Constants constant : Constants.values()){
			System.out.println(constant.getCode()+"|"+constant.getMsg());
		}
	}
}
