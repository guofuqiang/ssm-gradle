package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 创建作者:
 * 创建日期:   2017-4-20 上午11:17:54
 * 类介绍  :   存储json对象
 * 构造参数:   
 *
 */
public class ToJson<T> {
    /**
     * 需转换json对象集合
     */
    private List<T> obj = new ArrayList<T>();

    /**
     * 单个对象
     */
    private Object object;

    /**
     * 返回信息结果标识布尔值
     */
    private boolean flag;

    /**
     * 返回消息提示
     */
    private String msg;

    /**
     * 返回消息提示
     */
    private String code;


    /**
     * 返回消息提示
     */
    private String token;
    
    /**
     * 查询总条数
     */
    private Integer totleNum;

    // IM 信息消息记录用
    private Object obj1;

    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    /**
	 * 创建作者:
	 * 创建日期:   2017-4-20 上午11:17:54
	 * 类介绍  :    存储json对象
	 * 构造参数:   @param flag 0 是 true 1 是 false
	 * 构造参数:  @param msg
     */
    public ToJson(int flag, String msg){
        if(flag==0){
            this.flag = true;
        }else{
            this.flag = false;
        }
        this.msg = msg;
    }
    
    /**
	 * 
	 */
	public ToJson() {
	}

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:19:33
     * 方法介绍:   需转换json对象集合
     * 参数说明:   @return  对象集合
     * @return     List<T>
     */
    public List<T> getObj() {
        return obj;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:19:54
     * 方法介绍:   需转换json对象集合
     * 参数说明:   @param obj 设置对象集合
     * @return     void
     */
    public void setObj(List<T> obj) {
        this.obj = obj;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:20:18
     * 方法介绍:   返回消息提示
     * 参数说明:   @return
     * @return     String
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:20:31
     * 方法介绍:   返回消息提示
     * 参数说明:   @param msg
     * @return     void
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:20:42
     * 方法介绍:   单个对象
     * 参数说明:   @return
     * @return     Object
     */
    public Object getObject() {
        return object;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:21:13
     * 方法介绍:   单个对象
     * 参数说明:   @param object 设置单个对象
     * @return     void
     */
    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:21:32
     * 方法介绍:   返回信息结果标识布尔值
     * 参数说明:   @return
     * @return     boolean true/false
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:21:47
     * 方法介绍:   返回信息结果标识布尔值 0:true/1:false
     * 参数说明:   @param flag true/fasle
     * @return     void
     */
    public void setFlag(int flag) {
    	 if(flag==0){
             this.flag = true;
         }else{
             this.flag = false;
         }
    }

    /**
     * 
     * 创建作者:
     * 创建日期:   2017-4-20 上午11:31:45
     * 方法介绍:   查询总条数
     * 参数说明:   @return
     * @return     Integer
     */
	public Integer getTotleNum() {
		return totleNum;
	}

	/**
	 * 
	 * 创建作者:
	 * 创建日期:   2017-4-20 上午11:31:55
	 * 方法介绍:   查询总条数
	 * 参数说明:   @param totleNum
	 * @return     void
	 */
	public void setTotleNum(Integer totleNum) {
		this.totleNum = totleNum;
	}


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
