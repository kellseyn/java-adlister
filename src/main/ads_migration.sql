USE adlister_kellsey_db;
DROP TABLE if EXISTS ads;
CREATE TABLE if NOT EXISTS ads(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  FOREIGN KEY (user_id),
  title VARCHAR (99) NOT NULL,
  description VARCHAR (255)

);