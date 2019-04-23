package com.retech.tpcms.exception;

import com.retech.tpcms.utils.ActionResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author qinc
 * @description 全局异常处理
 * @date 2018/12/11
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionResolver {

    @ExceptionHandler(value = Exception.class)
    public ActionResult allExceptionHandler(Exception exception) {
        exception.printStackTrace();
        return ActionResult.build(-1, "操作失败：" + exception.getMessage());
    }

}