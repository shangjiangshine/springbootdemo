package com.shineyoung.controller.user;

import com.shineyoung.dao.user.UserDAO;
import com.shineyoung.entity.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by ShineYoung on 2018/11/13.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    /**
     * 查询用户列表方法
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserEntity> userEntityList() {
        return userDAO.findAll();
    }

    /**
     * 添加、更新用户方法
     * @param entity
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public UserEntity save(UserEntity entity) {
        return userDAO.save(entity);
    }

    /**
     * 删除用户方法
     * @param id 用户编号
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Integer id)
    {
        userDAO.delete(id);
        return userDAO.findAll();
    }
}
