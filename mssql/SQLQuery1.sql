CREATE DATABASE myFriendsDb;
GO

USE myFriendsDb;
GO

CREATE TABLE friends(
	user_id INT PRIMARY KEY,
	fname VARCHAR(100),
	last_name VARCHAR(100)
);
GO

INSERT INTO friends(user_id, fname, last_name)
VALUES
(1, 'Shre''yas', 'Shetty'),
(2, 'Chandra Sagar', 'C M');
GO

UPDATE friends
SET fname = 'Shreyas'
WHERE user_id = 1;
GO

Select * from friends;
GO