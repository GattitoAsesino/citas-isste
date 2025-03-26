-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: issste
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendasmedicas`
--

DROP TABLE IF EXISTS `agendasmedicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendasmedicas` (
  `id` int NOT NULL,
  `id_medico` int NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `id_cita` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`,`id_medico`),
  KEY `agendasmedicas_ibfk_2` (`id_cita`),
  CONSTRAINT `agendasmedicas_ibfk_1` FOREIGN KEY (`id`) REFERENCES `especialistas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `agendasmedicas_ibfk_2` FOREIGN KEY (`id_cita`) REFERENCES `citas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendasmedicas`
--

LOCK TABLES `agendasmedicas` WRITE;
/*!40000 ALTER TABLE `agendasmedicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `agendasmedicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int DEFAULT NULL,
  `id_medico` int NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `id_sucursal` int DEFAULT NULL,
  `disponible` tinyint(1) NOT NULL DEFAULT '1',
  `Consultorio` varchar(30) NOT NULL,
  `Tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`id_medico`),
  KEY `citas_ibfk_3` (`id_sucursal`),
  KEY `citas_ibfk_2_idx` (`id_medico`),
  KEY `citas_ibfk_1` (`id_paciente`),
  CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `especialistas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `citas_ibfk_3` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1110 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
INSERT INTO `citas` VALUES (688,61,11,'2024-06-03','07:00:00',2,0,'1','General'),(689,21,11,'2024-06-03','07:30:00',2,0,'1','General'),(690,29,11,'2024-06-03','08:00:00',2,0,'1','General'),(691,NULL,11,'2024-06-03','08:30:00',2,1,'1','General'),(692,NULL,11,'2024-06-03','09:00:00',2,1,'1','General'),(693,NULL,11,'2024-06-04','07:00:00',2,1,'1','General'),(694,NULL,11,'2024-06-04','07:30:00',2,1,'1','General'),(695,NULL,11,'2024-06-04','08:00:00',2,1,'1','General'),(696,NULL,11,'2024-06-04','08:30:00',2,1,'1','General'),(697,NULL,11,'2024-06-04','09:00:00',2,1,'1','General'),(698,34,11,'2024-06-05','07:00:00',2,0,'1','General'),(699,NULL,11,'2024-06-05','07:30:00',2,1,'1','General'),(700,NULL,11,'2024-06-05','08:00:00',2,1,'1','General'),(701,9,11,'2024-06-05','08:30:00',2,0,'1','General'),(702,NULL,11,'2024-06-05','09:00:00',2,1,'1','General'),(703,NULL,11,'2024-06-06','07:00:00',2,1,'1','General'),(704,NULL,11,'2024-06-06','07:30:00',2,1,'1','General'),(705,NULL,11,'2024-06-06','08:00:00',2,1,'1','General'),(706,NULL,11,'2024-06-06','08:30:00',2,1,'1','General'),(707,16,11,'2024-06-06','09:00:00',2,0,'1','General'),(708,13,11,'2024-06-07','07:00:00',2,0,'1','General'),(709,NULL,11,'2024-06-07','07:30:00',2,1,'1','General'),(710,NULL,11,'2024-06-07','08:00:00',2,1,'1','General'),(711,25,11,'2024-06-07','08:30:00',2,0,'1','General'),(712,NULL,11,'2024-06-07','09:00:00',2,1,'1','General'),(719,NULL,12,'2024-06-03','07:00:00',2,1,'2','General'),(720,NULL,12,'2024-06-03','07:30:00',2,1,'2','General'),(721,NULL,12,'2024-06-03','08:00:00',2,1,'2','General'),(722,NULL,12,'2024-06-03','08:30:00',2,1,'2','General'),(723,NULL,12,'2024-06-03','09:00:00',2,1,'2','General'),(724,NULL,12,'2024-06-04','07:00:00',2,1,'2','General'),(725,NULL,12,'2024-06-04','07:30:00',2,1,'2','General'),(726,NULL,12,'2024-06-04','08:00:00',2,1,'2','General'),(727,NULL,12,'2024-06-04','08:30:00',2,1,'2','General'),(728,NULL,12,'2024-06-04','09:00:00',2,1,'2','General'),(729,NULL,12,'2024-06-05','07:00:00',2,1,'2','General'),(730,NULL,12,'2024-06-05','07:30:00',2,1,'2','General'),(731,NULL,12,'2024-06-05','08:00:00',2,1,'2','General'),(732,NULL,12,'2024-06-05','08:30:00',2,1,'2','General'),(733,NULL,12,'2024-06-05','09:00:00',2,1,'2','General'),(734,NULL,12,'2024-06-06','07:00:00',2,1,'2','General'),(735,NULL,12,'2024-06-06','07:30:00',2,1,'2','General'),(736,NULL,12,'2024-06-06','08:00:00',2,1,'2','General'),(737,NULL,12,'2024-06-06','08:30:00',2,1,'2','General'),(738,NULL,12,'2024-06-06','09:00:00',2,1,'2','General'),(739,NULL,12,'2024-06-07','07:00:00',2,1,'2','General'),(740,NULL,12,'2024-06-07','07:30:00',2,1,'2','General'),(741,NULL,12,'2024-06-07','08:00:00',2,1,'2','General'),(742,NULL,12,'2024-06-07','08:30:00',2,1,'2','General'),(743,NULL,12,'2024-06-07','09:00:00',2,1,'2','General'),(750,NULL,13,'2024-06-03','07:00:00',2,1,'3','General'),(751,NULL,13,'2024-06-03','07:30:00',2,1,'3','General'),(752,NULL,13,'2024-06-03','08:00:00',2,1,'3','General'),(753,NULL,13,'2024-06-03','08:30:00',2,1,'3','General'),(754,NULL,13,'2024-06-03','09:00:00',2,1,'3','General'),(755,NULL,13,'2024-06-04','07:00:00',2,1,'3','General'),(756,NULL,13,'2024-06-04','07:30:00',2,1,'3','General'),(757,NULL,13,'2024-06-04','08:00:00',2,1,'3','General'),(758,NULL,13,'2024-06-04','08:30:00',2,1,'3','General'),(759,NULL,13,'2024-06-04','09:00:00',2,1,'3','General'),(760,NULL,13,'2024-06-05','07:00:00',2,1,'3','General'),(761,NULL,13,'2024-06-05','07:30:00',2,1,'3','General'),(762,NULL,13,'2024-06-05','08:00:00',2,1,'3','General'),(763,NULL,13,'2024-06-05','08:30:00',2,1,'3','General'),(764,NULL,13,'2024-06-05','09:00:00',2,1,'3','General'),(765,NULL,13,'2024-06-06','07:00:00',2,1,'3','General'),(766,NULL,13,'2024-06-06','07:30:00',2,1,'3','General'),(767,NULL,13,'2024-06-06','08:00:00',2,1,'3','General'),(768,NULL,13,'2024-06-06','08:30:00',2,1,'3','General'),(769,NULL,13,'2024-06-06','09:00:00',2,1,'3','General'),(770,NULL,13,'2024-06-07','07:00:00',2,1,'3','General'),(771,NULL,13,'2024-06-07','07:30:00',2,1,'3','General'),(772,40,13,'2024-06-07','08:00:00',2,0,'3','General'),(773,NULL,13,'2024-06-07','08:30:00',2,1,'3','General'),(774,NULL,13,'2024-06-07','09:00:00',2,1,'3','General'),(781,NULL,14,'2024-06-03','07:00:00',2,1,'4','General'),(782,NULL,14,'2024-06-03','07:30:00',2,1,'4','General'),(783,NULL,14,'2024-06-03','08:00:00',2,1,'4','General'),(784,NULL,14,'2024-06-03','08:30:00',2,1,'4','General'),(785,NULL,14,'2024-06-03','09:00:00',2,1,'4','General'),(786,NULL,14,'2024-06-04','07:00:00',2,1,'4','General'),(787,NULL,14,'2024-06-04','07:30:00',2,1,'4','General'),(788,NULL,14,'2024-06-04','08:00:00',2,1,'4','General'),(789,NULL,14,'2024-06-04','08:30:00',2,1,'4','General'),(790,NULL,14,'2024-06-04','09:00:00',2,1,'4','General'),(791,NULL,14,'2024-06-05','07:00:00',2,1,'4','General'),(792,NULL,14,'2024-06-05','07:30:00',2,1,'4','General'),(793,NULL,14,'2024-06-05','08:00:00',2,1,'4','General'),(794,NULL,14,'2024-06-05','08:30:00',2,1,'4','General'),(795,NULL,14,'2024-06-05','09:00:00',2,1,'4','General'),(796,33,14,'2024-06-06','07:00:00',2,0,'4','General'),(797,NULL,14,'2024-06-06','07:30:00',2,1,'4','General'),(798,NULL,14,'2024-06-06','08:00:00',2,1,'4','General'),(799,NULL,14,'2024-06-06','08:30:00',2,1,'4','General'),(800,NULL,14,'2024-06-06','09:00:00',2,1,'4','General'),(801,NULL,14,'2024-06-07','07:00:00',2,1,'4','General'),(802,NULL,14,'2024-06-07','07:30:00',2,1,'4','General'),(803,NULL,14,'2024-06-07','08:00:00',2,1,'4','General'),(804,NULL,14,'2024-06-07','08:30:00',2,1,'4','General'),(805,NULL,14,'2024-06-07','09:00:00',2,1,'4','General'),(812,61,16,'2024-06-03','07:00:00',2,0,'Odontologia 1','Dentista'),(813,NULL,16,'2024-06-03','07:30:00',2,0,'Odontologia 1','Dentista'),(814,40,16,'2024-06-03','08:00:00',2,0,'Odontologia 1','Dentista'),(815,13,16,'2024-06-03','08:30:00',2,0,'Odontologia 1','Dentista'),(816,NULL,16,'2024-06-03','09:00:00',2,1,'Odontologia 1','Dentista'),(817,NULL,16,'2024-06-04','07:00:00',2,1,'Odontologia 1','Dentista'),(818,NULL,16,'2024-06-04','07:30:00',2,1,'Odontologia 1','Dentista'),(819,NULL,16,'2024-06-04','08:00:00',2,1,'Odontologia 1','Dentista'),(820,NULL,16,'2024-06-04','08:30:00',2,1,'Odontologia 1','Dentista'),(821,NULL,16,'2024-06-04','09:00:00',2,1,'Odontologia 1','Dentista'),(822,NULL,16,'2024-06-05','07:00:00',2,1,'Odontologia 1','Dentista'),(823,NULL,16,'2024-06-05','07:30:00',2,1,'Odontologia 1','Dentista'),(824,NULL,16,'2024-06-05','08:00:00',2,1,'Odontologia 1','Dentista'),(825,NULL,16,'2024-06-05','08:30:00',2,1,'Odontologia 1','Dentista'),(826,NULL,16,'2024-06-05','09:00:00',2,1,'Odontologia 1','Dentista'),(827,NULL,16,'2024-06-06','07:00:00',2,1,'Odontologia 1','Dentista'),(828,NULL,16,'2024-06-06','07:30:00',2,1,'Odontologia 1','Dentista'),(829,NULL,16,'2024-06-06','08:00:00',2,1,'Odontologia 1','Dentista'),(830,NULL,16,'2024-06-06','08:30:00',2,1,'Odontologia 1','Dentista'),(831,NULL,16,'2024-06-06','09:00:00',2,1,'Odontologia 1','Dentista'),(832,NULL,16,'2024-06-07','07:00:00',2,1,'Odontologia 1','Dentista'),(833,NULL,16,'2024-06-07','07:30:00',2,1,'Odontologia 1','Dentista'),(834,NULL,16,'2024-06-07','08:00:00',2,1,'Odontologia 1','Dentista'),(835,NULL,16,'2024-06-07','08:30:00',2,1,'Odontologia 1','Dentista'),(836,NULL,16,'2024-06-07','09:00:00',2,1,'Odontologia 1','Dentista'),(843,33,17,'2024-06-03','07:00:00',2,0,'Odontologia 2','Dentista'),(844,NULL,17,'2024-06-03','07:30:00',2,1,'Odontologia 2','Dentista'),(845,NULL,17,'2024-06-03','08:00:00',2,1,'Odontologia 2','Dentista'),(846,NULL,17,'2024-06-03','08:30:00',2,1,'Odontologia 2','Dentista'),(847,NULL,17,'2024-06-03','09:00:00',2,1,'Odontologia 2','Dentista'),(848,61,17,'2024-06-04','07:00:00',2,0,'Odontologia 2','Dentista'),(849,NULL,17,'2024-06-04','07:30:00',2,1,'Odontologia 2','Dentista'),(850,NULL,17,'2024-06-04','08:00:00',2,1,'Odontologia 2','Dentista'),(851,NULL,17,'2024-06-04','08:30:00',2,1,'Odontologia 2','Dentista'),(852,NULL,17,'2024-06-04','09:00:00',2,1,'Odontologia 2','Dentista'),(853,NULL,17,'2024-06-05','07:00:00',2,1,'Odontologia 2','Dentista'),(854,NULL,17,'2024-06-05','07:30:00',2,1,'Odontologia 2','Dentista'),(855,NULL,17,'2024-06-05','08:00:00',2,1,'Odontologia 2','Dentista'),(856,NULL,17,'2024-06-05','08:30:00',2,1,'Odontologia 2','Dentista'),(857,NULL,17,'2024-06-05','09:00:00',2,1,'Odontologia 2','Dentista'),(858,NULL,17,'2024-06-06','07:00:00',2,1,'Odontologia 2','Dentista'),(859,NULL,17,'2024-06-06','07:30:00',2,1,'Odontologia 2','Dentista'),(860,NULL,17,'2024-06-06','08:00:00',2,1,'Odontologia 2','Dentista'),(861,NULL,17,'2024-06-06','08:30:00',2,1,'Odontologia 2','Dentista'),(862,NULL,17,'2024-06-06','09:00:00',2,1,'Odontologia 2','Dentista'),(863,NULL,17,'2024-06-07','07:00:00',2,1,'Odontologia 2','Dentista'),(864,NULL,17,'2024-06-07','07:30:00',2,1,'Odontologia 2','Dentista'),(865,NULL,17,'2024-06-07','08:00:00',2,1,'Odontologia 2','Dentista'),(866,NULL,17,'2024-06-07','08:30:00',2,1,'Odontologia 2','Dentista'),(867,NULL,17,'2024-06-07','09:00:00',2,1,'Odontologia 2','Dentista'),(874,NULL,18,'2024-06-03','07:00:00',2,1,'Odontologia 3','Dentista'),(875,NULL,18,'2024-06-03','07:30:00',2,1,'Odontologia 3','Dentista'),(876,NULL,18,'2024-06-03','08:00:00',2,1,'Odontologia 3','Dentista'),(877,NULL,18,'2024-06-03','08:30:00',2,1,'Odontologia 3','Dentista'),(878,NULL,18,'2024-06-03','09:00:00',2,1,'Odontologia 3','Dentista'),(879,NULL,18,'2024-06-04','07:00:00',2,1,'Odontologia 3','Dentista'),(880,NULL,18,'2024-06-04','07:30:00',2,1,'Odontologia 3','Dentista'),(881,NULL,18,'2024-06-04','08:00:00',2,1,'Odontologia 3','Dentista'),(882,NULL,18,'2024-06-04','08:30:00',2,1,'Odontologia 3','Dentista'),(883,NULL,18,'2024-06-04','09:00:00',2,1,'Odontologia 3','Dentista'),(884,NULL,18,'2024-06-05','07:00:00',2,1,'Odontologia 3','Dentista'),(885,NULL,18,'2024-06-05','07:30:00',2,1,'Odontologia 3','Dentista'),(886,NULL,18,'2024-06-05','08:00:00',2,1,'Odontologia 3','Dentista'),(887,NULL,18,'2024-06-05','08:30:00',2,1,'Odontologia 3','Dentista'),(888,NULL,18,'2024-06-05','09:00:00',2,1,'Odontologia 3','Dentista'),(889,NULL,18,'2024-06-06','07:00:00',2,1,'Odontologia 3','Dentista'),(890,NULL,18,'2024-06-06','07:30:00',2,1,'Odontologia 3','Dentista'),(891,NULL,18,'2024-06-06','08:00:00',2,1,'Odontologia 3','Dentista'),(892,NULL,18,'2024-06-06','08:30:00',2,1,'Odontologia 3','Dentista'),(893,NULL,18,'2024-06-06','09:00:00',2,1,'Odontologia 3','Dentista'),(894,NULL,18,'2024-06-07','07:00:00',2,1,'Odontologia 3','Dentista'),(895,NULL,18,'2024-06-07','07:30:00',2,1,'Odontologia 3','Dentista'),(896,NULL,18,'2024-06-07','08:00:00',2,1,'Odontologia 3','Dentista'),(897,NULL,18,'2024-06-07','08:30:00',2,1,'Odontologia 3','Dentista'),(898,NULL,18,'2024-06-07','09:00:00',2,1,'Odontologia 3','Dentista'),(899,NULL,11,'2024-06-10','07:00:00',2,1,'1','General'),(900,NULL,11,'2024-06-10','07:30:00',2,1,'1','General'),(901,NULL,11,'2024-06-10','08:00:00',2,1,'1','General'),(902,NULL,11,'2024-06-10','08:30:00',2,1,'1','General'),(903,NULL,11,'2024-06-10','09:00:00',2,1,'1','General'),(904,61,11,'2024-06-11','07:00:00',2,0,'1','General'),(905,NULL,11,'2024-06-11','07:30:00',2,1,'1','General'),(906,NULL,11,'2024-06-11','08:00:00',2,1,'1','General'),(907,NULL,11,'2024-06-11','08:30:00',2,1,'1','General'),(908,NULL,11,'2024-06-11','09:00:00',2,1,'1','General'),(909,NULL,11,'2024-06-12','07:00:00',2,1,'1','General'),(910,NULL,11,'2024-06-12','07:30:00',2,1,'1','General'),(911,NULL,11,'2024-06-12','08:00:00',2,1,'1','General'),(912,NULL,11,'2024-06-12','08:30:00',2,1,'1','General'),(913,NULL,11,'2024-06-12','09:00:00',2,1,'1','General'),(914,NULL,11,'2024-06-13','07:00:00',2,1,'1','General'),(915,NULL,11,'2024-06-13','07:30:00',2,1,'1','General'),(916,NULL,11,'2024-06-13','08:00:00',2,1,'1','General'),(917,NULL,11,'2024-06-13','08:30:00',2,1,'1','General'),(918,NULL,11,'2024-06-13','09:00:00',2,1,'1','General'),(919,NULL,11,'2024-06-14','07:00:00',2,1,'1','General'),(920,NULL,11,'2024-06-14','07:30:00',2,1,'1','General'),(921,NULL,11,'2024-06-14','08:00:00',2,1,'1','General'),(922,NULL,11,'2024-06-14','08:30:00',2,1,'1','General'),(923,NULL,11,'2024-06-14','09:00:00',2,1,'1','General'),(930,NULL,12,'2024-06-10','07:00:00',2,1,'2','General'),(931,NULL,12,'2024-06-10','07:30:00',2,1,'2','General'),(932,NULL,12,'2024-06-10','08:00:00',2,1,'2','General'),(933,NULL,12,'2024-06-10','08:30:00',2,1,'2','General'),(934,NULL,12,'2024-06-10','09:00:00',2,1,'2','General'),(935,NULL,12,'2024-06-11','07:00:00',2,1,'2','General'),(936,NULL,12,'2024-06-11','07:30:00',2,1,'2','General'),(937,NULL,12,'2024-06-11','08:00:00',2,1,'2','General'),(938,NULL,12,'2024-06-11','08:30:00',2,1,'2','General'),(939,NULL,12,'2024-06-11','09:00:00',2,1,'2','General'),(940,NULL,12,'2024-06-12','07:00:00',2,1,'2','General'),(941,NULL,12,'2024-06-12','07:30:00',2,1,'2','General'),(942,NULL,12,'2024-06-12','08:00:00',2,1,'2','General'),(943,NULL,12,'2024-06-12','08:30:00',2,1,'2','General'),(944,NULL,12,'2024-06-12','09:00:00',2,1,'2','General'),(945,NULL,12,'2024-06-13','07:00:00',2,1,'2','General'),(946,NULL,12,'2024-06-13','07:30:00',2,1,'2','General'),(947,NULL,12,'2024-06-13','08:00:00',2,1,'2','General'),(948,NULL,12,'2024-06-13','08:30:00',2,1,'2','General'),(949,NULL,12,'2024-06-13','09:00:00',2,1,'2','General'),(950,NULL,12,'2024-06-14','07:00:00',2,1,'2','General'),(951,NULL,12,'2024-06-14','07:30:00',2,1,'2','General'),(952,NULL,12,'2024-06-14','08:00:00',2,1,'2','General'),(953,NULL,12,'2024-06-14','08:30:00',2,1,'2','General'),(954,NULL,12,'2024-06-14','09:00:00',2,1,'2','General'),(961,NULL,13,'2024-06-10','07:00:00',2,1,'3','General'),(962,NULL,13,'2024-06-10','07:30:00',2,1,'3','General'),(963,NULL,13,'2024-06-10','08:00:00',2,1,'3','General'),(964,NULL,13,'2024-06-10','08:30:00',2,1,'3','General'),(965,NULL,13,'2024-06-10','09:00:00',2,1,'3','General'),(966,NULL,13,'2024-06-14','07:00:00',2,1,'3','General'),(967,NULL,13,'2024-06-14','07:30:00',2,1,'3','General'),(968,NULL,13,'2024-06-14','08:00:00',2,1,'3','General'),(969,NULL,13,'2024-06-14','08:30:00',2,1,'3','General'),(970,NULL,13,'2024-06-14','09:00:00',2,1,'3','General'),(971,NULL,13,'2024-06-11','07:00:00',2,1,'3','General'),(972,NULL,13,'2024-06-11','07:30:00',2,1,'3','General'),(973,NULL,13,'2024-06-11','08:00:00',2,1,'3','General'),(974,NULL,13,'2024-06-11','08:30:00',2,1,'3','General'),(975,NULL,13,'2024-06-11','09:00:00',2,1,'3','General'),(976,NULL,13,'2024-06-12','07:00:00',2,1,'3','General'),(977,NULL,13,'2024-06-12','07:30:00',2,1,'3','General'),(978,NULL,13,'2024-06-12','08:00:00',2,1,'3','General'),(979,NULL,13,'2024-06-12','08:30:00',2,1,'3','General'),(980,NULL,13,'2024-06-12','09:00:00',2,1,'3','General'),(981,NULL,13,'2024-06-13','07:00:00',2,1,'3','General'),(982,NULL,13,'2024-06-13','07:30:00',2,1,'3','General'),(983,NULL,13,'2024-06-13','08:00:00',2,1,'3','General'),(984,NULL,13,'2024-06-13','08:30:00',2,1,'3','General'),(985,NULL,13,'2024-06-13','09:00:00',2,1,'3','General'),(992,NULL,14,'2024-06-10','07:00:00',2,1,'4','General'),(993,NULL,14,'2024-06-10','07:30:00',2,1,'4','General'),(994,NULL,14,'2024-06-10','08:00:00',2,1,'4','General'),(995,NULL,14,'2024-06-10','08:30:00',2,1,'4','General'),(996,NULL,14,'2024-06-10','09:00:00',2,1,'4','General'),(997,NULL,14,'2024-06-11','07:00:00',2,1,'4','General'),(998,NULL,14,'2024-06-11','07:30:00',2,1,'4','General'),(999,NULL,14,'2024-06-11','08:00:00',2,1,'4','General'),(1000,NULL,14,'2024-06-11','08:30:00',2,1,'4','General'),(1001,NULL,14,'2024-06-11','09:00:00',2,1,'4','General'),(1002,NULL,14,'2024-06-12','07:00:00',2,1,'4','General'),(1003,NULL,14,'2024-06-12','07:30:00',2,1,'4','General'),(1004,NULL,14,'2024-06-12','08:00:00',2,1,'4','General'),(1005,NULL,14,'2024-06-12','08:30:00',2,1,'4','General'),(1006,NULL,14,'2024-06-12','09:00:00',2,1,'4','General'),(1007,NULL,14,'2024-06-13','07:00:00',2,1,'4','General'),(1008,NULL,14,'2024-06-13','07:30:00',2,1,'4','General'),(1009,NULL,14,'2024-06-13','08:00:00',2,1,'4','General'),(1010,NULL,14,'2024-06-13','08:30:00',2,1,'4','General'),(1011,NULL,14,'2024-06-13','09:00:00',2,1,'4','General'),(1012,NULL,14,'2024-06-14','07:00:00',2,1,'4','General'),(1013,NULL,14,'2024-06-14','07:30:00',2,1,'4','General'),(1014,NULL,14,'2024-06-14','08:00:00',2,1,'4','General'),(1015,NULL,14,'2024-06-14','08:30:00',2,1,'4','General'),(1016,NULL,14,'2024-06-14','09:00:00',2,1,'4','General'),(1023,NULL,16,'2024-06-10','07:00:00',2,1,'Odontologia 1','Dentista'),(1024,NULL,16,'2024-06-10','07:30:00',2,1,'Odontologia 1','Dentista'),(1025,NULL,16,'2024-06-10','08:00:00',2,1,'Odontologia 1','Dentista'),(1026,NULL,16,'2024-06-10','08:30:00',2,1,'Odontologia 1','Dentista'),(1027,NULL,16,'2024-06-10','09:00:00',2,1,'Odontologia 1','Dentista'),(1028,NULL,16,'2024-06-11','07:00:00',2,1,'Odontologia 1','Dentista'),(1029,NULL,16,'2024-06-11','07:30:00',2,1,'Odontologia 1','Dentista'),(1030,NULL,16,'2024-06-11','08:00:00',2,1,'Odontologia 1','Dentista'),(1031,NULL,16,'2024-06-11','08:30:00',2,1,'Odontologia 1','Dentista'),(1032,NULL,16,'2024-06-11','09:00:00',2,1,'Odontologia 1','Dentista'),(1033,NULL,16,'2024-06-12','07:00:00',2,1,'Odontologia 1','Dentista'),(1034,NULL,16,'2024-06-12','07:30:00',2,1,'Odontologia 1','Dentista'),(1035,NULL,16,'2024-06-12','08:00:00',2,1,'Odontologia 1','Dentista'),(1036,NULL,16,'2024-06-12','08:30:00',2,1,'Odontologia 1','Dentista'),(1037,NULL,16,'2024-06-12','09:00:00',2,1,'Odontologia 1','Dentista'),(1038,NULL,16,'2024-06-13','07:00:00',2,1,'Odontologia 1','Dentista'),(1039,NULL,16,'2024-06-13','07:30:00',2,1,'Odontologia 1','Dentista'),(1040,NULL,16,'2024-06-13','08:00:00',2,1,'Odontologia 1','Dentista'),(1041,NULL,16,'2024-06-13','08:30:00',2,1,'Odontologia 1','Dentista'),(1042,NULL,16,'2024-06-13','09:00:00',2,1,'Odontologia 1','Dentista'),(1043,NULL,16,'2024-06-14','07:00:00',2,1,'Odontologia 1','Dentista'),(1044,NULL,16,'2024-06-14','07:30:00',2,1,'Odontologia 1','Dentista'),(1045,NULL,16,'2024-06-14','08:00:00',2,1,'Odontologia 1','Dentista'),(1046,NULL,16,'2024-06-14','08:30:00',2,1,'Odontologia 1','Dentista'),(1047,NULL,16,'2024-06-14','09:00:00',2,1,'Odontologia 1','Dentista'),(1054,NULL,17,'2024-06-10','07:00:00',2,1,'Odontologia 2','Dentista'),(1055,NULL,17,'2024-06-10','07:30:00',2,1,'Odontologia 2','Dentista'),(1056,NULL,17,'2024-06-10','08:00:00',2,1,'Odontologia 2','Dentista'),(1057,NULL,17,'2024-06-10','08:30:00',2,1,'Odontologia 2','Dentista'),(1058,NULL,17,'2024-06-10','09:00:00',2,1,'Odontologia 2','Dentista'),(1059,NULL,17,'2024-06-11','07:00:00',2,1,'Odontologia 2','Dentista'),(1060,NULL,17,'2024-06-11','07:30:00',2,1,'Odontologia 2','Dentista'),(1061,NULL,17,'2024-06-11','08:00:00',2,1,'Odontologia 2','Dentista'),(1062,NULL,17,'2024-06-11','08:30:00',2,1,'Odontologia 2','Dentista'),(1063,NULL,17,'2024-06-11','09:00:00',2,1,'Odontologia 2','Dentista'),(1064,NULL,17,'2024-06-12','07:00:00',2,1,'Odontologia 2','Dentista'),(1065,NULL,17,'2024-06-12','07:30:00',2,1,'Odontologia 2','Dentista'),(1066,NULL,17,'2024-06-12','08:00:00',2,1,'Odontologia 2','Dentista'),(1067,NULL,17,'2024-06-12','08:30:00',2,1,'Odontologia 2','Dentista'),(1068,NULL,17,'2024-06-12','09:00:00',2,1,'Odontologia 2','Dentista'),(1069,NULL,17,'2024-06-13','07:00:00',2,1,'Odontologia 2','Dentista'),(1070,NULL,17,'2024-06-13','07:30:00',2,1,'Odontologia 2','Dentista'),(1071,NULL,17,'2024-06-13','08:00:00',2,1,'Odontologia 2','Dentista'),(1072,NULL,17,'2024-06-13','08:30:00',2,1,'Odontologia 2','Dentista'),(1073,NULL,17,'2024-06-13','09:00:00',2,1,'Odontologia 2','Dentista'),(1074,NULL,17,'2024-06-14','07:00:00',2,1,'Odontologia 2','Dentista'),(1075,NULL,17,'2024-06-14','07:30:00',2,1,'Odontologia 2','Dentista'),(1076,NULL,17,'2024-06-14','08:00:00',2,1,'Odontologia 2','Dentista'),(1077,NULL,17,'2024-06-14','08:30:00',2,1,'Odontologia 2','Dentista'),(1078,NULL,17,'2024-06-14','09:00:00',2,1,'Odontologia 2','Dentista'),(1085,NULL,18,'2024-06-10','07:00:00',2,1,'Odontologia 3','Dentista'),(1086,NULL,18,'2024-06-10','07:30:00',2,1,'Odontologia 3','Dentista'),(1087,NULL,18,'2024-06-10','08:00:00',2,1,'Odontologia 3','Dentista'),(1088,NULL,18,'2024-06-10','08:30:00',2,1,'Odontologia 3','Dentista'),(1089,NULL,18,'2024-06-10','09:00:00',2,1,'Odontologia 3','Dentista'),(1090,NULL,18,'2024-06-11','07:00:00',2,1,'Odontologia 3','Dentista'),(1091,NULL,18,'2024-06-11','07:30:00',2,1,'Odontologia 3','Dentista'),(1092,NULL,18,'2024-06-11','08:00:00',2,1,'Odontologia 3','Dentista'),(1093,NULL,18,'2024-06-11','08:30:00',2,1,'Odontologia 3','Dentista'),(1094,NULL,18,'2024-06-11','09:00:00',2,1,'Odontologia 3','Dentista'),(1095,NULL,18,'2024-06-12','07:00:00',2,1,'Odontologia 3','Dentista'),(1096,NULL,18,'2024-06-12','07:30:00',2,1,'Odontologia 3','Dentista'),(1097,NULL,18,'2024-06-12','08:00:00',2,1,'Odontologia 3','Dentista'),(1098,NULL,18,'2024-06-12','08:30:00',2,1,'Odontologia 3','Dentista'),(1099,NULL,18,'2024-06-12','09:00:00',2,1,'Odontologia 3','Dentista'),(1100,NULL,18,'2024-06-13','07:00:00',2,1,'Odontologia 3','Dentista'),(1101,NULL,18,'2024-06-13','07:30:00',2,1,'Odontologia 3','Dentista'),(1102,NULL,18,'2024-06-13','08:00:00',2,1,'Odontologia 3','Dentista'),(1103,NULL,18,'2024-06-13','08:30:00',2,1,'Odontologia 3','Dentista'),(1104,NULL,18,'2024-06-13','09:00:00',2,1,'Odontologia 3','Dentista'),(1105,NULL,18,'2024-06-14','07:00:00',2,1,'Odontologia 3','Dentista'),(1106,NULL,18,'2024-06-14','07:30:00',2,1,'Odontologia 3','Dentista'),(1107,NULL,18,'2024-06-14','08:00:00',2,1,'Odontologia 3','Dentista'),(1108,NULL,18,'2024-06-14','08:30:00',2,1,'Odontologia 3','Dentista'),(1109,NULL,18,'2024-06-14','09:00:00',2,1,'Odontologia 3','Dentista');
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citas_afiliado`
--

