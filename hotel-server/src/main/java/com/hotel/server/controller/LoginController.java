package com.hotel.server.controller;

import com.hotel.server.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import com.hotel.server.pojo.User;
import java.util.Objects;
@RestController
public class LoginController {
    @CrossOrigin
    @RequestMapping("api/login")
    public Result login(@RequestBody User user){
        String username=HtmlUtils.htmlEscape(user.getUsername());
        if(!"admin".equals(username)||!"123456".equals(user.getPassword())){
            return new Result(400);
        }else{
            return new Result(200);
        }
    }
}
