CREATE TABLE IF NOT EXISTS player (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  team varchar(255) DEFAULT NULL,
  position varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
