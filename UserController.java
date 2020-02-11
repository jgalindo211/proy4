package com.kswaughs.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kswaughs.web.beans.UserReq;
import com.kswaughs.web.beans.UserResp;

@Controller
@RequestMapping("usersvc")
public class UserController {

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public UserResp getUser(@PathVariable String id) {

        UserResp resp = new UserResp();
  
        resp.setId(id);
        resp.setStatus("SUCCESS");
        resp.setMessage("GET Method Processed successfully");

        return resp;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public UserResp addUser(@RequestBody UserReq req) {

        UserResp resp = new UserResp();
  
        resp.setId(req.getId());
        resp.setStatus("SUCCESS");

        StringBuilder msg = new StringBuilder()
            .append("Hi ").append(req.getName())
            .append(", POST method Processed successfully");
  
        resp.setMessage(msg.toString());

        return resp;
    }
}