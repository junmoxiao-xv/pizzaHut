package com.xyj.xyjcommon.entity;


public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>(200, "成功", data);
    }

    public static <T> Result<T> parameterError(T data) {
        return new Result<>(400, "请求参数错误", data);
    }

    public static <T> Result<T> notLogin(T data) {
        return new Result<>(401, "请求授权失败", data);
    }

    public static <T> Result<T> permissionDenied(T data) {
        return new Result<>(403, "权限不足", data);
    }

    public static <T> Result<T> notFound(T data) {
        return new Result<>(404, "请求资源不存在", data);
    }

    public static <T> Result<T> RequestMethodError(T data) {
        return new Result<>(405, "不支持该请求方法", data);
    }

    public static <T> Result<T> serverError(T data) {
        return new Result<>(500, "服务器内部错误", data);
    }
    public static <T> Result<T> phoneBad(T data) {
        return new Result(501, "IP或pwd错误，请输入最少11位数的账号，密码最少为6位！", data);
    }

    public static <T> Result<T> pwdBad(T data) {
        return new Result(502, "IP或pwd错误", data);
    }

    public static <T> Result<T> serverUnavailable(T data) {
        return new Result<>(503, "服务器不可用", data);
    }

    public static <T> Result<T> regFail(T data) {
        return new Result(504, "注册失败", data);
    }

    public static <T> Result<T> intFail(T data) {
        return new Result(505, "IP已存在", data);
    }

    public static <T> Result<T> updateFail(T data) {
        return new Result(506, "更新失败", data);
    }

    public static <T> Result<T> pwdNull(T data) {
        return new Result(507, "请先设置支付密码", data);
    }

    public static <T> Result<T> queryFail(T data) {
        return new Result(507, "查询失败", data);
    }

    public static <T> Result<T> mdFail(T data) {
        return new Result(508, "余额不足", data);
    }

    public static <T> Result<T> Fail(T data) {
        return new Result(509, "操作失败", data);
    }

    public static <T> Result<T> parameterFail(T data) {
        return new Result(510, "参数错误", data);
    }

    public static <T> Result<T> formatError(T data) {
        return new Result(511, "格式错误", data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
