package org.self.management.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 用户,模拟高并发场景创建的实体类
 */
@Data
@NoArgsConstructor
@ToString
public class UserVO extends BaseVO {

    // 姓名
    private String name;

    // 电话
    private String phone;
}
