-- -----------------------------------------------------
-- Create script for the rentor app.
-- -----------------------------------------------------
-- DROP DATABASE `rentor`;

CREATE SCHEMA IF NOT EXISTS `rentor` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `rentor` ;

-- -----------------------------------------------------
-- Create the users for this DB
-- -----------------------------------------------------
-- CREATE USER 'rentor'@'localhost' IDENTIFIED BY 'admin';
-- GRANT ALL PRIVILEGES ON rentor.* TO 'rentor'@'localhost'  WITH GRANT OPTION;

-- mysql> CREATE USER 'rentor'@'%' IDENTIFIED BY 'admin';
-- mysql> GRANT ALL PRIVILEGES ON rentor.* TO 'rentor'@'%' WITH GRANT OPTION;

-- find all users and their DBs
-- select User,Host from mysql.user;


-- -----------------------------------------------------
-- Table `rentor`.`property`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rentor`.`property` ;

CREATE TABLE IF NOT EXISTS `rentor`.`property` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `tenant_name` VARCHAR(255) NULL,
  `rent_start_date` DATETIME NULL,
  `rent_charge` DOUBLE NULL,
  `address` VARCHAR(255) NULL,
  `area_code` VARCHAR(45) NULL,

  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rentor`.`customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `rentor`.`customer` ;

CREATE TABLE IF NOT EXISTS `rentor`.`customer` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


