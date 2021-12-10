package org.self.management.service;

import org.self.management.vo.WageVO;

import java.util.List;

public interface IWageService {

    /**
     * 查询工资
     *
     * @param id 工资主键
     * @return 工资
     */
    public WageVO selectWageVOById(String id);

    /**
     * 查询工资列表
     *
     * @param WageVO 工资
     * @return 工资集合
     */
    public List<WageVO> selectWageVOList(WageVO WageVO);

    /**
     * 新增工资
     *
     * @param WageVO 工资
     * @return 结果
     */
    public int insertWageVO(WageVO WageVO);

    /**
     * 修改工资
     *
     * @param WageVO 工资
     * @return 结果
     */
    public int updateWageVO(WageVO WageVO);

    /**
     * 批量删除工资
     *
     * @param ids 需要删除的工资主键集合
     * @return 结果
     */
    public int deleteWageVOByIds(String ids);

    /**
     * 删除工资信息
     *
     * @param id 工资主键
     * @return 结果
     */
    public int deleteWageVOById(String id);
}
