package com.shineyoung.entity.user;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ShineYoung on 2018/11/13.
 * 忽略属性字段，由于使用的json包是fastjson，所以使用@JSONField(serialize = false)方式。
 * 或者在对象对应字段前面加transient，表示该字段不用序列化，即在生成json的时候就不会包含该字段了，如private transient  String name;
 * 如果是jackson,则使用@JsonIgnore（注意此时引入的类是 com.fasterxml.jackson.annotation.JsonIgnore，如果使用 org.codehaus.jackson.annotate.JsonIgnore 则不能生效）
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "t_id")
    @JSONField(serialize = false)
    private Integer id;
    @Column(name = "t_name")
    private String name;
    @Column(name = "t_age")
    private Integer age;
    @Column(name = "t_address")
    private String address;
    @Column(name = "t_password")
    @JSONField(serialize = false)
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
