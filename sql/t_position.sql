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

Date: 2020-12-23 20:45:41
*/


-- ----------------------------
-- Table structure for t_position
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_position";
CREATE TABLE "public"."t_position" (
"c_id" varchar(32) COLLATE "default" DEFAULT NULL::character varying NOT NULL,
"c_gzdd" varchar(300) COLLATE "default" DEFAULT NULL::character varying,
"c_gznx" varchar(100) COLLATE "default" DEFAULT NULL::character varying,
"c_zpxq" varchar(3000) COLLATE "default" DEFAULT NULL::character varying,
"c_gwmc" varchar(300) COLLATE "default",
"c_ssgs" varchar(300) COLLATE "default",
"c_zt" varchar(100) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON COLUMN "public"."t_position"."c_gzdd" IS '工作地点';
COMMENT ON COLUMN "public"."t_position"."c_gznx" IS '工作年限';
COMMENT ON COLUMN "public"."t_position"."c_zpxq" IS '招聘详情';
COMMENT ON COLUMN "public"."t_position"."c_gwmc" IS '岗位名称';
COMMENT ON COLUMN "public"."t_position"."c_ssgs" IS '所属公司';
COMMENT ON COLUMN "public"."t_position"."c_zt" IS '状态';

-- ----------------------------
-- Records of t_position
-- ----------------------------
INSERT INTO "public"."t_position" VALUES ('258A167F685F4891B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;
2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;
3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;
4.对财务或物流业务熟悉者优;
5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			
							
							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('258A167F685F4891B14w03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;
2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;
3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;
4.对财务或物流业务熟悉者优;
5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			
							
							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('258A167F685Fdd91B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;
2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;
3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;
4.对财务或物流业务熟悉者优;
5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			
							
							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('258A167F68sdf891B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;
2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;
3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;
4.对财务或物流业务熟悉者优;
5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			
							
							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('258A167wwwwF4891B14A03EB92DC65E7', '上海', '3-5年', '1.2大专及以上学历,3年以上软件开发经验;
2.掌握金蝶BOS的IDE使用与配置,物流行业优先,能力优秀者可谈;
3.熟练掌握主流的数据库及数据库编程语言,例如:Oracle或SqlServer;
4.对财务或物流业务熟悉者优;
5.熟练掌握JAVA/JSP/SERVLET/JAVASCRIPT/XML 等技术;			
							
							', 'company1的java开发岗', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('57C7A8E6289D41ddAFB6B0124160178A', '上海', '3-5年', '12
23
234
434
43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('57C7A8E6289D41E7AFB6B0124160178A', '上海', '3-5年', '12
23
234
434
43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('57C7A8E6289rr1E7AFB6B0124160178A', '上海', '3-5年', '12
23
234
434
43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('57C7A8E628sf41E7AFB6B0124160178A', '上海', '3-5年', '12
23
234
434
43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('57C7A8E6erD41E7AFB6B0124160178A', '上海', '3-5年', '12
23
234
434
43', 'company1的java开发岗1', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('7CD8BC44615B439287A4B2F70561FBBA', '上海', '3-5年', '1
2
3
4
4
4', 'company2的java开发岗', '74A622E431074173B5A290A901C7BD10', '1');
INSERT INTO "public"."t_position" VALUES ('FE65E64191574CB38797752AD06C8472', '上海', '3-5年', '222
23
2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('FE65E64191574CBdd797752AD06C8472', '上海', '3-5年', '222
23
2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('FE65E6419157ddB38797752AD06C8472', '上海', '3-5年', '222
23
2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('FE65E64193374CB38797752AD06C8472', '上海', '3-5年', '222
23
2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');
INSERT INTO "public"."t_position" VALUES ('FE65E641ew574CB38797752AD06C8472', '上海', '3-5年', '222
23
2323333', 'company1的java开发岗2', 'C43BE33FE4884531A97994D31107B627', '1');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_position
-- ----------------------------
ALTER TABLE "public"."t_position" ADD PRIMARY KEY ("c_id");
