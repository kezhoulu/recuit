/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:23:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_code`
-- ----------------------------
DROP TABLE IF EXISTS `t_code`;
CREATE TABLE `t_code` (
  `c_code` varchar(255) NOT NULL COMMENT '代码值',
  `c_pid` varchar(255) NOT NULL COMMENT '附件代码',
  `c_codename` varchar(255) DEFAULT NULL COMMENT '代码名称',
  `n_valid` int(11) DEFAULT NULL COMMENT '是否有效',
  `n_order` int(11) DEFAULT NULL COMMENT '顺序',
  PRIMARY KEY (`c_code`,`c_pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代码表';

-- ----------------------------
-- Records of t_code
-- ----------------------------
INSERT INTO `t_code` VALUES ('0', '0001', '关闭', '1', '1');
INSERT INTO `t_code` VALUES ('1', '0001', '开启', '1', '2');
INSERT INTO `t_code` VALUES ('ADMIN', '0002', '管理员', '1', '1');
INSERT INTO `t_code` VALUES ('COMPANY', '0002', '公司用户', '1', '2');
INSERT INTO `t_code` VALUES ('USER', '0002', '普通用户', '1', '3');
