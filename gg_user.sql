/*
Navicat MySQL Data Transfer

Source Server         : dennis
Source Server Version : 50553
Source Host           : 192.168.17.28:3306
Source Database       : gadget

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2016-12-02 13:58:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gg_user
-- ----------------------------
DROP TABLE IF EXISTS `gg_user`;
CREATE TABLE `gg_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `starred` tinyint(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `version` bigint(20) DEFAULT NULL,
  `subscribe` char(1) DEFAULT NULL,
  `openid` varchar(50) DEFAULT NULL,
  `nickname` varchar(100) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `language` varchar(50) DEFAULT NULL,
  `headimgurl` varchar(200) DEFAULT NULL,
  `subscribe_time` varchar(50) DEFAULT NULL,
  `unionid` varchar(100) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `groupid` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
