CREATE DATABASE  IF NOT EXISTS `venta_articulos_gas` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `venta_articulos_gas`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: venta_articulos_gas
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `CI` varchar(15) NOT NULL,
  `NOMBRE` varchar(100) DEFAULT NULL,
  `APELLIDO` varchar(100) DEFAULT NULL,
  `CELULAR` varchar(8) DEFAULT NULL,
  `ID_USER` int NOT NULL,
  PRIMARY KEY (`CI`),
  KEY `ID_USER` (`ID_USER`),
  CONSTRAINT `administrador_ibfk_1` FOREIGN KEY (`ID_USER`) REFERENCES `usuario` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `CI` varchar(15) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `APELLIDO` varchar(100) NOT NULL,
  PRIMARY KEY (`CI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('10470402','HECTOR','QUISPE'),('11111','JUAN CARLOS','ALDERETE'),('111112','YONI','SURAYA'),('123456','CAMILA','PEREZ'),('12345678','MARCO','MAMANI QUISPE'),('1591234','Jhovana','Ponce Flores'),('98765432','Yovana','Mallete Mamani'),('987654321','MIRIAN','HUANCA APAZA');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `CI` varchar(15) NOT NULL,
  `NOMBRE` varchar(100) DEFAULT NULL,
  `APELLIDO` varchar(100) DEFAULT NULL,
  `CELULAR` varchar(8) DEFAULT NULL,
  `ID_USER` int NOT NULL,
  PRIMARY KEY (`CI`),
  KEY `ID_USER` (`ID_USER`),
  CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`ID_USER`) REFERENCES `usuario` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES ('11111111','ROXANA ','LUGO FERNANDEZ','67914387',17),('121212','JUAN','PEREZ','65565655',13),('12312312','JHON','PUITA','1234545',8),('321654987','JUAN','PEREZ','1231231',18),('778889977','JUAN','PEREZ','1221122',6),('999999','Adrian','Sacaca','12345678',16);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!50001 DROP VIEW IF EXISTS `empleados`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `empleados` AS SELECT 
 1 AS `CI`,
 1 AS `NOMBRE`,
 1 AS `APELLIDO`,
 1 AS `CELULAR`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `numeracion_venta`
--

DROP TABLE IF EXISTS `numeracion_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `numeracion_venta` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DATO` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `numeracion_venta`
--

LOCK TABLES `numeracion_venta` WRITE;
/*!40000 ALTER TABLE `numeracion_venta` DISABLE KEYS */;
INSERT INTO `numeracion_venta` VALUES (1,'SI'),(2,'SI'),(3,'SI'),(4,'SI'),(5,'SI'),(6,'SI');
/*!40000 ALTER TABLE `numeracion_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `COD_PROD` varchar(200) NOT NULL,
  `DESCRIPCION` varchar(1000) NOT NULL,
  `MARCA` varchar(200) DEFAULT NULL,
  `PRECIO_COMPRA` decimal(8,2) NOT NULL,
  `PRECIO_VENTA` decimal(8,2) NOT NULL,
  `CANTIDAD` decimal(8,2) NOT NULL,
  `PROVEEDOR` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`COD_PROD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('100','ABRAZADORA DE 1 PULGADA','',0.00,45.00,984.00,''),('12122','PALANCA','MESOBOL',20.00,50.10,967.00,''),('12345','TUBO DE GAS','BOLIVIAGAS',0.00,15.50,980.00,''),('200','CODOS DE TANQUE','',15.50,50.10,991.00,''),('300','PALANCA ABRIDORA','',15.50,17.90,11.50,'');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `USUARIO` varchar(50) NOT NULL,
  `CONTRASENA` varchar(50) NOT NULL,
  `TIPO` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'ADMINISTRADOR','123456789',1),(2,'EMPLEADO','123456789',2),(6,'JUAN','123456789',2),(8,'JHON','123456789',2),(13,'JUANCARLOS','123456789',2),(16,'Adrian_user','123456789',2),(17,'ROXANA','123456789',2),(18,'JUANPI','123456789',2);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!50001 DROP VIEW IF EXISTS `usuarios`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `usuarios` AS SELECT 
 1 AS `CI`,
 1 AS `NOMBRE`,
 1 AS `APELLIDO`,
 1 AS `CELULAR`,
 1 AS `TIPO_USUARIO`,
 1 AS `USUARIO`,
 1 AS `CONTRASENA`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `CANTIDAD` decimal(8,2) NOT NULL,
  `FECHA_VENTA` datetime NOT NULL,
  `COD_PROD` varchar(200) DEFAULT NULL,
  `COD_EMP` varchar(15) NOT NULL,
  `COD_CLI` varchar(15) DEFAULT NULL,
  `NUM_VENTA` int NOT NULL,
  `DESCUENTO` decimal(8,2) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `COD_PROD` (`COD_PROD`),
  KEY `COD_EMP` (`COD_EMP`),
  KEY `COD_CLI` (`COD_CLI`),
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`COD_PROD`) REFERENCES `producto` (`COD_PROD`),
  CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`COD_EMP`) REFERENCES `empleado` (`CI`),
  CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`COD_CLI`) REFERENCES `cliente` (`CI`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,10.00,'2022-01-09 00:40:08','12122','12312312','11111',1,0.00),(2,10.00,'2022-01-09 02:38:48','12122','12312312','11111',2,0.00),(3,7.00,'2022-01-09 15:47:03','12122','778889977','123456',3,0.00),(4,7.00,'2022-01-09 15:49:07','12122','778889977','123456',3,0.00),(12,3.00,'2022-01-09 16:27:21','12122','778889977','123456',4,0.00),(13,5.00,'2022-01-10 08:39:48','100','121212','12345678',5,0.00),(14,2.00,'2022-01-10 08:39:48','12345','121212','12345678',5,0.00),(15,5.00,'2022-01-12 00:56:41','100','778889977','1591234',6,0.00),(16,18.00,'2022-01-12 00:56:41','12122','778889977','1591234',6,0.00),(23,3.00,'2022-01-14 10:32:06','12122','778889977','123456',7,8.50),(25,9.00,'2022-01-14 10:34:13','200','778889977','11111',8,1.00),(26,3.50,'2022-01-16 04:09:13','300','321654987','111112',9,0.50),(27,2.00,'2022-01-16 04:09:13','100','321654987','111112',9,10.00);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `ventas_hechas_imprimir_pdf`
--

DROP TABLE IF EXISTS `ventas_hechas_imprimir_pdf`;
/*!50001 DROP VIEW IF EXISTS `ventas_hechas_imprimir_pdf`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ventas_hechas_imprimir_pdf` AS SELECT 
 1 AS `COD_PROD`,
 1 AS `DESCRIPCION`,
 1 AS `PRECIO_VENTA`,
 1 AS `CANTIDAD`,
 1 AS `DESCUENTO`,
 1 AS `TOTAL`,
 1 AS `CI`,
 1 AS `CLIENTE_NOMBRE`,
 1 AS `FECHA`,
 1 AS `NUM_VENTA`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'venta_articulos_gas'
--

--
-- Dumping routines for database 'venta_articulos_gas'
--
/*!50003 DROP PROCEDURE IF EXISTS `CREAR_PRODUCTO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CREAR_PRODUCTO`(
		in COD_PROD varchar(200),
        in DESCRIPCION varchar(1000),
        in MARCA varchar(200),
        in PRECIO_C decimal(8,2),
        in PRECIO_V decimal(8,2),
        in CANTIDAD decimal(8,2),
        in PROVEEDOR varchar(100),
        out dato varchar(10)
    )
begin
        if not exists (select * from producto where producto.COD_PROD = COD_PROD) then
			set dato=1;
            insert into producto
            values
            (
				COD_PROD,
                DESCRIPCION,
                MARCA,
                PRECIO_C,
                PRECIO_V,
                CANTIDAD,
                PROVEEDOR
            );
            
		else
			set dato=0;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `CREAR_VENTA` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CREAR_VENTA`(
		in COD_PROD varchar(100),
        in USUARIO varchar(100),
        in PASS varchar(100),
        in COD_CLI varchar(100),
        in NOM_CLI varchar(100),
		in AP_CLI varchar(100),
        in CANTIDAD decimal(8,2),
        in NUM_VENTA int,
        in descuento decimal(8,2),
        out dato int
    )
begin
		declare CI varchar(100);
        declare can decimal(8,2);
        set CI=(select empleado.CI from usuario,empleado where usuario.ID=empleado.ID_USER and usuario.USUARIO=USUARIO and usuario.CONTRASENA=PASS);
        if exists (select * from empleado where empleado.CI = CI) then
            if exists (select * from cliente where cliente.CI=COD_CLI) then
				if exists (select * from producto where producto.COD_PROD=COD_PROD) then
					insert into VENTA 
                    (
						CANTIDAD,
                        FECHA_VENTA,
                        COD_PROD,
                        COD_EMP,
                        COD_CLI,
                        NUM_VENTA,
                        DESCUENTO
					)
                    values
                    (
						CANTIDAD,
                        now(),
                        COD_PROD,
                        CI,
                        COD_CLI,
                        NUM_VENTA,
                        descuento
                    );
					set can=(select producto.CANTIDAD from producto where producto.COD_PROD=COD_PROD);
                    update producto
                    set
						producto.CANTIDAD=can-CANTIDAD
					where
						producto.COD_PROD=COD_PROD;
                    set dato=1;
                    
                    insert into NUMERACION_VENTA
                    (DATO)
                    values
                    ("SI");
                else
					set dato=0;
                end if;
            else
				if exists (select * from producto where producto.COD_PROD=COD_PROD) then
					insert into cliente
                    values
                    (	
						COD_CLI,
                        NOM_CLI,
                        AP_CLI
                    );
                    insert into VENTA 
                    (
						CANTIDAD,
                        FECHA_VENTA,
                        COD_PROD,
                        COD_EMP,
                        COD_CLI,
                        NUM_VENTA,
                        DESCUENTO
					)
                    values
                    (
						CANTIDAD,
                        now(),
                        COD_PROD,
                        CI,
                        COD_CLI,
                        NUM_VENTA,
                        descuento
                    );
					set can=(select producto.CANTIDAD from producto where producto.COD_PROD=COD_PROD);
                    update producto
                    set
						producto.CANTIDAD=can-CANTIDAD
					where
						producto.COD_PROD=COD_PROD;
                        
					insert into NUMERACION_VENTA
                    (DATO)
                    values
                    ("SI");
                    
                    set dato=1;
                else
					set dato=0;
                end if;
			end if;
		else
			set dato=0;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EDITAR_PRODUCTO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EDITAR_PRODUCTO`(
		in COD_PROD varchar(200),
        in DESCRIPCION varchar(1000),
        in MARCA varchar(200),
        in PRECIO_COMPRA decimal(8,2),
        in PRECIO_VENTA decimal(8,2),
        in CANTIDAD decimal(8,2),
        in PROVEEDOR varchar(100),
        out dato int
    )
begin
        if exists (select * from producto where producto.COD_PROD = COD_PROD) then
			UPDATE producto
            SET
            producto.DESCRIPCION=DESCRIPCION,
            producto.MARCA=MARCA,
            producto.PRECIO_COMPRA = PRECIO_COMPRA,
            producto.PRECIO_VENTA = PRECIO_VENTA,
            producto.PROVEEDOR=PROVEEDOR,
            producto.CANTIDAD=CANTIDAD
            where
            producto.COD_PROD=COD_PROD;
            set dato=1;
		else
			set dato=0;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EDITAR_VENTA` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EDITAR_VENTA`(
		in COD_PROD varchar(100),
        in CANTIDAD decimal(8,2),
        in CI varchar(100),
        in FECHA_VENTA datetime,
        in NUM_VENTA int
    )
begin
		declare can decimal(8,2);
        declare producto decimal(8,2);
        set can=(select VENTA.CANTIDAD from VENTA where VENTA.NUM_VENTA=NUM_VENTA AND VENTA.COD_CLI=CI AND VENTA.COD_PROD=COD_PROD);
        set producto =(select producto.CANTIDAD from producto where producto.COD_PROD=COD_PROD);
        if  can > CANTIDAD then
			update VENTA
            set
            VENTA.CANTIDAD=CANTIDAD
            WHERE
            VENTA.NUM_VENTA=NUM_VENTA AND VENTA.COD_CLI=CI AND VENTA.COD_PROD=COD_PROD;
            
            UPDATE producto
            set
            producto.CANTIDAD=producto+(can-CANTIDAD)
            where producto.COD_PROD=COD_PROD;
        else
			update VENTA
            set
            VENTA.CANTIDAD=CANTIDAD
            WHERE
            VENTA.NUM_VENTA=NUM_VENTA AND VENTA.COD_CLI=CI AND VENTA.COD_PROD=COD_PROD;
            
            UPDATE producto
            set
            producto.CANTIDAD=producto-(CANTIDAD-can)
            where producto.COD_PROD=COD_PROD;
            
        end if;

    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ELIMINAR_PRODUCTO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ELIMINAR_PRODUCTO`(
		in COD_PROD varchar(200),
        out dato int
    )
begin
        if exists (select * from producto where producto.COD_PROD = COD_PROD) then
			DELETE from producto
            where
            producto.COD_PROD=COD_PROD;
            set dato=1;
		else
			set dato=0;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ELIMINAR_REGISTRO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ELIMINAR_REGISTRO`(
		in CI varchar(15),
        out dato int
    )
begin
		declare ultimo_dato int;
        if exists (select * from ADMINISTRADOR where ADMINISTRADOR.CI = CI) then
			set ultimo_dato=(select ID_USER from administrador where administrador.CI=CI);
            delete from administrador where administrador.CI=CI;
            delete from usuario where usuario.ID=ultimo_dato;
            set dato=1;
		else
			if exists (select * from EMPLEADO where EMPLEADO.CI = CI) then
				set ultimo_dato=(select ID_USER from empleado where empleado.CI=CI);
                delete from empleado where empleado.CI=CI;
                delete from usuario where usuario.ID=ultimo_dato;
                set dato=1;
			else
				set dato=0;
			end if;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ELIMINAR_VENTA` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ELIMINAR_VENTA`(
		in COD_PROD varchar(100),
        in CANTIDAD decimal(8,2),
        in CI varchar(100),
        in FECHA_VENTA datetime,
        in NUM_VENTA int
    )
begin
		declare can decimal(8,2);
        
        delete from venta
        where
        venta.FECHA_VENTA=FECHA_VENTA and
        venta.COD_CLI=CI and
        venta.NUM_VENTA =NUM_VENTA and
        venta.CANTIDAD=CANTIDAD;
        
        set can=(select producto.CANTIDAD from producto where producto.COD_PROD=COD_PROD);
        update producto
        set producto.CANTIDAD=can+CANTIDAD
        where
        producto.COD_PROD=COD_PROD;
        
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `LOGEO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `LOGEO`(
		in USU varchar(50),
        in CON varchar(50),
        out dato int
    )
begin
		if exists (select * from USUARIO where USUARIO.USUARIO = USU and USUARIO.CONTRASENA=CON) then
			set dato = (SELECT USUARIO.TIPO FROM USUARIO where USUARIO.USUARIO = USU and USUARIO.CONTRASENA=CON);
        else
			set dato=0;
        end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `REGISTRO` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `REGISTRO`(
		in CI varchar(15),
        in NOMBRE varchar(100),
        in APELLIDO varchar(100),
        in CELULAR varchar(8),
        in USUARIO varchar(50),
        in CONTRA varchar(50),
        in TIPO int,
        out dato int
    )
begin
		declare ultimo_dato int;
        if not exists (select * from USUARIO where USUARIO.usuario=USUARIO) then
			if not exists (select * from ADMINISTRADOR where ADMINISTRADOR.CI = CI) then
				if not exists (select * from EMPLEADO where EMPLEADO.CI = CI) then
					insert into usuario 
					(
						USUARIO,
						CONTRASENA,
						TIPO
					)
					values
					(
						USUARIO,
						CONTRA,
						TIPO
					);
					set ultimo_dato=(select max(ID) from usuario);
					if (TIPO=1) then
						insert into administrador values
						(CI, NOMBRE, APELLIDO, CELULAR, ultimo_dato);
					else
						if(TIPO=2) then
							insert into empleado values
							(CI, NOMBRE, APELLIDO, CELULAR, ultimo_dato);
						end if;
					end if;
					set dato = 3;
				else
					set dato = 2;
				end if;
			else
				set dato=1;
			end if;
		else
			set dato=0;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `REGISTRO_EDITAR` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `REGISTRO_EDITAR`(
		in CI varchar(15),
        in NOMBRE varchar(100),
        in APELLIDO varchar(100),
        in CELULAR varchar(8),
        in USUARIO varchar(50),
        in CONTRA varchar(50),
        in TIPO int,
        out dato int
    )
begin
		declare ultimo_dato int;
        declare usuario_anterior varchar(50);
        if exists (select * from ADMINISTRADOR where ADMINISTRADOR.CI = CI) then
			set ultimo_dato=(select ID_USER from administrador where administrador.CI=CI);
			set usuario_anterior=(select usuario.USUARIO from usuario where usuario.ID=ultimo_dato);
		else
			if exists (select * from EMPLEADO where EMPLEADO.CI = CI) then
				set ultimo_dato=(select ID_USER from empleado where empleado.CI=CI);
				set usuario_anterior=(select usuario.USUARIO from usuario where usuario.ID=ultimo_dato);
			else
				set usuario_anterior='none';
			end if;
		end if;
        
        if exists (select * from USUARIO where USUARIO.usuario=usuario_anterior) then
			if exists (select * from ADMINISTRADOR where ADMINISTRADOR.CI = CI) then
				set ultimo_dato=(select ID_USER from administrador where administrador.CI=CI);
                update usuario
                set
					usuario.USUARIO=USUARIO,
                    usuario.CONTRASENA=CONTRA,
                    usuario.TIPO=TIPO
				where
					usuario.ID=ultimo_dato;
				if (TIPO=2) then
					delete from administrador
					where
						administrador.CI=CI;
					insert into empleado values
							(CI, NOMBRE, APELLIDO, CELULAR, ultimo_dato);
                else
					update administrador
					set
						administrador.NOMBRE=NOMBRE,
						administrador.APELLIDO=APELLIDO,
						administrador.CELULAR=CELULAR
					where
						administrador.CI=CI;
                end if;
				
                set dato=1;
			else
				if exists (select * from EMPLEADO where EMPLEADO.CI = CI) then
					set ultimo_dato=(select ID_USER from empleado where empleado.CI=CI);
					update usuario
					set
						usuario.USUARIO=USUARIO,
						usuario.CONTRASENA=CONTRA,
						usuario.TIPO=TIPO
					where
						usuario.ID=ultimo_dato;
                    if (TIPO=1) then
						delete from empleado
						where empleado.CI=CI;
                        
						insert into administrador values
								(CI, NOMBRE, APELLIDO, CELULAR, ultimo_dato);
					else
						update empleado
						set
							empleado.NOMBRE=NOMBRE,
							empleado.APELLIDO=APELLIDO,
							empleado.CELULAR=CELULAR
						where
							empleado.CI=CI;	
                    end if;
					set dato=1;
				else
					set dato = 0;
				end if;
			end if;
		else
			set dato=0;
		end if;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `empleados`
--

/*!50001 DROP VIEW IF EXISTS `empleados`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `empleados` AS select `empleado`.`CI` AS `CI`,`empleado`.`NOMBRE` AS `NOMBRE`,`empleado`.`APELLIDO` AS `APELLIDO`,`empleado`.`CELULAR` AS `CELULAR` from `empleado` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `usuarios`
--

/*!50001 DROP VIEW IF EXISTS `usuarios`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `usuarios` AS select `administrador`.`CI` AS `CI`,`administrador`.`NOMBRE` AS `NOMBRE`,`administrador`.`APELLIDO` AS `APELLIDO`,`administrador`.`CELULAR` AS `CELULAR`,(case `usuario`.`TIPO` when 1 then 'ADMINISTRADOR' else 'NO EXISTE' end) AS `TIPO_USUARIO`,`usuario`.`USUARIO` AS `USUARIO`,`usuario`.`CONTRASENA` AS `CONTRASENA` from (`usuario` join `administrador`) where (`usuario`.`ID` = `administrador`.`ID_USER`) union select `empleado`.`CI` AS `CI`,`empleado`.`NOMBRE` AS `NOMBRE`,`empleado`.`APELLIDO` AS `APELLIDO`,`empleado`.`CELULAR` AS `CELULAR`,(case `usuario`.`TIPO` when 2 then 'EMPLEADO' else 'NO EXISTE' end) AS `TIPO_USUARIO`,`usuario`.`USUARIO` AS `USUARIO`,`usuario`.`CONTRASENA` AS `CONTRASENA` from (`usuario` join `empleado`) where (`usuario`.`ID` = `empleado`.`ID_USER`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ventas_hechas_imprimir_pdf`
--

/*!50001 DROP VIEW IF EXISTS `ventas_hechas_imprimir_pdf`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ventas_hechas_imprimir_pdf` AS select `producto`.`COD_PROD` AS `COD_PROD`,`producto`.`DESCRIPCION` AS `DESCRIPCION`,`producto`.`PRECIO_VENTA` AS `PRECIO_VENTA`,`venta`.`CANTIDAD` AS `CANTIDAD`,`venta`.`DESCUENTO` AS `DESCUENTO`,((`venta`.`CANTIDAD` * `producto`.`PRECIO_VENTA`) - `venta`.`DESCUENTO`) AS `TOTAL`,`cliente`.`CI` AS `CI`,concat(`cliente`.`NOMBRE`,' ',`cliente`.`APELLIDO`) AS `CLIENTE_NOMBRE`,cast(`venta`.`FECHA_VENTA` as date) AS `FECHA`,`venta`.`NUM_VENTA` AS `NUM_VENTA` from ((`venta` join `cliente`) join `producto`) where ((`venta`.`COD_CLI` = `cliente`.`CI`) and (`venta`.`COD_PROD` = `producto`.`COD_PROD`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-21  7:41:02
