package com.em.controller;

import com.em.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lujunjie on 2018/6/26
 */
@Controller
public class LoginController {

    /**
     * 登录跳转
     * @return
     */
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String loginUI() {
        return "../../login";
    }

    /**
     * 登录表单处理
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(User user) {

        UsernamePasswordToken token = new UsernamePasswordToken(user.getId(),user.getPassword());
        Subject subject = SecurityUtils.getSubject();

        //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login";
        }
        if (subject.hasRole("admin")){
            return "redirect:/admin/showRoom";
        }else {
            return "redirect:/ordinary/showRoom";
        }
    }
}
