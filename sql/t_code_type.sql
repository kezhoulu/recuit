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

Date: 2020-12-23 20:45:25
*/


-- ----------------------------
-- Table structure for t_code_type
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_code_type";
CREATE TABLE "public"."t_code_type" (
"c_id" varchar(255) COLLATE "default",
"c_name" varchar(255) COLLATE "default",
"n_valid" varchar(255) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_code_type
-- ----------------------------
INSERT INTO "public"."t_code_type" VALUES ('0001', '状态', '1');
INSERT INTO "public"."t_code_type" VALUES ('0002', '角色', '1');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
