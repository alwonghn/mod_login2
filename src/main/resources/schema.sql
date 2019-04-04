DROP TABLE IF EXISTS student;

CREATE TABLE student (
  username VARCHAR(45) NOT NULL,
  password VARCHAR(45) NULL,
  name VARCHAR(45) NOT NULL,
  role VARCHAR(45) NULL,
PRIMARY KEY (username));