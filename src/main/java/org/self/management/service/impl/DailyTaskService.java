package org.self.management.service.impl;

import org.self.management.dao.IDailyTaskDao;
import org.self.management.service.IDailyTaskService;
import org.self.management.vo.DailyTaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyTaskService implements IDailyTaskService {

    @Autowired
    private IDailyTaskDao dailyTaskDao;

    @Override
    public DailyTaskVO selectDailyTaskVOById(String id) {
        return dailyTaskDao.selectDailyTaskVOById(id);
    }

    @Override
    public List<DailyTaskVO> selectDailyTaskVOList(DailyTaskVO dailyTaskVO) {
        return dailyTaskDao.selectDailyTaskVOList(dailyTaskVO);
    }

    @Override
    public int insertDailyTaskVO(DailyTaskVO dailyTaskVO) {
        return dailyTaskDao.insertDailyTaskVO(dailyTaskVO);
    }

    @Override
    public int updateDailyTaskVO(DailyTaskVO dailyTaskVO) {
        return dailyTaskDao.updateDailyTaskVO(dailyTaskVO);
    }

    @Override
    public int deleteDailyTaskVOByIds(String ids) {
        return dailyTaskDao.deleteDailyTaskVOByIds(ids.split(","));
    }

    @Override
    public int deleteDailyTaskVOById(String id) {
        return dailyTaskDao.deleteDailyTaskVOById(id);
    }
}
