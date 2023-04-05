package org.example.service;
import lombok.extern.slf4j.Slf4j;
import org.example.dao.AccountDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhang
 * @version V1.0
 * 业务实现类
 */
@Service
@Slf4j
public class AccountService {

    @Resource
    private AccountDao accountDao;

    /**
     * 增加积分
     *
     * @param userId
     * @param point
     */
    public void increase(Long userId, int point) {
        log.info("------>account-service中增加账户积分开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        /*try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        accountDao.increase(userId, point);
        log.info("------>account-service中增加账户积分结束");
    }
}
