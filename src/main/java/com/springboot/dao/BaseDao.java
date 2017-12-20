package com.springboot.dao;

import com.springboot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

/**
 * Created by 文江 on 2017/12/20.
 */
@NoRepositoryBean
public interface BaseDao<T> extends JpaRepository<T,Long> {

}
