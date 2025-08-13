USE master;

CREATE DATABASE VLSDB;

INSERT INTO users (username, password) VALUES
('rahul', 'rahul@123');

--CREATE TABLE courses (
--    courseId BIGINT IDENTITY(1,1) PRIMARY KEY,
--    courseName NVARCHAR(255) NOT NULL,
--    authorName NVARCHAR(255) NOT NULL,
--    durationInHours INT NOT NULL,
--    availability BIT NOT NULL
--);

--CREATE TABLE users (
--    userId BIGINT IDENTITY(1,1) PRIMARY KEY,
--    username NVARCHAR(100) NOT NULL,
--    password NVARCHAR(100) NOT NULL
--);

CREATE TABLE cart (
    cartId BIGINT IDENTITY(1,1) PRIMARY KEY,
    course_id BIGINT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES courses(courseId) ON DELETE CASCADE
);