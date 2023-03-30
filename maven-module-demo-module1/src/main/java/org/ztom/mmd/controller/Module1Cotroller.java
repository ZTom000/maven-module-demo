package org.ztom.mmd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.ztom.mmd.common.entity.Result;

/**
 * @ClassName Module1Cotroller
 * @Author ZTom
 * @Description //TODO
 * @Date 2023/3/30 19:45
 * @Version 1.0
 **/
@RestController
public class Module1Cotroller {

    @GetMapping("module1/test/{val}")
    public Result test(@PathVariable(value = "val", required = false) String val) {
        return Result.success(val);
    }
}
