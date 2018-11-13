package com.shineyoung.entity.user;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ShineYoung on 2018/11/13.
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "t_id")
    private Integer id;
    @Column(name = "t_name")
    private String name;
    @Column(name = "t_age")
    private Integer age;
    @Column(name = "t_address")
    private String address;
    @Column(name = "t_password")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
