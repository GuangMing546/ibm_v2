/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : ibm_v2

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 25/11/2020 15:20:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'jiaxiong', '123');

-- ----------------------------
-- Table structure for class_teacher
-- ----------------------------
DROP TABLE IF EXISTS `class_teacher`;
CREATE TABLE `class_teacher`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `class_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chinese_teacher` int(100) NULL DEFAULT NULL,
  `math_teacher` int(100) NULL DEFAULT NULL,
  `english_teacher` int(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `class_id`(`class_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class_teacher
-- ----------------------------
INSERT INTO `class_teacher` VALUES (1, '170801', 0, 15, 35);
INSERT INTO `class_teacher` VALUES (2, '170802', 0, 36, 1);
INSERT INTO `class_teacher` VALUES (3, '170803', 0, 0, 0);
INSERT INTO `class_teacher` VALUES (4, '170804', 0, 33, 31);
INSERT INTO `class_teacher` VALUES (5, '170805', 0, 15, 3);
INSERT INTO `class_teacher` VALUES (6, '170806', 0, 43, 0);
INSERT INTO `class_teacher` VALUES (7, '170807', 2, 0, 37);
INSERT INTO `class_teacher` VALUES (8, '170815', 2, 34, 35);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(100) NOT NULL,
  `student_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_class` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `chinese_score` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `math_score` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `english_score` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE,
  UNIQUE INDEX `student_number`(`student_number`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '3117001234', '张婷婷', '170801', '75', '86', '89', 'qqq', '123456');
INSERT INTO `student` VALUES (2, '3117001235', '杨朝来', '170802', '11', '11', '15', 'aaa', '123456');
INSERT INTO `student` VALUES (3, '3117001236', '马达', '170803', '100', '12', '12', 'bbb', '123456');
INSERT INTO `student` VALUES (4, '3117001237', '刘俊明', '170804', '13', '13', '13', 'ccc', '123456');
INSERT INTO `student` VALUES (5, '3117001238', '赵晓雪', '170805', '15', '100', '15', 'eee', '123456');
INSERT INTO `student` VALUES (6, '3117001239', '马文才', '170806', '16', '80', '16', 'ddd', '123456');
INSERT INTO `student` VALUES (7, '3117001240', '梁山伯', '170807', '11', '100', '89', 'fff', '123456');
INSERT INTO `student` VALUES (8, '3117001241', '祝英台', '170815', '100', '100', '100', 'ggg', '123456');
INSERT INTO `student` VALUES (9, '3117001242', '薛宝钗', '170815', NULL, NULL, '99', 'hhh', '123456');
INSERT INTO `student` VALUES (10, '3117001243', '贾宝玉', '170815', '88', NULL, NULL, 'jjj', '123456');
INSERT INTO `student` VALUES (11, '3117001244', '林黛玉', '170815', NULL, '0', NULL, 'kkk', '123456');
INSERT INTO `student` VALUES (13, '3117001246', '刘庆龙', '170815', '78', NULL, NULL, '123', '1234567');
INSERT INTO `student` VALUES (14, '3117001247', '陈明', '170815', NULL, '67', NULL, '111', '123456');
INSERT INTO `student` VALUES (15, '3117001248', '赖金钱', '170815', NULL, NULL, '89', '112', '123456');
INSERT INTO `student` VALUES (16, '3117001249', '杨朝前', '170815', NULL, '90', NULL, '121', '123456');
INSERT INTO `student` VALUES (17, '3117001250', '陈零钱', '170815', '90', NULL, NULL, '131', '123456');
INSERT INTO `student` VALUES (18, '3117001252', '邱富贵', '170815', NULL, '78', NULL, '321', '123456');
INSERT INTO `student` VALUES (19, '3117001251', '陆逊', '170815', '100', NULL, '99', '331', '123456');
INSERT INTO `student` VALUES (20, '3117001223', '莫言山', '170815', NULL, '22', NULL, '231', '123456');
INSERT INTO `student` VALUES (21, '3117001123', '陈俊球', '170810', NULL, NULL, NULL, 'user', '1008611');
INSERT INTO `student` VALUES (22, '3117001124', '王景亮', '170815', NULL, NULL, '19', 'iii', '123456');
INSERT INTO `student` VALUES (23, '3117001819', '张学友', '170815', NULL, NULL, NULL, 'zxy', 'zzzzzz');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(100) NOT NULL,
  `teacher_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_jod` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '卡卡西', 'english', 'kakaxi', 'kakaxi');
INSERT INTO `teacher` VALUES (2, '宇智波', 'chinese', 'kai', '123456');
INSERT INTO `teacher` VALUES (3, '王宁宁', 'english', 'ning', '111111');
INSERT INTO `teacher` VALUES (4, '大爷', 'math', 'yejiaxio', '......');
INSERT INTO `teacher` VALUES (5, '陈庆', 'english', 'chenq', '______');
INSERT INTO `teacher` VALUES (6, '小陈', 'math', 'xiaochen', '123123');
INSERT INTO `teacher` VALUES (7, '黄老师', 'math', 'ahuang', 'ahuang');
INSERT INTO `teacher` VALUES (8, '赖老师', 'english', 'alai', '111111');
INSERT INTO `teacher` VALUES (9, '梁君', 'math', 'lll', 'llllll');
INSERT INTO `teacher` VALUES (10, '顾老师', 'english', 'gugu', '111111');

SET FOREIGN_KEY_CHECKS = 1;
