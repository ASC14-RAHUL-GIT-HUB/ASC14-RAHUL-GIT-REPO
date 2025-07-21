-- Create friend_s table, insert you friends, update friends, search friends, delete friends
-- by id, email or last_name
-- CRUD operations

CREATE TABLE friend_s(
	id INT PRIMARY KEY,
	email VARCHAR(50),
	last_name VARCHAR(50)
);
GO

INSERT INTO friend_s (id, email, last_name)
VALUES
(1, 'remanant.god@gmail.com', 'Shetty'),
(2, 'chandrasagargowda18@gmail.com', 'M C');
GO

UPDATE friend_s
SET last_name = 'C M'
WHERE id = 2;
GO

INSERT INTO friend_s (id, email, last_name)
VALUES
(69, 'harsh@trimmer.com', 'Kulkul');
GO

DELETE FROM friend_s
WHERE id = 69;
GO

SELECT * FROM friend_s
WHERE id > 1
AND email like 'c%';
GO

Select * FROM friend_s;

