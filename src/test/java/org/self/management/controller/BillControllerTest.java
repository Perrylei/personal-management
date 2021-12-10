package org.self.management.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.self.management.vo.BillVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
}