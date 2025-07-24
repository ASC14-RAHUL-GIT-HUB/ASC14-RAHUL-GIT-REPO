-- Active: 1753159779001@@127.0.0.1@1433@AdventureWorksLT2022
USE AdventureWorksLT2022;

-- Query 1: Select all customers
SELECT * FROM SalesLT.Customer;

-- Query 2: Select all customers ordered by first name
SELECT * FROM SalesLT.Customer
ORDER BY FirstName;

-- Query 3: Select all customers ordered by first name ascending
SELECT * FROM SalesLT.Customer
ORDER BY FirstName ASC;

-- Query 4: Select all customers ordered by first name descending
SELECT * FROM SalesLT.Customer
ORDER BY FirstName DESC;

-- Query 5: Select all customers ordered by the third column
SELECT * FROM SalesLT.Customer
ORDER BY Title;

-- Query 6: Select all customers ordered by the third column descending
SELECT * FROM SalesLT.Customer
ORDER BY Title DESC;

-- Query 7: Select customers with CustomerID less than 6
SELECT * FROM SalesLT.Customer
WHERE CustomerID < 6;

-- Query 8: Select customers with last name 'GUINESS'
SELECT * FROM SalesLT.Customer
WHERE LastName = 'Gee'; --Gee

-- Query 9: Select all customers ordered by first name
SELECT * FROM SalesLT.Customer
ORDER BY FirstName;

-- Query 10: Select all customers ordered by first name ascending and last name descending
SELECT * FROM SalesLT.Customer
ORDER BY FirstName ASC, LastName DESC;

-- Query 11: Select all customers ordered by third column ascending, second column descending
SELECT * FROM SalesLT.Customer
ORDER BY Title ASC, NameStyle DESC;

-- Query 12: Select customers where condition is always false
SELECT * FROM SalesLT.Customer
WHERE 1 = 2;

-- Query 13: Select customers where condition is always true
SELECT * FROM SalesLT.Customer
WHERE 1 = 1;

-- Query 14: Select customers where 1 equals 1 (always true)
SELECT * FROM SalesLT.Customer
WHERE 1 = 1;

-- Query 15: Select customers where 1 equals 2 (always false)
SELECT * FROM SalesLT.Customer
WHERE 1 = 2;

-- Query 16: Count all customers
SELECT COUNT(*) FROM SalesLT.Customer;

-- Query 17: Select specific columns from SalesOrderHeader with aliases
SELECT SalesOrderID AS OrderID, CustomerID AS ClientID FROM SalesLT.SalesOrderHeader;

-- Query 18: Select all sales order headers
SELECT * FROM SalesLT.SalesOrderHeader;

-- Query 19: Select constant values with aliases from SalesOrderHeader
SELECT 1 AS One, 'Two' AS Two, GETDATE() AS Today FROM SalesLT.SalesOrderHeader;

-- Query 20: Select all sales order details
SELECT * FROM SalesLT.SalesOrderDetail;

-- Query 21: Select LineTotal and its rounded value from SalesOrderDetail
SELECT LineTotal, ROUND(LineTotal, 1) AS RoundedLineTotal FROM SalesLT.SalesOrderDetail;

-- Query 22: Select rounded value of 8.45 for each row in SalesOrderDetail
SELECT 8.45 AS OriginalValue, ROUND(8.45, 0) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 23: Select rounded value of 8.5 for each row in SalesOrderDetail
SELECT 8.5 AS OriginalValue, ROUND(8.5, 0) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 24: Select rounded value of -14.33
SELECT -14.33 AS OriginalValue, ROUND(-14.33, 0) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 25: Select rounded value of 1.234 to 0 decimal places
SELECT 1.234 AS OriginalValue, ROUND(1.234, 0) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 26: Select rounded value of -14.73
SELECT -14.73 AS OriginalValue, ROUND(-14.73, 0) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 27: Select rounded value of 1.234 to 1 decimal place
SELECT 1.234 AS OriginalValue, ROUND(1.234, 1) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 28: Select rounded value of 1234.567 to nearest 10
SELECT 1234.567 AS OriginalValue, ROUND(1234.567, -1) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 29: Select rounded value of 1256.567 to nearest 100 with alias
SELECT 1256.567 AS OriginalValue, ROUND(1256.567, -2) AS RoundedValue FROM SalesLT.SalesOrderDetail;

-- Query 30: Select LineTotal from SalesOrderDetail
SELECT LineTotal FROM SalesLT.SalesOrderDetail;

-- Query 31: Select LineTotal rounded to 0 and 1 decimal places from SalesOrderDetail
SELECT ROUND(LineTotal, 0) AS RoundedTo0, ROUND(LineTotal, 1) AS RoundedTo1 FROM SalesLT.SalesOrderDetail;

-- Query 32: Select floor of 1.2
SELECT FLOOR(1.2) AS FloorValue;

-- Query 33: Select ceiling of 1.2
SELECT CEILING(1.2) AS CeilingValue;

-- Query 34: Select floor of -1.2
SELECT FLOOR(-1.2) AS FloorValue;

-- Query 35: Select ceiling of -1.2
SELECT CEILING(-1.2) AS CeilingValue;

-- Query 36: Add 1 and 1, alias as 'ADD'
SELECT 1 + 1 AS [ADD];

