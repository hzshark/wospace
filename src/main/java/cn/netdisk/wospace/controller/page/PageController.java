package cn.netdisk.wospace.controller.page;

import cn.netdisk.wospace.vo.admin.AdminUserInfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 页面跳转
 *
 * @author hshao
 * @company 杭州尚尚签网络科技有限公司
 * @date 2017/11/02 0011
 */
@Controller
@RequestMapping("/admin")
public class PageController {


    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index() {
        return "/login";
    }

    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLoginPage() {
        return "/login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String toMain(){
        return "main";
    }

    @RequestMapping(value = "/table",method = RequestMethod.GET)
    public String toTable(){
        return "table";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String toTest(){
        return "test";
    }


    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String toFrom(){
        List<AdminUserInfoVo> list = new ArrayList<AdminUserInfoVo>();
        return "form";
    }

}
