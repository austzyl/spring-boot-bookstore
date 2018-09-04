package com.ylz.springboot.beans;

import java.io.Serializable;

public class ResultObject<T> implements Serializable {

    private static final Long serialVersionUID = 1L;

    public static final String SUCC = "true";
    public static final String FAIL = "false";

    private T data;

    private String success = SUCC;

    private String message = "";

    public ResultObject() {
        super();
    }

    public ResultObject(T data) {
        this.data = data;
    }

    public ResultObject(T data, String success, String message) {
        this.data = data;
        this.success = success;
        this.message = message;
    }

    public ResultObject(Throwable throwable) {
        super();
        this.message = throwable.toString();
        this.success = FAIL;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultObject{" +
                "data=" + data +
                ", success='" + success + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
