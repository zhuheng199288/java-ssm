package com.zhuheng.controller;

import com.zhuheng.exception.BusinessException;
import com.zhuheng.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
//        System.out.println("嘿嘿，异常你哪里跑");
        // 消息日志
        // 发送消息给运维
        // 发送邮件给运维
        return new Result(ex.getCode(),null,ex.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(Code.SYSTEM_UNKNOW__ERR,null,"系统繁忙，请稍后再试！");
    }
}
