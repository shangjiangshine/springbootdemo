package com.shineyoung.dao.user;

import com.shineyoung.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;

import java.io.Serializable;

/**
 * Created by ShineYoung on 2018/11/13.
 */
public interface UserDAO extends JpaRepository<UserEntity, Integer>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable {

}
