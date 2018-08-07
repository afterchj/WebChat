package com.ccq.controller;


import com.ccq.utils.WSClientUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hongjian.chen on 2018/8/1.
 */
@Controller
public class HomeController {


    private Logger log = Logger.getLogger(UserController.class);


    @ResponseBody
    @RequestMapping(value = "/switch", produces = "application/json; charset=utf-8")
    private String switchController(HttpServletRequest req, HttpServletResponse res) {
        res.setHeader("Access-Control-Allow-Origin", "*");
        String params = req.getParameter("switchFlag");
        System.out.println("params=" + params);
        String msg = "{\"result\":\"000\",\"msg\":\"成功\"}";
        if (params == null) {
            params = msg;
        }
        final String finalParams = params;
        new Thread(new Runnable() {
            public void run() {
                WSClientUtil.sendMsg(finalParams);
            }
        }).start();
        log.info("show-->" + params);
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/test", produces = "application/json; charset=utf-8")
    public String test(HttpServletResponse response, @RequestBody String params) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return params;
    }


    @RequestMapping(value = "/home")
    public String home() {

        return "home";
    }

}
