package com.lc.bootorderconsumer.controller;

import com.lc.bean.UserAddress;
import com.lc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/20
 * @Description
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/order")
    public List<UserAddress> initOrder(){
        List<UserAddress> userAddresses = orderService.initOrder("1");
        return userAddresses;
    }

}
