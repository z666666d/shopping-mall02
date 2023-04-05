package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhang
 * @version V1.0
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param point
     */
    void increase(@Param("userId") Long userId, @Param("point") int point);
}
