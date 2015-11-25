/*
Navicat MySQL Data Transfer

Source Server         : Local
Source Server Version : 50542
Source Host           : localhost:3306
Source Database       : seguromedico

Target Server Type    : MYSQL
Target Server Version : 50542
File Encoding         : 65001

Date: 2015-11-24 22:34:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seguromedico
-- ----------------------------
DROP TABLE IF EXISTS `seguromedico`;
CREATE TABLE `seguromedico` (
  `idSeguroMedico` int(11) NOT NULL AUTO_INCREMENT,
  `nif` varchar(10) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `ape1` varchar(50) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `casado` tinyint(4) DEFAULT NULL,
  `numhijos` int(11) DEFAULT NULL,
  `embarazada` tinyint(4) DEFAULT NULL,
  `coberturaoftalmologica` tinyint(4) DEFAULT NULL,
  `coberturadental` tinyint(4) DEFAULT NULL,
  `coberturafecundacioninvitro` tinyint(4) DEFAULT NULL,
  `enfermedadcorazon` tinyint(4) DEFAULT NULL,
  `enfermedadestomacal` tinyint(4) DEFAULT NULL,
  `enfermedadrinyones` tinyint(4) DEFAULT NULL,
  `enfermedadalergia` tinyint(4) DEFAULT NULL,
  `nombrealergia` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idSeguroMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seguromedico
-- ----------------------------
INSERT INTO `seguromedico` VALUES ('1', '12345678Z', 'Carlos', 'Cano', '41', 'H', '1', '3', '0', '1', '0', '0', '1', '0', '0', '1', 'Acaros');
INSERT INTO `seguromedico` VALUES ('2', '34783627Z', 'Catalina', 'López', '33', 'M', '1', '1', '1', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `seguromedico` VALUES ('3', '29069345J', 'Jose', 'Aguado', '56', 'H', '1', '2', '0', '1', '1', '0', '1', '1', '1', '0', '');
INSERT INTO `seguromedico` VALUES ('4', '34828938S', 'Angel', 'Navarro', '21', 'H', '0', '0', '0', '1', '1', '0', '0', '0', '0', '1', 'Graminias');
INSERT INTO `seguromedico` VALUES ('5', '23236773B', 'Teresa', 'Rubio', '36', 'M', '0', '0', '1', '0', '0', '1', '0', '0', '0', '0', '');
INSERT INTO `seguromedico` VALUES ('6', '27469252F', 'Alfredo', 'Padilla', '45', 'H', '1', '2', '0', '1', '1', '0', '1', '0', '0', '0', '');
INSERT INTO `seguromedico` VALUES ('7', '34804406R', 'Rosa', 'Muñoz', '45', 'M', '1', '3', '0', '0', '0', '0', '0', '0', '0', '0', '');
INSERT INTO `seguromedico` VALUES ('8', '23244114S', 'Alejandro', 'Valeno', '19', 'H', '0', '0', '0', '1', '0', '0', '0', '0', '0', '1', 'Leche');
