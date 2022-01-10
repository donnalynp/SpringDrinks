DROP TABLE IF EXISTS fizzy_drink CASCADE;
CREATE TABLE `fizzy_drink` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `amount` varchar(255) DEFAULT NULL,
  `manufacturer` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
)
