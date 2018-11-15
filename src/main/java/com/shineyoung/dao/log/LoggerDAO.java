package com.shineyoung.dao.log;

import com.shineyoung.entity.log.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ShineYoung on 2018/11/14.
 */
public interface LoggerDAO extends JpaRepository<LoggerEntity, Integer> {
}
