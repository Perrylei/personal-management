package org.self.management.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 商品信息，用来模拟高并发测试场景所创建的实体类
 */
@Data
@NoArgsConstructor
@ToString
public class CommodityVO {

    // id
    private long id;

    // 商品名称
    private String name;

    // 价格
    private double price;

    // 库存
    private int  stoke;

    // 备注
    private String remark;

    // 创建时间
    private Date create_time;

    // 更新时间
    private Date update_time;
}
