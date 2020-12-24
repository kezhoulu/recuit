/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : recuit

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-24 22:24:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_offer_position`
-- ----------------------------
DROP TABLE IF EXISTS `t_offer_position`;
CREATE TABLE `t_offer_position` (
  `c_id` varchar(32) NOT NULL,
  `c_user_id` varchar(32) DEFAULT NULL COMMENT '用户id，t_user表的主键',
  `c_position_id` varchar(300) DEFAULT NULL COMMENT '职位id,t_position表的主键',
  `d_sqrq` date DEFAULT NULL COMMENT '申请日期',
  `c_username` varchar(255) DEFAULT NULL COMMENT '用户的中文名称',
  `c_sqgw` varchar(255) DEFAULT NULL COMMENT '申请的岗位',
  `c_sqgs` varchar(255) DEFAULT NULL COMMENT '申请的公司',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位申请表';

-- ----------------------------
-- Records of t_offer_position
-- ----------------------------
INSERT INTO `t_offer_position` VALUES ('1035D46687994EFA9A4EE968668EE7A6', 'DC02FC236DF44B7AB6FE98E3712F9721', 'FE65E641ew574CB38797752AD06C8472', '2020-12-23', 'user1中文名', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('1A594C3B63294F798598CBA1622CB3BC', 'DC02FC236DF44B7AB6FE98E3712F9721', '57C7A8E6289rr1E7AFB6B0124160178A', '2020-12-23', 'user1中文名', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('1D3909FB322842C38272E22832F7F89F', 'DC02FC236DF44B7AB6FE98E3712F9721', '7CD8BC44615B439287A4B2F70561FBBA', '2020-12-23', 'user1中文名', 'company2的java开发岗', '74A622E431074173B5A290A901C7BD10');
INSERT INTO `t_offer_position` VALUES ('5966EDBE6B414B69A5DB5295B91A80A0', 'DC02FC236DF44B7AB6FE98E3712F9721', 'FE65E641ew574CB38797752AD06C8472', '2020-12-23', 'user1中文名', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('685DD37D54674A37AF29C4FA14F7A6B6', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167wwwwF4891B14A03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('82DDDC9B9F154561B65E98F3C372C1F7', 'DC02FC236DF44B7AB6FE98E3712F9721', 'FE65E64191574CB38797752AD06C8472', '2020-12-23', 'user1中文名', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('8AEE27D3DE0647768B6BC9FB10E02048', 'DC02FC236DF44B7AB6FE98E3712F9721', '57C7A8E6erD41E7AFB6B0124160178A', '2020-12-23', 'user1中文名', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('8B315BA90A634CD2BE5C9212CCBE6F56', 'DC02FC236DF44B7AB6FE98E3712F9721', '57C7A8E6erD41E7AFB6B0124160178A', '2020-12-23', 'user1中文名', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('8BDD9AFBC9504D2B863F476C458ABD69', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167F68sdf891B14A03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('B011D23B15B94C198F233069A3CF48A9', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167wwwwF4891B14A03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('B51D7E8618CF46A0AE17D761BEAC663E', 'DC02FC236DF44B7AB6FE98E3712F9721', '57C7A8E6289rr1E7AFB6B0124160178A', '2020-12-23', 'user1中文名', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('B5C10E39A543472BA6E2AE4A9AD42395', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167F685F4891B14w03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('CE850F96B5454836B0D741A5A1919FF1', 'DC02FC236DF44B7AB6FE98E3712F9721', 'FE65E64193374CB38797752AD06C8472', '2020-12-23', 'user1中文名', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('DC8DCC7EFCCF4D1DB7CB0F876762CB94', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167F68sdf891B14A03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('E679741D570843388A27BC9D0F6DFBB7', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167wwwwF4891B14A03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
INSERT INTO `t_offer_position` VALUES ('EF84F6F8748B4E16913F872A6B458A95', 'DC02FC236DF44B7AB6FE98E3712F9721', '258A167F685F4891B14w03EB92DC65E7', '2020-12-23', 'user1中文名', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627');
