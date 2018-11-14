package com.shineyoung.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.shineyoung.dao.user.UserDAO;
import com.shineyoung.entity.user.UserEntity;
import com.shineyoung.util.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ShineYoung on 2018/11/14.
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserDAO userDAO;

/*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(UserEntity user, HttpServletRequest request)
    {
        // 登录成功
        boolean flag = true;
        String result = "登录成功";
        // 根据用户名查询用户是否存在
        UserEntity userEntity = userDAO.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"), user.getName()));
                return null;
            }
        });
        // 用户不存在
        if(userEntity == null){
            flag = false;
            result = "用户不存在，登录失败";}
        // 密码错误
        else if(!userEntity.getPassword().equals(user.getPassword())){
            flag = false;
            result = "用户密码不相符，登录失败";
        }
        // 登录成功
        if(flag){
            //将用户写入session
            request.getSession().setAttribute("_session_user",userEntity);
        }
        return result;
    }
    */

    /**
     *
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSONObject login(UserEntity user, HttpServletRequest request)
    {
        JSONObject obj = new JSONObject();
        // 登录成功
        boolean flag = true;
        String result = "登录成功！";
        // 根据用户名查询用户是否存在
        UserEntity userEntity = userDAO.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("name"), user.getName()));
                return null;
            }
        });
        // 用户不存在
        if(userEntity == null){
            flag = false;
            result = "用户不存在，登录失败！";
            obj.put("msg", result);
        }
        // 密码错误
        else if(!userEntity.getPassword().equals(user.getPassword())){
            flag = false;
            result = "用户密码不相符，登录失败！";
            obj.put("msg", result);
        }
        // 登录成功
        if(flag){
            //将用户写入session
            request.getSession().setAttribute("_session_user",userEntity);
            obj.put("msg", "用户："+ user.getName() +"，"+ result);
        }
        //将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN, obj);
        return obj;
    }
}
