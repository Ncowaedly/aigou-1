package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("admin".equals(employee.getName())&&"123456".equals(employee.getPassword())){
            return AjaxResult.success();
        }else {
            return AjaxResult.error("您输入的账号信息有误，请重新输入");
        }
    }
    @RequestMapping(value = "/loginget",method = RequestMethod.GET)
    public AjaxResult loginget(){
       return new AjaxResult();
    }
}
