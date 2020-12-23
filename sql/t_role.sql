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

Date: 2020-12-23 20:45:49
*/


-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_role";
CREATE TABLE "public"."t_role" (
"c_id" varchar(32) COLLATE "default" NOT NULL,
"c_key" varchar(100) COLLATE "default" DEFAULT NULL::character varying,
"c_describe" varchar(900) COLLATE "default",
"c_keyname" varchar(300) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO "public"."t_role" VALUES ('0378CA8D59C244F5846E989B922E6A01', 'USER', '普通用户角色', '普通用户');
INSERT INTO "public"."t_role" VALUES ('63310A8F40454CF38BA4F8E5DD34C819', 'COMPANY', '公司用户角色', '公司用户');
INSERT INTO "public"."t_role" VALUES ('D063EE1E269049149F7C20990C736D72', 'ADMIN', '系统管理员角色', '管理员');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_role
-- ----------------------------
ALTER TABLE "public"."t_role" ADD PRIMARY KEY ("c_id");
