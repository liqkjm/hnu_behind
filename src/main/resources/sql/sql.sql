CREATE SCHEMA `hnu` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `hnu`.`test` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `msg` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
INSERT INTO `hnu`.`test` (`id`, `name`, `msg`) VALUES ('1', 'Tony', 'he is a shy boy');
