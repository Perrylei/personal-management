package org.self.management.vo;

import lombok.Data;

/**
 * 自定义操作的状态码以及信息
 */
public enum OperationEnum {
    SUCCESS(200, "操作成功！"),
    ERROR(500, "服务器异常，请练习管理员！");

    OperationEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "OperationEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
