/*
Navicat PGSQL Data Transfer

Source Server         : 172.23.22.235
Source Server Version : 90503
Source Host           : 172.23.22.235:5432
Source Database       : recuit
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90503
File Encoding         : 65001

Date: 2020-12-23 20:44:59
*/


-- ----------------------------
-- Table structure for t_code
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_code";
CREATE TABLE "public"."t_code" (
"c_code" varchar(255) COLLATE "default",
"c_pid" varchar(255) COLLATE "default",
"c_codename" varchar(255) COLLATE "default",
"n_valid" int4,
"n_order" int4
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."t_code"."c_code" IS '单值代码key';

-- ----------------------------
-- Records of t_code
-- ----------------------------
INSERT INTO "public"."t_code" VALUES ('0', '0001', '关闭', '1', '1');
INSERT INTO "public"."t_code" VALUES ('1', '0001', '开启', '1', '2');
INSERT INTO "public"."t_code" VALUES ('ADMIN', '0002', '管理员', '1', '1');
INSERT INTO "public"."t_code" VALUES ('COMPANY', '0002', '公司用户', '1', '2');
INSERT INTO "public"."t_code" VALUES ('USER', '0002', '普通用户', '1', '3');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
