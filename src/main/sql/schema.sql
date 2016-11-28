--数据库初始化脚本

--创建数据库
create database accounts;

--创建菜品账目表
create table dishes(
	`dish_id` BIGINT not null AUTO_INCREMENT comment '菜品id',
	`dish_name` varchar(120) not null comment '菜品名称',
	`price` float(6,2) not null comment '费用',
	`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	primary key(dish_id),
	key idx_create_time(create_time)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='账目详情表';