-- Query 37: Add string '1' and '1', alias as 'ADD'
SELECT '1' + '1' AS [ADD];

-- Query 38: Add string '1A' and '1', alias as 'ADD'
SELECT '1A' + '1' AS [ADD];

-- Query 39: Add string '1A' and 'B', alias as 'ADD'
SELECT '1A' + 'B' AS [ADD];

-- Query 40: Add string 'A2' and '1', alias as 'ADD'
SELECT 'A2' + '1' AS [ADD];

-- Query 41: Add string 'A2' and '2', alias as 'ADD'
SELECT 'A2' + '2' AS [ADD];

-- Query 42: Add string 'A2' and 'A2', alias as 'ADD'
SELECT 'A2' + 'A2' AS [ADD];

-- Query 43: Concatenate 1 and 1, alias as 'CONCATENATE'
SELECT CONCAT(1, 1) AS [CONCATENATE];

-- Query 44: Concatenate '1' and '1', alias as 'CONCATENATE'
SELECT CONCAT('1', '1') AS [CONCATENATE];

-- Query 45: Concatenate 'A2' and '2', alias as 'CONCATENATE'
SELECT CONCAT('A2', '2') AS [CONCATENATE];

-- Query 46: Concatenate 'RED', ' GREEN', ' BLUE', alias as 'COLORS'
SELECT CONCAT('RED', ' GREEN', ' BLUE') AS [COLORS];

-- Query 47: Select all customers
SELECT * FROM SalesLT.Customer;

-- Query 48: Select CustomerID and concatenated full name
SELECT CustomerID, CONCAT(FirstName, ' ', LastName) AS FullName FROM SalesLT.Customer;

-- Query 49: Select first names in lowercase
SELECT LOWER(FirstName) AS FirstNameLower FROM SalesLT.Customer;

-- Query 50: Select first names in uppercase
SELECT UPPER(FirstName) AS FirstNameUpper FROM SalesLT.Customer;

-- Query 51: Select first two letters of first names
SELECT LEFT(FirstName, 2) AS FirstNameFirstTwo FROM SalesLT.Customer;

-- Query 52: Select first two letters of first names in lowercase
SELECT LOWER(LEFT(FirstName, 2)) AS FirstNameFirstTwoLower FROM SalesLT.Customer;

-- Query 53: Select all customers
SELECT * FROM SalesLT.Customer;

-- Query 54: Concatenate reversed last and first names
SELECT CONCAT(REVERSE(LastName), ' ', REVERSE(FirstName)) AS ReversedFullName FROM SalesLT.Customer;

-- Query 55: Reverse concatenated full name, alias as 'REVERSE FULL NAME'
SELECT REVERSE(CONCAT(FirstName, ' ', LastName)) AS [REVERSE FULL NAME] FROM SalesLT.Customer;

-- Query 56: Concatenate last name and first initial from actor table
SELECT CONCAT(LastName, ', ', LEFT(FirstName, 1), '.') AS LastNameFirstInitial FROM SalesLT.Customer;

-- Query 57: Select reversed first names
SELECT REVERSE(FirstName) AS ReversedFirstName FROM SalesLT.Customer;

-- Query 58: Select ModifiedDate from Customer
SELECT ModifiedDate FROM SalesLT.Customer;

-- Query 59: Format ModifiedDate as mm/dd/yy, alias as 'LAST UPDATE'
SELECT FORMAT(ModifiedDate, 'MM/dd/yy') AS [LAST UPDATE] FROM SalesLT.Customer;

-- Query 60: Format ModifiedDate as mm-dd-yy, alias as 'LAST UPDATE'
SELECT FORMAT(ModifiedDate, 'MM-dd-yy') AS [LAST UPDATE] FROM SalesLT.Customer;

-- Query 61: Select week number from ModifiedDate
SELECT DATEPART(WEEK, ModifiedDate) AS [WEEK NUMBER] FROM SalesLT.Customer;

-- Query 62: Select SalesOrderDetail_DATE from SalesOrderDetail
SELECT ModifiedDate FROM SalesLT.SalesOrderDetail; -- used modified date

-- Query 63: Select all customers
SELECT * FROM SalesLT.Customer;

-- Query 64: Select first names ordered by first name
SELECT FirstName FROM SalesLT.Customer ORDER BY FirstName;

-- Query 65: Select distinct first names ordered by first name
SELECT DISTINCT FirstName FROM SalesLT.Customer ORDER BY FirstName;

-- Query 66: Count all customers
SELECT COUNT(*) FROM SalesLT.Customer;

-- Query 67: Count non-null first names in Customer
SELECT COUNT(FirstName) FROM SalesLT.Customer;

-- Query 68: Count distinct first names in Customer
SELECT COUNT(DISTINCT FirstName) FROM SalesLT.Customer;

-- Query 69: Count customers with first name 'NICK'
SELECT COUNT(*) FROM SalesLT.Customer WHERE FirstName = 'NICK';

-- Query 70: Select customers with first name 'NICK'
SELECT * FROM SalesLT.Customer WHERE FirstName = 'NICK';

-- Query 71: Select customers with CustomerID less than 5
SELECT * FROM SalesLT.Customer WHERE CustomerID < 5;

-- Query 72: Select customers with CustomerID between 1 and 5
SELECT * FROM SalesLT.Customer WHERE CustomerID BETWEEN 1 AND 5;
