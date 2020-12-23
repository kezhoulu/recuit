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

Date: 2020-12-23 20:46:04
*/


-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_users";
CREATE TABLE "public"."t_users" (
"c_id" varchar(32) COLLATE "default" NOT NULL,
"c_username" varchar(100) COLLATE "default" DEFAULT NULL::character varying,
"c_email" varchar(100) COLLATE "default" DEFAULT NULL::character varying,
"c_password" varchar(300) COLLATE "default" DEFAULT NULL::character varying,
"c_phonenum" varchar(100) COLLATE "default" DEFAULT NULL::character varying,
"c_status" varchar(10) COLLATE "default" DEFAULT NULL::character varying,
"c_right" varchar(300) COLLATE "default",
"c_usernamecn" varchar(300) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."t_users"."c_usernamecn" IS '中文名';

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO "public"."t_users" VALUES ('74A622E431074173B5A290A901C7BD10', 'company2', '1234', '123', '182565201', '1', 'COMPANY', 'company2公司');
INSERT INTO "public"."t_users" VALUES ('8BEBFA5CDB2E4463A85AEAF44A00D604', 'admin', null, '123', null, '1', 'ADMIN', '管理员');
INSERT INTO "public"."t_users" VALUES ('C43BE33FE4884531A97994D31107B627', 'company1', '112', '123', '18255565201', '1', 'COMPANY', 'company1公司');
INSERT INTO "public"."t_users" VALUES ('DC02FC236DF44B7AB6FE98E3712F9721', 'user1', null, '123', null, '1', 'USER', 'user1中文名');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_users
-- ----------------------------
ALTER TABLE "public"."t_users" ADD PRIMARY KEY ("c_id");
