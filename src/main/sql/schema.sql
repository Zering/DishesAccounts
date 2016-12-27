--数据库初始化脚本

--创建数据库
create database accounts;

--创建菜品账目表
create table dishes(
	`dish_id` BIGINT not null AUTO_INCREMENT comment '菜品id',
	`dish_name` varchar(120) not null comment '菜品名称',
	`price` float(6,2) not null comment '费用',
	`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	primary key(`dish_id`),
	key idx_create_time(`create_time`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='账目详情表';

--创建菜单表
create table menu(
	`menu_id` BIGINT not null AUTO_INCREMENT comment 'id',
	`menu_name` varchar(120) not null comment '菜单名称',
	`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	primary key(`menu_id`),
	key idx_create_time(`create_time`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='菜单表';


--创建用料表
create table material(
	`material_id` BIGINT not null AUTO_INCREMENT comment '用料id',
	`menu_id` BIGINT not null  comment '菜单id',
	`material_name` varchar(120) not null comment '用料名称',
	`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	primary key(`material_id`),
	foreign key(`menu_id`) references menu(`menu_id`),
	key idx_create_time(`create_time`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用料表';

--创建今日计划表
create table today_plan(
	`plan_id` BIGINT not null AUTO_INCREMENT comment '计划id',
	`menu_id` BIGINT not null  comment '菜单id',
	`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	primary key(`plan_id`),
	foreign key(`menu_id`) references menu(`menu_id`),
	key idx_create_time(`create_time`)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='今日计划表';