DROP TABLE IF EXISTS `citas_afiliado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citas_afiliado` (
  `id_cita` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `nombre_paciente` varchar(100) NOT NULL,
  `fecha_agendada` date NOT NULL,
  `hora_agendada` time NOT NULL,
  `doctor_asignado` varchar(100) NOT NULL,
  `fecha_cita` date NOT NULL,
  `hora_cita` time NOT NULL,
  `Consultorio` varchar(30) NOT NULL,
  `Tipo` varchar(45) NOT NULL,
  `id_medico` int NOT NULL,
  PRIMARY KEY (`id_cita`,`id_paciente`,`id_medico`),
  KEY `id_Paciente_fk_idx` (`id_paciente`),
  KEY `id_Medico_idx` (`id_medico`),
  CONSTRAINT `id_Cita_fk` FOREIGN KEY (`id_cita`) REFERENCES `citas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_Medico` FOREIGN KEY (`id_medico`) REFERENCES `especialistas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_Paciente_fk` FOREIGN KEY (`id_paciente`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=905 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas_afiliado`
--

LOCK TABLES `citas_afiliado` WRITE;
/*!40000 ALTER TABLE `citas_afiliado` DISABLE KEYS */;
INSERT INTO `citas_afiliado` VALUES (688,61,'1','2024-05-11','15:17:22','Dr. Juan Pérez','2024-06-03','07:00:00','1','General',11),(689,21,'Fernanda','2024-05-11','15:18:20','Dr. Juan Pérez','2024-06-03','07:30:00','1','General',11),(690,29,'Verónica','2024-05-11','15:18:37','Dr. Juan Pérez','2024-06-03','08:00:00','1','General',11),(698,34,'Rosa','2024-05-11','15:23:13','Dr. Juan Pérez','2024-06-05','07:00:00','1','General',11),(701,9,'Fabiola','2025-02-26','04:12:08','Dr. Juan Pérez','2024-06-05','08:30:00','1','General',11),(707,16,'Nancy','2024-05-11','15:23:54','Dr. Juan Pérez','2024-06-06','09:00:00','1','General',11),(708,13,'Ricardo','2024-06-11','12:47:21','Dr. Juan Pérez','2024-06-07','07:00:00','1','General',11),(711,25,'Gabriel','2024-05-11','15:23:36','Dr. Juan Pérez','2024-06-07','08:30:00','1','General',11),(772,40,'Ana','2024-06-04','10:13:40','Dr. José Rodríguez','2024-06-07','08:00:00','3','General',13),(796,33,'José','2024-06-02','22:18:50','Dra. Ana Martínez','2024-06-06','07:00:00','4','General',14),(812,61,'1','2024-05-13','09:14:58','Dr. Roberto Sánchez','2024-06-03','07:00:00','Odontologia 1','Dentista',16),(814,40,'Ana','2024-06-04','10:14:32','Dr. Roberto Sánchez','2024-06-03','08:00:00','Odontologia 1','Dentista',16),(815,13,'Ricardo','2024-06-11','12:47:11','Dr. Roberto Sánchez','2024-06-03','08:30:00','Odontologia 1','Dentista',16),(843,33,'José','2024-06-02','22:19:07','Dra. Andrea López','2024-06-03','07:00:00','Odontologia 2','Dentista',17),(848,61,'1','2024-06-04','09:54:51','Dra. Andrea López','2024-06-04','07:00:00','Odontologia 2','Dentista',17),(904,61,'1','2024-06-04','10:15:08','Dr. Juan Pérez','2024-06-11','07:00:00','1','General',11);
/*!40000 ALTER TABLE `citas_afiliado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialistas`
--

DROP TABLE IF EXISTS `especialistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialistas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `especialidad` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `id_sucursal` int NOT NULL,
  `horario_inicio` time NOT NULL,
  `horario_fin` time NOT NULL,
  `Consultorio` varchar(30) NOT NULL,
  PRIMARY KEY (`id`,`id_sucursal`),
  KEY `especialistas_ibfk_1` (`id_sucursal`),
  CONSTRAINT `especialistas_ibfk_1` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursales` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialistas`
--

LOCK TABLES `especialistas` WRITE;
/*!40000 ALTER TABLE `especialistas` DISABLE KEYS */;
INSERT INTO `especialistas` VALUES (11,'Dr. Juan Pérez','General','juan.perez@example.com','555-1234',2,'07:00:00','14:00:00','1'),(12,'Dra. María García','General','maria.garcia@example.com','555-5678',2,'07:30:00','14:30:00','2'),(13,'Dr. José Rodríguez','General','jose.rodriguez@example.com','555-9012',2,'07:00:00','14:00:00','3'),(14,'Dra. Ana Martínez','General','ana.martinez@example.com','555-3456',2,'12:30:00','19:30:00','4'),(15,'Dr. Carlos López','General','carlos.lopez@example.com','555-7890',2,'12:00:00','19:00:00','5'),(16,'Dr. Roberto Sánchez','Dentista','roberto.sanchez@example.com','555-1234',2,'07:00:00','14:00:00','Odontologia 1'),(17,'Dra. Andrea López','Dentista','andrea.lopez@example.com','555-5678',2,'08:00:00','15:00:00','Odontologia 2'),(18,'Dr. Pedro González','Dentista','pedro.gonzalez@example.com','555-9012',2,'09:00:00','16:00:00','Odontologia 3');
/*!40000 ALTER TABLE `especialistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiosagendados`
--

DROP TABLE IF EXISTS `estudiosagendados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiosagendados` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `fecha` date NOT NULL,
  `id_sucursal` int DEFAULT NULL,
  PRIMARY KEY (`id`,`id_paciente`),
  KEY `estudiosagendados_ibfk_1` (`id_paciente`),
  KEY `estudiosagendados_ibfk_2` (`id_sucursal`),
  CONSTRAINT `estudiosagendados_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `estudiosagendados_ibfk_2` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursales` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiosagendados`
--

LOCK TABLES `estudiosagendados` WRITE;
/*!40000 ALTER TABLE `estudiosagendados` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudiosagendados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudioslaboratorio`
--

DROP TABLE IF EXISTS `estudioslaboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudioslaboratorio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `id_laboratorio` int DEFAULT NULL,
  `fecha_realizacion` date NOT NULL,
  `resultado` text,
  PRIMARY KEY (`id`,`id_paciente`),
  KEY `estudioslaboratorio_ibfk_2` (`id_laboratorio`),
  KEY `estudioslaboratorio_ibfk_1` (`id_paciente`),
  CONSTRAINT `estudioslaboratorio_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `estudioslaboratorio_ibfk_2` FOREIGN KEY (`id_laboratorio`) REFERENCES `laboratorios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudioslaboratorio`
--

LOCK TABLES `estudioslaboratorio` WRITE;
/*!40000 ALTER TABLE `estudioslaboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudioslaboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historialesclinicos`
--

DROP TABLE IF EXISTS `historialesclinicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historialesclinicos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `id_medico` int NOT NULL,
  `fecha_creacion` date NOT NULL,
  PRIMARY KEY (`id`,`id_paciente`,`id_medico`),
  KEY `historialesclinicos_ibfk_2` (`id_medico`),
  KEY `historialesclinicos_ibfk_1` (`id_paciente`),
  CONSTRAINT `historialesclinicos_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `historialesclinicos_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialesclinicos`
--

LOCK TABLES `historialesclinicos` WRITE;
/*!40000 ALTER TABLE `historialesclinicos` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialesclinicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informesmedicos`
--

DROP TABLE IF EXISTS `informesmedicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `informesmedicos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `id_medico` int NOT NULL,
  `fecha` date NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `temperatura` float NOT NULL,
  `alergias` text NOT NULL,
  `Diagnostico` text NOT NULL,
  `tratamiento` text NOT NULL,
  `nombre_paciente` varchar(80) NOT NULL,
  `nombre_medico` varchar(80) NOT NULL,
  `edad` int NOT NULL,
  `motivo` text NOT NULL,
  PRIMARY KEY (`id`,`id_paciente`,`id_medico`),
  KEY `informesmedicos_ibfk_1` (`id_paciente`),
  KEY `informesmedicos_ibfk_2` (`id_medico`),
  CONSTRAINT `informesmedicos_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `informesmedicos_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informesmedicos`
--

LOCK TABLES `informesmedicos` WRITE;
/*!40000 ALTER TABLE `informesmedicos` DISABLE KEYS */;
INSERT INTO `informesmedicos` VALUES (17,16,11,'2024-06-06',1.8,75,36.2,'Ninguna','Dengue	','Paracetamol con betametazona','Nancy Estrada García','Dr. JuanPérezPérez',20,'Dolor de cabeza\nTos\nFiebre	'),(18,61,11,'2024-06-03',1,1,1,'1','1','1','1 1 1','Dr. JuanPérezPérez',1,'1'),(19,21,11,'2024-06-03',1.74,22,76,'ninguna','Gripa','Paracetamol','Fernanda Estrada Arroyo','Dr. JuanPérezPérez',13,'Inflamacion en la garganta'),(24,29,11,'2024-06-03',164,74,36.4,'Ninguna','Dengue	','Parecetamol','Verónica Estrada Alonso','Dr. JuanPérezPérez',33,'Dolor de cuerpo\nFiebre\nTos\nTemperatura	'),(25,61,11,'2024-06-11',146,35,36,'Ninguna	','Dengue','Paracetamol','1 1 1','Dr. JuanPérezPérez',14,'Dolor de la garganta	\nFiebre	');
/*!40000 ALTER TABLE `informesmedicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratorios`
--

DROP TABLE IF EXISTS `laboratorios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laboratorios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `direccion` text NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratorios`
--

LOCK TABLES `laboratorios` WRITE;
/*!40000 ALTER TABLE `laboratorios` DISABLE KEYS */;
/*!40000 ALTER TABLE `laboratorios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamentos`
--

DROP TABLE IF EXISTS `medicamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicamentos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text,
  `indicaciones` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamentos`
--

LOCK TABLES `medicamentos` WRITE;
/*!40000 ALTER TABLE `medicamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opinionesequipomedico`
--

DROP TABLE IF EXISTS `opinionesequipomedico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opinionesequipomedico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_medico` int NOT NULL,
  `opinion` text NOT NULL,
  PRIMARY KEY (`id`,`id_medico`),
  KEY `opinionesequipomedico_ibfk_1` (`id_medico`),
  CONSTRAINT `opinionesequipomedico_ibfk_1` FOREIGN KEY (`id_medico`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opinionesequipomedico`
--

LOCK TABLES `opinionesequipomedico` WRITE;
/*!40000 ALTER TABLE `opinionesequipomedico` DISABLE KEYS */;
INSERT INTO `opinionesequipomedico` VALUES (5,16,'Buen Servicio :3'),(6,11,'Buen trato en general'),(7,17,'Excelente Dentista');
/*!40000 ALTER TABLE `opinionesequipomedico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursales` (
  `id` int NOT NULL AUTO_INCREMENT,
  `entidad` varchar(100) NOT NULL,
  `region` varchar(100) NOT NULL,
  `direccion` text NOT NULL,
  `horario_atencion` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
INSERT INTO `sucursales` VALUES (2,'Oaxaca','Oaxaca','Dirección de la Clínica ISSTE en Oaxaca','07:00:00 - 20:00:00');
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rfc` varchar(15) NOT NULL,
  `curp` varchar(20) NOT NULL,
  `correo` varchar(40) NOT NULL,
  `contraseña` varchar(30) NOT NULL,
  `es_medico` tinyint(1) NOT NULL DEFAULT '0',
  `nombre` varchar(20) NOT NULL,
  `apellido_p` varchar(20) NOT NULL,
  `apellido_m` varchar(20) NOT NULL,
  `Tipo` varchar(45) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`,`rfc`,`curp`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (6,'CIRL031230HO3','CIRL031230HOCRMSA4','CRISTOBALLISANDRO7@GMAIL.COM','prueba123',0,'Lisandro','Cristobal','Ramirez','usuario',NULL),(7,'RAAS730611SZ2','RAAS730611MOCNGM03','sandrita.jll73@gmail.com','S4nDr1t4@JLL',0,'Sandra','Juárez','López','usuario','C:\\Users\\crist\\OneDrive\\Imágenes\\Personas\\mujer1.jpeg'),(8,'CIRL031230CJ4','CIRL031230HOCRMSA4','cristoballisandro7@gmail.com','C1rL0301b4L#',0,'Cristóbal','Hernández','Ramírez','usuario',NULL),(9,'FAAD651123YZ1','FAAD651123POCDYSM2','fabi.alonso85@gmail.com','F4b10l4Al0n$0',0,'Fabiola','Alonso','Díaz','usuario',NULL),(10,'GIHR890326CB3','GIHR890326SBNGBTV2','gusti.barra@gmail.com','Gu$74v0Ib4rr4!',0,'Gustavo','Ibarra','Hernández','usuario',NULL),(11,'KOPL810907RZ4','KOPL810907ROCCRKY2','karla.ortega@gmail.com','K@rL4P3r3z08',0,'Karla','Ortega','Pérez','usuario',NULL),(12,'ZZZZ999999ZX9','ZZZZ999999ZXCZXYX2','zulema.zaragoza@gmail.com','Zul3m4Z4r@t3_',0,'Zulema','Zaragoza','Zárate','usuario','C:\\Users\\crist\\OneDrive\\Imágenes\\Personas\\hombre4.jpeg'),(13,'ROAA731111SA2','ROAA731111MOSRYRV1','ricardo.ortiz@gmail.com','R1c4rd0Alv4r3z',0,'Ricardo','Ortiz','Alvarez','usuario','C:\\Users\\crist\\OneDrive\\Imágenes\\Personas\\hombre4.jpeg'),(14,'GOMC751212RA6','GOMC751212MORAGBC5','gabriela.mendoza@gmail.com','G@br13l4M3nd0z4',0,'Gabriela','Ortega','Mendoza','usuario',NULL),(15,'JOAR910101HI1','JOAR910101HORJNA5','juan.arellano@gmail.com','Ju@nAr3ll@n0',0,'Juan','Ortega','Arellano','usuario',NULL),(16,'NEGC731212AH9','NEGC731212AGHRNNA7','nancy.garcia@gmail.com','N4ncyG4rc14#',0,'Nancy','Estrada','García','usuario',NULL),(17,'JOMG831010HN4','JOMG831010MHZSJJN8','jose.guzman@gmail.com','J0s3M4rt1n3z!',0,'José','Martínez','Guzmán','usuario',NULL),(18,'MILS730101HJ5','MILS730101HLNGLLM6','miguel.luna@gmail.com','M1gu3L1b4rr4#',0,'Miguel','Ibarra','Luna','usuario',NULL),(19,'GOPL860512AH3','GOPL860512OHPGRLA7','gloria.perez@gmail.com','Gl0r14Ort1z@',0,'Gloria','Ortiz','Pérez','usuario',NULL),(20,'PEMC840603CA4','PEMC840603MCRBPDR4','pedro.cabrera@gmail.com','P3dr0M3nd0z@#',0,'Pedro','Mendoza','Cabrera','usuario',NULL),(21,'FEAM731010RA9','FEAM731010HGRRRFR5','fernanda.arroyo@gmail.com','F3rn4nd4Estrad@',0,'Fernanda','Estrada','Arroyo','usuario',NULL),(22,'JORA850101HJ4','JORA850101RMSNRJN1','jorge.santos@gmail.com','J0rg3Ram1r3z#',0,'Jorge','Ramírez','Santos','usuario',NULL),(23,'AIJL720101CJ7','AIJL720101MJSRNN02','ana.jimenez@gmail.com','4n4Ib4rr4Jim3n3z',0,'Ana','Ibarra','Jiménez','usuario',NULL),(24,'LOPM731212RA3','LOPM731212RPLRLRA8','laura.perez@gmail.com','L4ur4Ort3g4#',0,'Laura','Ortega','Pérez','usuario',NULL),(25,'GARA760101MA2','GARA760101RAMLRGL3','gabriel.alonso@gmail.com','G@br13lR4m1r3z',0,'Gabriel','Ramírez','Alonso','usuario',NULL),(26,'JUFR840101HA7','JUFR840101RMRNRJL8','julia.ramirez@gmail.com','Jul14F3rn4nd3z#',0,'Julia','Fernández','Ramírez','usuario',NULL),(27,'MAJM751010RA2','MAJM751010JMRTRMM3','maria.martinez@gmail.com','M4r14Jim3n3z@',0,'María','Jiménez','Martínez','usuario',NULL),(28,'ALHR760101CJ7','ALHR760101HRMRLKN2','alejandro.ramirez@gmail.com','4l3j4ndr0H3rn4nd3z',0,'Alejandro','Hernández','Ramírez','usuario',NULL),(29,'VEAM731212CJ4','VEAM731212ECAVLVR4','veronica.alonso@gmail.com','V3r0n1c4Estr4d@#',0,'Verónica','Estrada','Alonso','usuario',NULL),(30,'ROBA731212MA5','ROBA731212BAAVRBT5','roberto.alvarez@gmail.com','R0b3rt0B4ut1st4@',0,'Roberto','Bautista','Alvarez','usuario',NULL),(31,'MORA840101RJ4','MORA840101RRMRRTM2','maria.ramirez@gmail.com','M4r14Ort1zR4m1r3z',0,'María','Ortiz','Ramírez','usuario',NULL),(32,'ALHR751010RJ7','ALHR751010HRRMRRL7','alma.ramirez@gmail.com','4lm4H3rn4nd3zR4m1r3z',0,'Alma','Hernández','Ramírez','usuario',NULL),(33,'JOAO731212RA6','JOAO731212OARLNSJ5','jose.alonso@gmail.com','J0s3Ort1z4l0ns0#',0,'José','Ortiz','Alonso','usuario',NULL),(34,'ROSI731212RA2','ROSI731212SRRLSDR1','rosa.rodriguez@gmail.com','R05aS1lv4R0dr1gu3z',0,'Rosa','Silva','Rodríguez','usuario',NULL),(35,'MIOR731212RA9','MIOR731212ORRMRMM7','miguel.ramirez@gmail.com','M1gu3l0rt3g4R4m1r3z',0,'Miguel','Ortega','Ramírez','usuario',NULL),(36,'ADCA731212RA5','ADCA731212CRLNRDN6','adriana.alonso@gmail.com','4dr14n4C4br3r4Al0ns0',0,'Adriana','Cabrera','Alonso','usuario',NULL),(37,'JOLO731212RA3','JOLO731212LPRGLPR1','jose.ortega@gmail.com','J0s3L0p3z0rt3g4#',0,'José','López','Ortega','usuario',NULL),(38,'ARAL751010MA6','ARAL751010ARRMRCR9','araceli.ramirez@gmail.com','4r4c3l1Al0ns0R4m1r3z',0,'Araceli','Alonso','Ramírez','usuario',NULL),(39,'ELRA731212RA1','ELRA731212LPRMRDR4','eduardo.ramirez@gmail.com','3du4rd0L0p3zR4m1r3z#',0,'Eduardo','López','Ramírez','usuario',NULL),(40,'ANMU731212RA7','ANMU731212MRMRMNJ3','ana.ramirez@gmail.com','4n4Mun0zR4m1r3z',0,'Ana','Muñoz','Ramírez','usuario',NULL),(41,'VIML751010MA5','VIML751010MNLPLVC9','victor.lopez@gmail.com','V1ct0rM3nd0z4L0p3z',0,'Víctor','Mendoza','López','usuario',NULL),(42,'REMA731212RA4','REMA731212MRLNSRM8','renata.alonso@gmail.com','R3n4t4M4rt1n3zAl0ns0',0,'Renata','Martínez','Alonso','usuario',NULL),(43,'JOSI751010RA1','JOSI751010SRRMRZJ8','jose.ramirez@gmail.com','J0s3S1lv4R4m1r3z#',0,'José','Silva','Ramírez','usuario',NULL),(44,'VEES731212RA6','VEES731212ERRPNVC8','veronica.espinoza@gmail.com','V3r0n1c4Estr4d4Esp1n0z4',0,'Verónica','Estrada','Espinoza','usuario',NULL),(45,'ANPA751010RA7','ANPA751010PRRLNSA7','ana.alonso@gmail.com','4n4P3r3zAl0ns0#',0,'Ana','Pérez','Alonso','usuario',NULL),(46,'JOGU751010RA1','JOGU751010GRRLNSJ6','jorge.ramirez@gmail.com','J0rg3Gu2m4nR4m1r3z',0,'Jorge','Guzmán','Ramírez','usuario',NULL),(47,'VERO731212RA8','VERO731212ORRRMRVC9','veronica.ortiz@gmail.com','V3r0n1c4Ort1zR4m1r3z',0,'Verónica','Ortiz','Ramírez','usuario',NULL),(48,'CRLU751010RA5','CRLU751010LNRRMCS2','carlos.ramirez@gmail.com','C4rl0sLun4R4m1r3z',0,'Carlos','Luna','Ramírez','usuario',NULL),(49,'LUCA751010RA3','LUCA751010CRRRMLU9','luis.alonso@gmail.com','Lu1sC4br3r4Al0ns0',0,'Luis','Cabrera','Alonso','usuario',NULL),(50,'MOAN751010RA8','MOAN751010ARRRMNN3','montserrat.ramirez@gmail.com','M0ns3rr4tAl0ns0R4m1r3z',0,'Montserrat','Alonso','Ramírez','usuario',NULL),(51,'JOPE751010RA2','JOPE751010PRRRMRJ8','jorge.ramirez@gmail.com','J0rg3P3r3zR4m1r3z#',0,'Jorge','Pérez','Ramírez','usuario',NULL),(52,'CEAM751010RA6','CEAM751010ARRMRTS4','cesar.martinez@gmail.com','C3s4rAl0ns0M4rt1n3z',0,'César','Alonso','Martínez','usuario',NULL),(53,'JUFR751010RA5','JUFR751010FRRMRJU7','juana.ramirez@gmail.com','Ju4n4F3rn4nd3zR4m1r3z',0,'Juana','Fernández','Ramírez','usuario',NULL),(54,'VIMA751010RA2','VIMA751010MRRRLVJ2','victor.alonso@gmail.com','V1ct0rM4rt1n3zAl0ns0#',0,'Víctor','Martínez','Alonso','usuario',NULL),(55,'FEMI751010RA9','FEMI751010MRRMRFR2','fernando.ramirez@gmail.com','F3rn4nd0M3nd0z4R4m1r3z',0,'Fernando','Mendoza','Ramírez','usuario',NULL),(56,'FEAL751010RA3','FEAL751010ARRMRFL1','fernanda.ramirez@gmail.com','F3rn4nd4Al0ns0R4m1r3z',0,'Fernanda','Alonso','Ramírez','usuario',NULL),(57,'MAJO751010RA7','MAJO751010ORRJMNL1','manuel.jimenez@gmail.com','M4nu3l0rt3g4J1m3n3z',0,'Manuel','Ortega','Jiménez','usuario',NULL),(58,'MAJU751010RA4','MAJU751010JRRRMMJ8','maria.ramirez@gmail.com','M4r14Ju4r3zR4m1r3z#',0,'María','Juárez','Ramírez','usuario',NULL),(59,'MELS030925DO5','MELS030925MOCDZHA9','sheila@gmail','oktjMS25',0,'Sheil1','Medina','Lazaro','usuario',NULL),(60,'KKIU851212JK1','KKIU851212JKKOIMH6','cristoballisandro8@gmail.com','123456',0,'Lisandro','Cristobal','Ramirez','usuario',NULL),(61,'MMMM333333MJ2','KOPF049543GIIKMDF4','1','1',0,'1','1','1','usuario','C:\\Users\\crist\\OneDrive\\Imágenes\\Personas\\hombre3.jpeg'),(62,'PUAC880805HV5','PUAC880805HVZNRN05','juan.perez@example.com','F4b10l4Al0n$01',1,'Dr. Juan','Pérez','Sánchez','medico_general','C:\\Users\\crist\\OneDrive\\Imágenes\\Personas\\medicoh1.jpeg'),(63,'HOGJ860101MOC7','HOGJ860101MOCNGR07','maria.garcia@example.com','G4c10l4Al0n$02',1,'Dra. María','García','Hernández','medico_general',NULL),(64,'ROGJ891212HDF8','ROGJ891212HDFDMS08','jose.rodriguez@example.com','J4s10l4Al0n$03',1,'Dr. José','Rodríguez','Gómez','medico_general','C:\\Users\\crist\\OneDrive\\Imágenes\\Personas\\medicoH3.jpeg'),(65,'MACG900101MDF9','MACG900101MDFTRS09','ana.martinez@example.com','A4n10l4Al0n$04',1,'Dra. Ana','Martínez','Castillo','medico_general',NULL),(66,'LODC910101MDF1','LODC910101MDFPGD01','carlos.lopez@example.com','C4r10l4Al0n$05',1,'Dr. Carlos','López','Díaz','medico_general',NULL),(67,'SARM880805HR4','SARM880805HDFRBR02','roberto.sanchez@example.com','R0b3rt0S4nch3z$',1,'Dr. Roberto','Sánchez','Martínez','dentista',NULL),(68,'LOAR900101MN1','LOAR900101MDFNDR03','andrea.lopez@example.com','4ndr34L0p3z$',1,'Dra. Andrea','López','Ramírez','dentista',NULL),(69,'GOGP910101HE7','GOGP910101HDFNDR04','pedro.gonzalez@example.com','P3dr0G0nz4l3z$',1,'Dr. Pedro','González','Pérez','dentista',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-10 22:16:47
