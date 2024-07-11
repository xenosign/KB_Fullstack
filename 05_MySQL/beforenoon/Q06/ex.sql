SHOW DATABASES;
USE employees;
SHOW TABLES;
DESCRIBE employees;
DESC employees;
SHOW COLUMNS FROM employees;

SELECT * FROM titles;
SELECT first_name FROM employees;
SELECT first_name, last_name, gender FROM employees;

USE employees;
SELECT first_name AS 이름, gender AS 성별, hire_date '회사 입사일' FROM employees;

use sqldb;
SELECT *
FROM usertbl
WHERE name='김경호';

SELECT *
FROM usertbl
WHERE birthyear >= 1970 AND height >= 182;

SELECT *
FROM usertbl
WHERE height >= 180 AND height <= 183;

SELECT *
FROM usertbl
WHERE addr = '경남' OR addr = '전북';

SELECT *
FROM usertbl
WHERE addr IN ('경남', '전북');

SELECT *
FROM usertbl
WHERE name LIKE '김%';

SELECT name, height
FROM usertbl
WHERE height > (SELECT height FROM usertbl WHERE name = '김경호');

SELECT *
FROM usertbl
ORDER BY mDate ASC;

SELECT *
FROM usertbl
ORDER BY mDate DESC;


SELECT name, height
FROM usertbl
ORDER BY height DESC, name ASC;

SELECT addr FROM usertbl
ORDER BY addr ASC;
SELECT DISTINCT addr FROM usertbl;









