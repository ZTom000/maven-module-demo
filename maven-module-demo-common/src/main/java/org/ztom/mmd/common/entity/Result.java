package org.ztom.mmd.common.entity;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.ztom.mmd.common.contant.ErrorCode;
import org.ztom.mmd.common.contant.ErrorMassage;

import java.util.Optional;

/**
 * @ClassName Result
 * @Author ZTom
 * @Description //TODO
 * @Date 2023/3/30 19:29
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class Result<T> extends BaseEntity {
    public Result() {
            }

    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success() {
        return new Result(ErrorCode.SUCCESS, ErrorMassage.SUCCESS, null);
    }
    public static <T> Result<T> success(T data) {
        if(Optional.ofNullable(data).isPresent()) {
            return new Result(ErrorCode.SUCCESS, ErrorMassage.SUCCESS, data);
        }
            return new Result(ErrorCode.SUCCESS, ErrorMassage.SUCCESS, null);
    }
    public static <T> Result<T> fail() {
        return new Result(ErrorCode.SYSTEM_ERROR, ErrorMassage.SYSTEM_ERROR, null);
    }
    public static <T> Result<T> fail(Integer code, String msg) {
        return new Result(code, msg, null);
    }
    public static <T> Result<T> fail(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }
    public String toString() {
        return JSON.toJSONString(this);
    }
}
