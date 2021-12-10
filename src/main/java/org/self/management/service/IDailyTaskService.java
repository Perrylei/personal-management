package org.self.management.service;

import org.self.management.vo.DailyTaskVO;

import java.util.List;

public interface IDailyTaskService {

    /**
     * 查询每日任务
     *
     * @param id 每日任务主键
     * @return 每日任务
     */
    public DailyTaskVO selectDailyTaskVOById(String id);

    /**
     * 查询每日任务列表
     *
     * @param DailyTaskVO 每日任务
     * @return 每日任务集合
     */
    public List<DailyTaskVO> selectDailyTaskVOList(DailyTaskVO DailyTaskVO);

    /**
     * 新增每日任务
     *
     * @param DailyTaskVO 每日任务
     * @return 结果
     */
    public int insertDailyTaskVO(DailyTaskVO DailyTaskVO);

    /**
     * 修改每日任务
     *
     * @param DailyTaskVO 每日任务
     * @return 结果
     */
    public int updateDailyTaskVO(DailyTaskVO DailyTaskVO);

    /**
     * 批量删除每日任务
     *
     * @param ids 需要删除的每日任务主键集合
     * @return 结果
     */
    public int deleteDailyTaskVOByIds(String ids);

    /**
     * 删除每日任务信息
     *
     * @param id 每日任务主键
     * @return 结果
     */
    public int deleteDailyTaskVOById(String id);
}
