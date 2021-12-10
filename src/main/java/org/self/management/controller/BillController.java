package org.self.management.controller;

import org.self.management.service.IBillService;
import org.self.management.vo.BillVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private IBillService billService;

    @RequestMapping(value = "/queryAll", method = RequestMethod.POST)
    @ResponseBody
    public List<BillVO> queryAll(@RequestBody BillVO billVO) {
        return billService.selectBillVOList(billVO);
    }
}
