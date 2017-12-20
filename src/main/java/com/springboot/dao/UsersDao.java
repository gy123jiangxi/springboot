package com.springboot.dao;

import com.springboot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 文江 on 2017/12/20.
 */
@Repository
public interface UsersDao extends BaseDao<Users> {
    @Query("select t from Users t where  t.username=:userName")
    Users findUserByName( @Param("userName") String   userName);
}
