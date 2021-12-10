package org.self.management.controller;

import org.self.management.service.IWageService;
import org.self.management.vo.WageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/wage", method = RequestMethod.POST)
public class WageController {

    @Autowired
    private IWageService wageService;

    @RequestMapping(value = "/queryAll", method = RequestMethod.POST)
    @ResponseBody
    public List<WageVO> queryAll(@RequestBody WageVO wageVO) {
        return wageService.selectWageVOList(wageVO);
    }
}
