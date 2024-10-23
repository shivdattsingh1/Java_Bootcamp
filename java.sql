create database db_joy;
use db_joy;
show tables;
CREATE TABLE Users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), balance DECIMAL(10, 2));
INSERT INTO Users (name, balance) VALUES ('Sumit', 7007.50);
INSERT INTO Users (name, balance) VALUES ('Kushal', 6350.00);
INSERT INTO Users (name, balance) VALUES ('Sameer', 4200.35);

SET SQL_SAFE_UPDATES = 0;

UPDATE Users SET balance = 8500.00 WHERE name = 'Sumit';

DELETE FROM Users WHERE name = 'Sameer';

SELECT * FROM Users;