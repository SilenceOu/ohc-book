package com.ohc.result;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/22 17:18
 */
public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
