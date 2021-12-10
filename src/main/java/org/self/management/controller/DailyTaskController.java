package org.self.management.controller;

import org.self.management.service.IDailyTaskService;
import org.self.management.vo.DailyTaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dailyTask")
public class DailyTaskController {

    @Autowired
    private IDailyTaskService dailyTaskService;

    @RequestMapping(value = "/queryAll", method = RequestMethod.POST)
    @ResponseBody
    public List<DailyTaskVO> queryAll(@RequestBody DailyTaskVO dailyTaskVO) {
        return dailyTaskService.selectDailyTaskVOList(dailyTaskVO);
    }
}
