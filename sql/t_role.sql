/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:24:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `c_id` varchar(32) NOT NULL,
  `c_key` varchar(100) DEFAULT NULL COMMENT '角色key',
  `c_describe` varchar(900) DEFAULT NULL COMMENT '角色描述',
  `c_keyname` varchar(300) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('0378CA8D59C244F5846E989B922E6A01', 'USER', '普通用户角色', '普通用户');
INSERT INTO `t_role` VALUES ('63310A8F40454CF38BA4F8E5DD34C819', 'COMPANY', '公司用户角色', '公司用户');
INSERT INTO `t_role` VALUES ('D063EE1E269049149F7C20990C736D72', 'ADMIN', '系统管理员角色', '管理员');
