package org.self.management.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.self.management.vo.BillVO;
import org.self.management.vo.OperationEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class BillControllerTest {

    @Autowired
    private BillController billController;

    @Test
    void queryAll() {
        List<BillVO> billVOS = billController.queryAll(new BillVO());
        for (BillVO vo : billVOS) {
            System.out.println(vo.toString());
        }
    }

    @Test
    void insertBillVO() {
        BillVO billVO = new BillVO();
        billVO.setAmount(2l);
        billVO.setTime(new Date());
        billVO.setIsOutput(1l);
//        billVO.setMode("alipay");
        System.out.println(billController.insertBillVO(billVO));
    }

    @Test
    void updateBillVO() {
        BillVO billVO = new BillVO();
        billVO.setId("1");
        billVO.setAmount(55l);
        billVO.setTime(new Date());
        billVO.setCreateTime(new Date());
        billVO.setIsOutput(1l);
        OperationEnum anEnum = billController.updateBillVO(billVO);
        System.out.println(anEnum.toString());
    }
}