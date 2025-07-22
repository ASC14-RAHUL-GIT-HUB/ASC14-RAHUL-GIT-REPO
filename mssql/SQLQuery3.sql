USE myFriendsDb;
GO


CREATE TABLE friendsTst(
	ID INT PRIMARY KEY,
	fullName VARCHAR(100),
	emailAddr VARCHAR(100),
	phoneNumber INT
);
GO

ALTER TABLE friendsTst
ALTER COLUMN phoneNumber BIGINT;
GO

SELECT * FROM friendsTst;