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

Date: 2020-12-23 20:45:57
*/


-- ----------------------------
-- Table structure for t_user_ext
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_user_ext";
CREATE TABLE "public"."t_user_ext" (
"c_id" varchar(32) COLLATE "default",
"c_user_id" varchar(32) COLLATE "default",
"c_byxx" varchar(300) COLLATE "default",
"c_gzjl" varchar(300) COLLATE "default",
"c_csny" varchar(300) COLLATE "default",
"c_jldz" varchar(300) COLLATE "default",
"c_ypgw" varchar(300) COLLATE "default",
"c_jlmc" varchar(300) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."t_user_ext"."c_byxx" IS '毕业学校';
COMMENT ON COLUMN "public"."t_user_ext"."c_gzjl" IS '工作经历';
COMMENT ON COLUMN "public"."t_user_ext"."c_csny" IS '出生年月';
COMMENT ON COLUMN "public"."t_user_ext"."c_jldz" IS '简历地址';
COMMENT ON COLUMN "public"."t_user_ext"."c_ypgw" IS '应聘岗位';
COMMENT ON COLUMN "public"."t_user_ext"."c_jlmc" IS '简历名称';

-- ----------------------------
-- Records of t_user_ext
-- ----------------------------
INSERT INTO "public"."t_user_ext" VALUES ('21D9DADED91340FD96F81458202A6CF8', 'DC02FC236DF44B7AB6FE98E3712F9721', '安徽工业大学', '1、
2、
3、
4、				', '1993.09.07', 'RDpcc3RvcmVGaWxlXHNhY3cuc3Fs', 'java开发工程师', 'sacw.sql');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
