/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:24:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_users`
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `c_id` varchar(32) NOT NULL,
  `c_username` varchar(100) DEFAULT NULL COMMENT '用户登录名',
  `c_email` varchar(100) DEFAULT NULL COMMENT 'email',
  `c_password` varchar(300) DEFAULT NULL COMMENT '登录密码',
  `c_phonenum` varchar(100) DEFAULT NULL COMMENT '电话号码',
  `c_status` varchar(10) DEFAULT NULL COMMENT '状态',
  `c_right` varchar(300) DEFAULT NULL COMMENT '角色',
  `c_usernamecn` varchar(300) DEFAULT NULL COMMENT '用户中文名',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES ('74A622E431074173B5A290A901C7BD10', 'company2', '1234', '123', '182565201', '1', 'COMPANY', 'company2公司');
INSERT INTO `t_users` VALUES ('8BEBFA5CDB2E4463A85AEAF44A00D604', 'admin', null, '123', null, '1', 'ADMIN', '管理员');
INSERT INTO `t_users` VALUES ('C43BE33FE4884531A97994D31107B627', 'company1', '112', '123', '18255565201', '1', 'COMPANY', 'company1公司');
INSERT INTO `t_users` VALUES ('DC02FC236DF44B7AB6FE98E3712F9721', 'user1', null, '123', null, '1', 'USER', 'user1中文名');
