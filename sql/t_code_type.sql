/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:24:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_code_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_code_type`;
CREATE TABLE `t_code_type` (
  `c_id` varchar(255) NOT NULL COMMENT '主键',
  `c_name` varchar(255) DEFAULT NULL COMMENT '代码类型名称',
  `n_valid` varchar(255) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码类型表';

-- ----------------------------
-- Records of t_code_type
-- ----------------------------
INSERT INTO `t_code_type` VALUES ('0001', '状态', '1');
INSERT INTO `t_code_type` VALUES ('0002', '角色', '1');
