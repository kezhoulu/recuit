/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:24:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_position`
-- ----------------------------
DROP TABLE IF EXISTS `t_position`;
CREATE TABLE `t_position` (
  `c_id` varchar(32) NOT NULL COMMENT '主键',
  `c_gzdd` varchar(300) DEFAULT NULL COMMENT '工作地点',
  `c_gznx` varchar(100) DEFAULT NULL COMMENT '工作年限',
  `c_zpxq` varchar(3000) DEFAULT NULL COMMENT '招聘详情',
  `c_gwmc` varchar(300) DEFAULT NULL COMMENT '岗位名称',
  `c_ssgs` varchar(300) DEFAULT NULL COMMENT '所属公司',
  `c_zt` varchar(100) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位表';

-- ----------------------------
-- Records of t_position
-- ----------------------------
INSERT INTO `t_position` VALUES ('258A167F685F4891B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;\r\n2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;\r\n3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;\r\n4.对财务或物流业务熟悉者优;\r\n5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			\r\n							\r\n							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('258A167F685F4891B14w03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;\r\n2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;\r\n3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;\r\n4.对财务或物流业务熟悉者优;\r\n5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			\r\n							\r\n							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('258A167F685Fdd91B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;\r\n2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;\r\n3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;\r\n4.对财务或物流业务熟悉者优;\r\n5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			\r\n							\r\n							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('258A167F68sdf891B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;\r\n2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;\r\n3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;\r\n4.对财务或物流业务熟悉者优;\r\n5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			\r\n							\r\n							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('258A167wwwwF4891B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;\r\n2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;\r\n3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;\r\n4.对财务或物流业务熟悉者优;\r\n5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			\r\n							\r\n							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('57C7A8E6289D41ddAFB6B0124160178A', '上海', '3-5年', '12\r\n23\r\n234\r\n434\r\n43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('57C7A8E6289D41E7AFB6B0124160178A', '上海', '3-5年', '12\r\n23\r\n234\r\n434\r\n43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('57C7A8E6289rr1E7AFB6B0124160178A', '上海', '3-5年', '12\r\n23\r\n234\r\n434\r\n43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('57C7A8E628sf41E7AFB6B0124160178A', '上海', '3-5年', '12\r\n23\r\n234\r\n434\r\n43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('57C7A8E6erD41E7AFB6B0124160178A', '上海', '3-5年', '12\r\n23\r\n234\r\n434\r\n43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('7CD8BC44615B439287A4B2F70561FBBA', '上海', '3-5年', '1\r\n2\r\n3\r\n4\r\n4\r\n4', 'company2的java开发岗', '74A622E431074173B5A290A901C7BD10', '1');
INSERT INTO `t_position` VALUES ('FE65E64191574CB38797752AD06C8472', '上海', '3-5年', '222\r\n23\r\n2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('FE65E64191574CBdd797752AD06C8472', '上海', '3-5年', '222\r\n23\r\n2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('FE65E6419157ddB38797752AD06C8472', '上海', '3-5年', '222\r\n23\r\n2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('FE65E64193374CB38797752AD06C8472', '上海', '3-5年', '222\r\n23\r\n2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO `t_position` VALUES ('FE65E641ew574CB38797752AD06C8472', '上海', '3-5年', '222\r\n23\r\n2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
