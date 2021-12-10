package org.self.management.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class BillVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 类型 */
    private String id;

    /** 金额 */
    private Long amount;

    /** 时间 */
    private Date time;

    /** 方式（wechat,alipay and others） */
    private String mode;

    /** 是否为消费 */
    private Long isOutput;

    /** 标签(food,clohes and so on) */
    private String label;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 备注 */
    private String remark;
}
