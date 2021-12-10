package org.self.management.controller;

import org.apache.log4j.Logger;
import org.self.management.service.IBillService;
import org.self.management.vo.BillVO;
import org.self.management.vo.OperationEnum;
import org.self.management.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {

    private static Logger logger = Logger.getLogger(BillController.class);

    @Autowired
    private IBillService billService;

    @RequestMapping(value = "/queryAll", method = RequestMethod.POST)
    @ResponseBody
    public List<BillVO> queryAll(@RequestBody BillVO billVO) {
        return billService.selectBillVOList(billVO);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public OperationEnum insertBillVO(@RequestBody BillVO billVO) {
        OperationEnum result = OperationEnum.SUCCESS;
        try {
            billService.insertBillVO(billVO);
        } catch (Exception e) {
            logger.error(e);
            result =  OperationEnum.ERROR;
        }
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public OperationEnum updateBillVO(BillVO billVO) {
        OperationEnum result = OperationEnum.SUCCESS;
        try {
            billService.updateBillVO(billVO);
        } catch (Exception e) {
            logger.error(e);
            result = OperationEnum.ERROR;
        }
        return result;
    }

    @RequestMapping(value = "/queryById/{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResultVO<BillVO> queryBillById(@PathVariable("id") String id) {
        ResultVO<BillVO> resultVO = null;
        try {
            BillVO billVO = billService.selectBillVOById(id);
            resultVO = new ResultVO<>(OperationEnum.SUCCESS.getCode(), OperationEnum.SUCCESS.getMsg(), billVO);
        } catch (Exception e) {
            logger.error(e);
            resultVO = new ResultVO<>(OperationEnum.ERROR.getCode(), OperationEnum.ERROR.getMsg());
        }
        return resultVO;
    }

    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.POST)
    public OperationEnum deleteVillById(String id) {
        OperationEnum result = OperationEnum.SUCCESS;
        try {
            billService.deleteBillVOById(id);
        } catch (Exception e) {
            logger.error(e);
            result = OperationEnum.ERROR;
        }
        return result;
    }

    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public OperationEnum deleteVillByIds(String ids) {
        OperationEnum result = OperationEnum.SUCCESS;
        try {
            billService.deleteBillVOByIds(ids);
        } catch (Exception e) {
            logger.error(e);
            result = OperationEnum.ERROR;
        }
        return result;
    }
}
