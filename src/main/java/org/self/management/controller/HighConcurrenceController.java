package org.self.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 高并发场景所需要的controller
 */
@RestController
@RequestMapping("/highConcurrence")
public class HighConcurrenceController {

    // 暂定五十件商品，由五百个人抢
    private static int count = 50;

    @RequestMapping(value = "/purchase", method = RequestMethod.GET)
    public String purchaseGoods() {
        String result = "购买成功";
        if (count <= 0)
            result = "购买失败，商品已售空。";
        else
            count--;
        System.out.println(result + " " + count);
        return result;
    }
}

