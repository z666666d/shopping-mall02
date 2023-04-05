package org.example.service;

import org.example.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account-service")
public interface AccountService {
    @PostMapping(value = "/account/increase")
    CommonResult increase(@RequestParam("userId") Long userId, @RequestParam("point") int point);
}
