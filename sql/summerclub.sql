/*
Navicat MySQL Data Transfer

Source Server         : http://47.102.113.146
Source Server Version : 50557
Source Host           : 47.102.113.146:3306
Source Database       : summerclub

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2019-04-27 23:42:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `banner`
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `introduce` varchar(255) DEFAULT NULL,
  `link_url` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banner
-- ----------------------------

-- ----------------------------
-- Table structure for `camp`
-- ----------------------------
DROP TABLE IF EXISTS `camp`;
CREATE TABLE `camp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `camp_file_url` varchar(255) DEFAULT NULL,
  `camp_name` varchar(255) DEFAULT NULL,
  `camp_news_ifo` varchar(255) DEFAULT NULL,
  `camp_news_title` varchar(255) DEFAULT NULL,
  `camp_news_url` varchar(255) DEFAULT NULL,
  `camp_status` varchar(255) DEFAULT NULL,
  `end_time` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of camp
-- ----------------------------

-- ----------------------------
-- Table structure for `entry_item`
-- ----------------------------
DROP TABLE IF EXISTS `entry_item`;
CREATE TABLE `entry_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `camp_head_count` int(11) NOT NULL,
  `camp_id` bigint(20) NOT NULL,
  `given_name` varchar(255) DEFAULT NULL,
  `grades` varchar(255) DEFAULT NULL,
  `grammer_school` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of entry_item
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `given_name` varchar(255) DEFAULT NULL,
  `grammer_school` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
