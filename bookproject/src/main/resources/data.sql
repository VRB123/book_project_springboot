DROP TABLE IF EXISTS books;

CREATE TABLE books(id int PRIMARY KEY,book_title VARCHAR(250) NOT NULL,author VARCHAR(250) NOT NULL,year_published int);

INSERT INTO books(id,book_title,author,year_published) VALUES (1,'DisruptiveThinking','John C Wright',2016);

INSERT INTO books(id,book_title,author,year_published) VALUES(2,'Analytics Of Data','Jerry H Nichols',2018);

INSERT INTO books(id,book_title,author,year_published) VALUES(3,'Data Mining and Queueing Theory','Richard C Williams',2006);

INSERT INTO books(id,book_title,author,year_published) VALUES(4,'Machine Learnhing','Brandon Hook',2019);

INSERT INTO books(id,book_title,author,year_published) VALUES(5,'Data Structures and Algorithm','George C Paul',2017);




