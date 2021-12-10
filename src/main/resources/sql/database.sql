create table wage (
id bigint unsigned PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
release_time datetime NOT NULL COMMENT '时间',
work_day_count int NOT NULL COMMENT '工作天数',
base_wage decimal NOT NULL COMMENT '基础工资',
wages_payable decimal NOT NULL COMMENT '应发工资',
net_wage decimal NOT NULL COMMENT '实际工资',
datail varchar(255) NOT NULL COMMENT '明细',
create_by datetime NOT NULL COMMENT '创建时间',
update_time datetime COMMENT '更新时间',
remark varchar(255) COMMENT '备注'
) COMMENT '工资表';

create table daily_task(
id bigint unsigned PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
content varchar(255) NOT NULL COMMENT '内容详情',
makespace datetime NOT NULL COMMENT '完成时间',
is_end int NOT NULL COMMENT '是否完成',
reamrk varchar(255) COMMENT '备注',
create_time datetime NOT NULL COMMENT '创建时间',
update_time datetime NOT NULL COMMENT '更新时间'
) COMMENT '每日任务表';

CREATE TABLE `bill` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `amount` decimal(10,0) NOT NULL COMMENT '金额',
  `time` datetime NOT NULL COMMENT '时间',
  `mode` varchar(10) NOT NULL COMMENT '方式（wechat,alipay and others）',
  `is_output` int NOT NULL COMMENT '是否为消费',
  `label` varchar(20) DEFAULT NULL COMMENT '标签(food,clohes and so on)',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='账单'