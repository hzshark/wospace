package cn.netdisk.wospace.controller.user;

import cn.netdisk.wospace.controller.BaseController;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.message.Message;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/29.
 */
@RestController
@RequestMapping("/admin")
public class AccountController extends BaseController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject Login(){
        JSONObject resp = new JSONObject();
        resp.put("name","Ryan");
        resp.put("status",true);
        resp.put("rel",true);
        return resp;
    }


    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void loginOut() {

//        session.invalidate();

    }
    @RequestMapping("/json")
    @ResponseBody
    public Map<String,Object> json(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Ryan");
        map.put("age","18");
        map.put("sex","man");
        return map;
    }

    @RequestMapping("/index/{name}")
    @ResponseBody
    public String index(@PathVariable String name) {

        if (null == name) {
            name = "boy";
        }

        return "hello world " + name;
    }

    @RequestMapping("/setsession/{age}")
    @ResponseBody
    public String TestSession(@PathVariable String age){
        session.setAttribute("age", age);
        return "set session age value:"+age;
    }

    @RequestMapping("/getsession")
    @ResponseBody
    public String TestSession(){
        String a = (String) session.getAttribute("age");
        return a;
    }

    @RequestMapping("/exceptionTest")
        public String testException() {
            Message msg = null;
            msg.toString();
            createException();
            return "我是正常的";
        }

    @RequestMapping(value = "/testlog", method = RequestMethod.GET)
    public String testLog(){
        logger.debug("Logger Level ：DEBUG");
        logger.info("Logger Level ：INFO");
        logger.error("Logger Level ：ERROR");
        return "<h1>Welcome to das,欢迎使用</h1>";
    }

        private void createException() {
            int i = 5 / 0;
        }

}
