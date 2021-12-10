package org.self.management.service.impl;

import org.self.management.dao.IWageDao;
import org.self.management.service.IWageService;
import org.self.management.vo.WageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WageService implements IWageService {

    @Autowired
    private IWageDao wageDao;

    @Override
    public WageVO selectWageVOById(String id) {
        return wageDao.selectWageVOById(id);
    }

    @Override
    public List<WageVO> selectWageVOList(WageVO wageVO) {
        return wageDao.selectWageVOList(wageVO);
    }

    @Override
    public int insertWageVO(WageVO wageVO) {
        return wageDao.insertWageVO(wageVO);
    }

    @Override
    public int updateWageVO(WageVO wageVO) {
        return wageDao.updateWageVO(wageVO);
    }

    @Override
    public int deleteWageVOByIds(String ids) {
        return wageDao.deleteWageVOByIds(ids.split(","));
    }

    @Override
    public int deleteWageVOById(String id) {
        return wageDao.deleteWageVOById(id);
    }
}
