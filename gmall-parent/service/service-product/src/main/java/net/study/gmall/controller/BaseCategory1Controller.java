package net.study.gmall.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseCategory1;
import net.study.gmall.service.service.BaseCategory1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value ="api/category1")
public class BaseCategory1Controller {
    @Autowired
    private BaseCategory1Service baseCategory1Service;

    /**
     * 主键查询
     * @param id
     * 访问的地址：http://localhost:8206/api/category1/getCategory1/1
     * @return
     */

    @GetMapping(value = "getCategory1/{id}")
    public Result getCategory1(@PathVariable(value = "id") Long id){
        return Result.ok(baseCategory1Service.getBaseCatetory1(id));
    }

}
