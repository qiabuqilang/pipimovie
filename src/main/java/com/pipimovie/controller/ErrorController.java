package com.pipimovie.controller;

import com.pipimovie.response.CommonReturnType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ErrorController extends BaseController{
    @GetMapping("/error")
    public CommonReturnType error(){
        HashMap<String,String> response = new HashMap<>();
        response.put("msg","nofound");
        return CommonReturnType.create(response);
    }

}
