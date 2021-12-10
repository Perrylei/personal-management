package org.self.management.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class WageVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;

    /** 时间 */
    private Date releaseTime;

    /** 工作天数 */
    private Long workDayCount;

    /** 基础工资 */
    private Long baseWage;

    /** 应发工资 */
    private Long wagesPayable;

    /** 实际工资 */
    private Long netWage;

    /** 明细 */
    private String datail;
}
