package org.self.management.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class DailyTaskVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;

    /** 内容详情 */
    private String content;

    /** 完成时间 */
    private Date makespace;

    /** 是否完成 */
    private Long isEnd;

    /** 备注 */
    private String reamrk;
}
