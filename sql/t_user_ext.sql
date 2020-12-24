/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:24:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user_ext`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_ext`;
CREATE TABLE `t_user_ext` (
  `c_id` varchar(32) NOT NULL,
  `c_user_id` varchar(32) DEFAULT NULL COMMENT '用户id',
  `c_byxx` varchar(300) DEFAULT NULL COMMENT '毕业学校',
  `c_gzjl` varchar(300) DEFAULT NULL COMMENT '工作经历',
  `c_csny` varchar(300) DEFAULT NULL COMMENT '出生年月',
  `c_jldz` varchar(300) DEFAULT NULL COMMENT '简历地址',
  `c_ypgw` varchar(300) DEFAULT NULL COMMENT '应聘岗位',
  `c_jlmc` varchar(300) DEFAULT NULL COMMENT '简历名称',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户扩展表';

-- ----------------------------
-- Records of t_user_ext
-- ----------------------------
INSERT INTO `t_user_ext` VALUES ('21D9DADED91340FD96F81458202A6CF8', 'DC02FC236DF44B7AB6FE98E3712F9721', '安徽工业大学', '1、\r\n2、\r\n3、\r\n4、				', '1993.09.07', 'RDpcc3RvcmVGaWxlXHNhY3cuc3Fs', 'java开发工程师', 'sacw.sql');
