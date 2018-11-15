package com.shineyoung.dao.user;

import com.shineyoung.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ShineYoung on 2018/11/13.
 */
@Transactional
public interface UserDAO extends JpaRepository<UserEntity, Integer>, JpaSpecificationExecutor<UserEntity>, Serializable {

        // 查询大于一定岁数的用户
        @Query(value = "select * from t_user where t_age > ?1", nativeQuery = true)
        public List<UserEntity> getUserOlderThanQuery(int age);

        //根据用户名、密码删除一条数据
        @Modifying
        @Query(value = "delete from t_user where t_name = ?1 and t_password = ?2",nativeQuery = true)
        public void deleteQuery(String name,String pwd);

        public boolean existsByNameAndPassword(String name, String password);
}
