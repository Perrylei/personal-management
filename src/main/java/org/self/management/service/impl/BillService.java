package org.self.management.service.impl;

import org.self.management.dao.IBillDao;
import org.self.management.service.IBillService;
import org.self.management.vo.BillVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillService implements IBillService {

    @Autowired
    private IBillDao billDao;

    @Override
    public BillVO selectBillVOById(String id) {
        return billDao.selectBillVOById(id);
    }

    @Override
    public List<BillVO> selectBillVOList(BillVO billVO) {
        return billDao.selectBillVOList(billVO);
    }

    @Override
    public int insertBillVO(BillVO billVO) {
        billVO.setCeateTime(new Date());
        return billDao.insertBillVO(billVO);
    }

    @Override
    public int updateBillVO(BillVO billVO) {
        return billDao.updateBillVO(billVO);
    }

    @Override
    public int deleteBillVOByIds(String ids) {
        return billDao.deleteBillVOByIds(ids.split(","));
    }

    @Override
    public int deleteBillVOById(String id) {
        return billDao.deleteBillVOById(id);
    }
}
