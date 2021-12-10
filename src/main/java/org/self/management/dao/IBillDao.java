package org.self.management.dao;

import org.self.management.vo.BillVO;

import java.util.List;

public interface IBillDao {

    /**
     * 查询账单
     *
     * @param id 账单主键
     * @return 账单
     */
    public BillVO selectBillVOById(String id);

    /**
     * 查询账单列表
     *
     * @param BillVO 账单
     * @return 账单集合
     */
    public List<BillVO> selectBillVOList(BillVO BillVO);

    /**
     * 新增账单
     *
     * @param BillVO 账单
     * @return 结果
     */
    public int insertBillVO(BillVO BillVO);

    /**
     * 修改账单
     *
     * @param BillVO 账单
     * @return 结果
     */
    public int updateBillVO(BillVO BillVO);

    /**
     * 删除账单
     *
     * @param id 账单主键
     * @return 结果
     */
    public int deleteBillVOById(String id);

    /**
     * 批量删除账单
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBillVOByIds(String[] ids);
}
