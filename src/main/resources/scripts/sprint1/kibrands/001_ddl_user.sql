CREATE TABLE sales.visits (
    userId INT PRIMARY KEY IDENTITY (1, 1),
    userName VARCHAR (50) NOT NULL,
    email VARCHAR (50) NOT NULL,
    password VARCHAR (50) NOT NULL,
    birth DATETIME
);