package org.example.controller;

import org.example.domain.CommonResult;
import org.example.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhang
 * @version V1.0
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    /**
     * 增加账户积分
     *
     * @param userId
     * @param point
     * @return
     */
    @PostMapping(value = "/account/increase")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("point") int point) {
        accountService.increase(userId, point);

        return new CommonResult(200, "增加积分成功");
    }
}
