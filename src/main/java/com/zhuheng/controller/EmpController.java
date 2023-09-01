package com.zhuheng.controller;

import com.zhuheng.daomain.Emp;
import com.zhuheng.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {
    @Resource
    private EmpService empService;

    @PostMapping
    public Result save(@RequestBody Emp emp) {
        Boolean flag =  empService.save(emp);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Emp emp) {
        Boolean flag =  empService.update(emp);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        Boolean flag =  empService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Emp emp =  empService.getById(id);
         Integer code;
         String msg = "";
        if(emp != null) {
            code = Code.GET_OK;
        }  else {
            code = Code.GET_ERR;
            msg="数据查询失败";
        }
        return new Result(emp,code,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Emp> list = empService.getAll();
        Integer code;
        String msg = "";
        if(list != null) {
            code = Code.GET_OK;
        }  else {
            code = Code.GET_ERR;
            msg="数据查询失败";
        }
        return new Result(list,code,msg);
    }
}
