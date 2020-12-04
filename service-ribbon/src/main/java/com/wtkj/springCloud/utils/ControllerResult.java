package com.wtkj.springCloud.utils;


/**
 * 统一返回数据传输类
 * @author ta0546 wz
 * @time 2018-04-20
 */
public class ControllerResult {
	/**
	 * 返回状态 true成功， false失败
	 */
	private boolean status;
	/**
	 * 成功或失败内容提示
	 */
	private String message;
	/**
	 * 相关数据
	 */
	private Object data;

	/**
	 * 成功提示
	 * @param message  消息
	 * @param data 数据
	 * @return
	 */
	public static ControllerResult success(String message, Object data) {
		return new ControllerResult(true,message,data);
	}
	/**
	 * 失败提示
	 * @param message  消息
	 * @param data 数据
	 * @return
	 */
	public static ControllerResult faliure(String message, Object data) {
		return new ControllerResult(false,message,data);
	}
	/**
	 * 成功提示
	 * @param data 数据
	 * @return
	 */
	public static ControllerResult success(Object data) {
		return ControllerResult.success(MsgConstant.SUCCESS,data);
	}
	/**
	 * 成功提示
	 * @return
	 */
	public static ControllerResult success() {
        return ControllerResult.success(null);
    }
	/**
	 * 失败提示
	 * @param data 数据
	 * @return
	 */
	public static ControllerResult faliure(Object data) {
		return ControllerResult.faliure(MsgConstant.FAIL,data);
	};
	
	public ControllerResult(boolean b, String msg, Object o) {
		message = msg;
		status = b;
		data = o;
	}

	public ControllerResult() {
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
