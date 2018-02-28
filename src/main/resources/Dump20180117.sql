-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: menu
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course_recipe_choices`
--

DROP TABLE IF EXISTS `course_recipe_choices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course_recipe_choices` (
  `﻿menu_id` text,
  `Level_Type` text,
  `Course_Type` text,
  `recipe_id` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_recipe_choices`
--

LOCK TABLES `course_recipe_choices` WRITE;
/*!40000 ALTER TABLE `course_recipe_choices` DISABLE KEYS */;
INSERT INTO `course_recipe_choices` (`﻿menu_id`, `Level_Type`, `Course_Type`, `recipe_id`) VALUES ('﻿menu_id','Level_Type','Course_Type','recipe_id');
/*!40000 ALTER TABLE `course_recipe_choices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `levels`
--

DROP TABLE IF EXISTS `levels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `levels` (
  `﻿Level_id` int(11) DEFAULT NULL,
  `Menu_id` int(11) DEFAULT NULL,
  `Level_Type` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `levels`
--

LOCK TABLES `levels` WRITE;
/*!40000 ALTER TABLE `levels` DISABLE KEYS */;
INSERT INTO `levels` (`﻿Level_id`, `Menu_id`, `Level_Type`) VALUES (1,1,'Difficult'),(2,0,'Easy'),(3,0,'Intermediate');
/*!40000 ALTER TABLE `levels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measurements`
--

DROP TABLE IF EXISTS `measurements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `measurements` (
  `﻿Measurement_id` int(11) DEFAULT NULL,
  `Amount` text,
  `Measurement_type` text,
  `Measurement_abb` text,
  `Ingredient_id` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurements`
--

LOCK TABLES `measurements` WRITE;
/*!40000 ALTER TABLE `measurements` DISABLE KEYS */;
INSERT INTO `measurements` (`﻿Measurement_id`, `Amount`, `Measurement_type`, `Measurement_abb`, `Ingredient_id`) VALUES (1,'','pack(s)','pk(s).',''),(2,'','package(s)','pkg(s).',''),(3,'','cup(s)','',''),(4,'','liter(s)','l(s).',''),(5,'','teaspoon(s)','tsp(s).',''),(6,'','tablespoon(s)','tbsp(s).',''),(7,'','head(s)','',''),(8,'','pound(s)','lb(s).',''),(9,'','ounce(s)','oz(s).',''),(10,'','large','lg.',''),(11,'','jar(s)','',''),(12,'','ml(s).','milliliter',''),(13,'','sheet(s)','',''),(14,'','medium','med.',''),(15,'','small','sm.',''),(16,'','stick(s)','',''),(17,'','piece(s)','pc(s).',''),(18,'','pint','',''),(19,'','gallon(s)','gal(s).',''),(20,'','quart(s)','qt(s).',''),(21,'','loaf','',''),(22,'','gram(s)','g(s).',''),(23,'','milligram(s)','mg(s).',''),(24,'','bar(s)','',''),(25,'','bottle(s)','',''),(26,'','box(es)','',''),(27,'','can(s)','',''),(28,'','count','ct.',''),(29,'','dozen','doz.',''),(30,'','fluid ounce(s)','fl.oz.',''),(31,'','roll(s)','',''),(32,'','square foot','sq.ft.',''),(33,'','stalk(s)','',''),(34,'','yard(s)','yd(s).','');
/*!40000 ALTER TABLE `measurements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_courses`
--

DROP TABLE IF EXISTS `menu_courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_courses` (
  `﻿Menu_Courses_id` int(11) DEFAULT NULL,
  `Course_Type` text,
  `Recipe_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_courses`
--

LOCK TABLES `menu_courses` WRITE;
/*!40000 ALTER TABLE `menu_courses` DISABLE KEYS */;
INSERT INTO `menu_courses` (`﻿Menu_Courses_id`, `Course_Type`, `Recipe_id`) VALUES (0,'Breakfast',0),(1,'Lunch',0),(2,'Dinner',0),(3,'Brunch',0),(4,'Desert',0),(5,'Hours\'oures',0),(6,'Appetizer',0),(7,'Thanksgiving',0),(8,'Easter',0),(9,'Christmas',0),(10,'4th of July',0),(11,'Super Bowl Party',0),(12,'New Years',0);
/*!40000 ALTER TABLE `menu_courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nutritional_information`
--

DROP TABLE IF EXISTS `nutritional_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nutritional_information` (
  `﻿Nutritional_information_id` int(11) DEFAULT NULL,
  `Receipe_id` int(11) DEFAULT NULL,
  `iNutrition` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nutritional_information`
--

LOCK TABLES `nutritional_information` WRITE;
/*!40000 ALTER TABLE `nutritional_information` DISABLE KEYS */;
INSERT INTO `nutritional_information` (`﻿Nutritional_information_id`, `Receipe_id`, `iNutrition`) VALUES (20,1,'Serving Size'),(21,2,'Calories'),(22,3,'Saturated Fat'),(23,4,'Trans Fat'),(24,0,'Cholestrerol'),(25,0,'Sodium'),(26,0,'Carbohydrate'),(27,0,'Protein'),(28,0,'Protein'),(29,0,'Potassium');
/*!40000 ALTER TABLE `nutritional_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recipes`
--

DROP TABLE IF EXISTS `recipes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recipes` (
  `﻿recipe_id` int(11) DEFAULT NULL,
  `recipe_name` text,
  `recipe_description` text,
  `PrepTime` int(11) DEFAULT NULL,
  `CookTime` int(11) DEFAULT NULL,
  `Nutrional_Information` text,
  `Serving_Size` int(11) DEFAULT NULL,
  `Amount` text,
  `Measurement_id` text,
  `Ingredients_type` text,
  `Level_Type_id` int(11) DEFAULT NULL,
  `Video` text,
  `Picture` text,
  `Instructions` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipes`
--

LOCK TABLES `recipes` WRITE;
/*!40000 ALTER TABLE `recipes` DISABLE KEYS */;
INSERT INTO `recipes` (`﻿recipe_id`, `recipe_name`, `recipe_description`, `PrepTime`, `CookTime`, `Nutrional_Information`, `Serving_Size`, `Amount`, `Measurement_id`, `Ingredients_type`, `Level_Type_id`, `Video`, `Picture`, `Instructions`) VALUES (1,'Collard Green','\"If you like greens you will love this recipe. The bacon and onions give them a wonderful flavor. Add more red pepper for a little more spice',20,60,'127 Calories',6,'','6;18','21;27;28;35;45',2,'','','Heat oil in a large pot over medium-high heat. Add bacon, and cook until crisp. Remove bacon from pan, crumble and return to the pan. Add onion, and cook until tender, about 5 minutes. Add garlic, and cook until just fragrant. Add collard greens, and fry until they start to wilt.\r\n\r\nPour in chicken broth, and season with salt, pepper, and red pepper flakes. Reduce heat to low, cover, and simmer for 45 minutes, or until greens are tender.');
/*!40000 ALTER TABLE `recipes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_ingredient_type_code`
--

DROP TABLE IF EXISTS `ref_ingredient_type_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_ingredient_type_code` (
  `﻿Ingredient_id` int(11) DEFAULT NULL,
  `ingredient_type` text,
  `Receipe_id` int(11) DEFAULT NULL,
  `Ingredient Aisle` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_ingredient_type_code`
--

LOCK TABLES `ref_ingredient_type_code` WRITE;
/*!40000 ALTER TABLE `ref_ingredient_type_code` DISABLE KEYS */;
INSERT INTO `ref_ingredient_type_code` (`﻿Ingredient_id`, `ingredient_type`, `Receipe_id`, `Ingredient Aisle`) VALUES (0,'chicken',0,'meat'),(1,'Cream of Chicken',0,'general'),(10,'beef',0,'dairy'),(11,'cornstarch',0,'general'),(12,'soy sauce',0,'produce'),(13,'beef broth',0,'produce'),(14,'sugar',0,'produce'),(15,'sesame oil',0,'general'),(16,'green onion',0,'baking'),(17,'broccoli',0,'baking'),(18,'rice',0,'meat'),(19,'butter',0,'baking'),(2,'milk',0,'general'),(20,'flour',0,'general'),(21,'chicken broth',0,'baking'),(22,'milk',0,'general'),(23,'Tabasco',0,'produce'),(24,'onion',0,'produce'),(25,'chili powder',0,'general'),(26,'cumin',0,'dairy'),(27,'salt',0,'baking'),(28,'pepper',0,'general'),(29,'cayenne pepper',0,'dairy'),(3,'rice',0,'general'),(30,'canned green chilis',0,'produce'),(31,'chicken breast',0,'baking'),(32,'Monterey Jack cheese',0,'baking'),(33,'white beans',0,'baking'),(34,'balsamic vinegar',0,'baking'),(35,'olive oil',0,'baking'),(36,'salt',0,'general'),(37,'pepper',0,'meat'),(38,'eggplant',0,'dairy'),(39,'zucchini',0,'general'),(4,'mushrooms',0,'general'),(40,'red pepper',0,'baking'),(41,'ciabatta bread',0,'baking'),(42,'mozzarella',0,'baking'),(43,'basil leaves',0,'produce'),(44,'onion',0,'produce'),(45,'garlic',0,'produce'),(46,'olive oil',0,'bakery'),(47,'milk',0,'dairy'),(48,'chick peas',0,'produce'),(49,'taco seasoning',0,'produce'),(5,'tomato',0,'produce'),(50,'curry',0,'baking'),(51,'coconut',0,'dairy'),(52,'tomatoes',0,'general'),(53,'cucumber',0,'baking'),(54,'lemon',0,'baking'),(55,'plain yogurt',0,'general'),(56,'Basmati rice',0,'produce'),(57,'wheat flour',0,'produce'),(58,'flour',0,'produce'),(59,'baking soda',0,'dairy'),(6,'green onion',0,'general'),(60,'baking powder',0,'baking'),(61,'salt',0,'baking'),(62,'butter',0,'baking'),(63,'sugar',0,'baking'),(64,'eggs',0,'baking'),(65,'bananas',0,'dairy'),(66,'milk',0,'baking'),(67,'vanilla',0,'dairy'),(68,'walnut',0,'produce'),(69,'bacon',0,''),(7,'soy sauce',0,'dairy'),(70,'collard greens',0,''),(8,'sugar',0,'baking'),(9,'salt',0,'general');
/*!40000 ALTER TABLE `ref_ingredient_type_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suggested_menus`
--

DROP TABLE IF EXISTS `suggested_menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suggested_menus` (
  `﻿Suggested_Menu_id` text,
  `menu_type_code` text,
  `menu_name` text,
  `menu_description` text,
  `Menu_id` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suggested_menus`
--

LOCK TABLES `suggested_menus` WRITE;
/*!40000 ALTER TABLE `suggested_menus` DISABLE KEYS */;
INSERT INTO `suggested_menus` (`﻿Suggested_Menu_id`, `menu_type_code`, `menu_name`, `menu_description`, `Menu_id`) VALUES ('﻿Suggested_Menu_id','menu_type_code','menu_name','menu_description','Menu_id');
/*!40000 ALTER TABLE `suggested_menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user sign-up`
--

DROP TABLE IF EXISTS `user sign-up`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user sign-up` (
  `﻿Username` text,
  `First Name` text,
  `Last Name` text,
  `Date of Birth` datetime DEFAULT NULL,
  `Email` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user sign-up`
--

LOCK TABLES `user sign-up` WRITE;
/*!40000 ALTER TABLE `user sign-up` DISABLE KEYS */;
/*!40000 ALTER TABLE `user sign-up` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_login` (
  `﻿Login_id` bigint(20) DEFAULT NULL,
  `Password` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-17 12:06:53
