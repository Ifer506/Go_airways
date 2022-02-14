SHOW DATABASES;
USE c30a1;

CREATE TABLE Admin( AdminID INT AUTO_INCREMENT,
CONSTRAINT a_ID PRIMARY KEY(AdminID),
AdminName VARCHAR(20),
PhoneNo VARCHAR(15),
Email VARCHAR(40));

CREATE TABLE Organizer( OrganizerID INT AUTO_INCREMENT, 
CONSTRAINT o_id PRIMARY KEY(OrganizerID),
OrganizerName VARCHAR(20),
PhoneNo VARCHAR(15),
EMail VARCHAR(40),
OrganizerType VARCHAR(10));

CREATE TABLE Admin_Organizer( AdminID INT,
FOREIGN KEY(AdminID) REFERENCES Admin(AdminID),
OrganizerID INT,
FOREIGN KEY(OrganizerID) REFERENCES Organizer(OrganizerID));

CREATE TABLE seminar( seminar_id INT AUTO_INCREMENT,
CONSTRAINT s_id  PRIMARY KEY(seminar_id),
organizerID INT,
FOREIGN KEY (organizerID) REFERENCES Organizer(organizerID),
title VARCHAR(20),
location VARCHAR(20),
date DATE);

CREATE TABLE Token( TokenID INT,
CONSTRAINT t_id PRIMARY KEY(TokenID),
SeminarID INT,
FOREIGN KEY (SeminarID) REFERENCES seminar(seminar_id),
TokenType VARCHAR(10));

CREATE table presenter( presenter_id INT AUTO_INCREMENT,
CONSTRAINT p_id  PRIMARY KEY(presenter_id),
seminarID INT,
FOREIGN KEY (seminarID) REFERENCES seminar(seminar_id),
p_Name VARCHAR(30),
Phone VARCHAR(15),
Email VARCHAR(40),
Address VARCHAR(20));

CREATE TABLE Audience( AudienceID INT,
CONSTRAINT a_id PRIMARY KEY(AudienceID),
tokenID INT,
FOREIGN KEY (tokenID) REFERENCES token(TokenID),
AudienceName VARCHAR(20),
Address VARCHAR(15),
PhoneNo VARCHAR(15),
Email VARCHAR(40));

CREATE TABLE Question( QuestionID INT,
CONSTRAINT q_id PRIMARY KEY(QuestionID),
QuestionType VARCHAR(10),
Options VARCHAR(10));

CREATE TABLE Question_Audience( QuestionID INT,
FOREIGN KEY(QuestioNID) REFERENCES Question(QuestionID),
AudienceID INT,
FOREIGN KEY(AudienceID) REFERENCES Audience(AudienceID));

CREATE TABLE Answer( AnswerID INT,
CONSTRAINT a_id PRIMARY KEY(AnswerID),
CorrectOption VARCHAR(3));
 
CREATE TABLE Answer_Question( AnswerID INT,
FOREIGN KEY(AnswerID) REFERENCES Answer(AnswerID),
QuestionID INT,
FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID));

CREATE TABLE Answer_Audience( AnswerID INT, 
FOREIGN KEY(AnswerID) REFERENCES Answer(AnswerID),
AudienceID INT,
FOREIGN KEY(AudienceID) REFERENCES Audience(AudienceID));

INSERT INTO Organizer values('1', 'ram', '9847364738', 'ram@gmail.com', 'computer');
INSERT INTO Organizer values('2', 'shyam', '982654210', 'shyam@gmail.com', 'database');
INSERT INTO Organizer values('3', 'gita', '9854736354', 'gita@gmail.com', 'Designing');
INSERT INTO Organizer values('4', 'sita', '98017640458', 'sita@gmail.com', 'software');
INSERT INTO Organizer values('5', 'hari', '9842764642', 'hari@gmail.com', 'OOP');

INSERT INTO seminar(organizer_id, title, location, date) VALUES('1', 'Database', 'Kathmandu', '2020-8-8');
INSERT INTO seminar(organizer_id, title, location, date) VALUES('2', 'Software Design', 'Bhaktapur', '2021-3-5');
INSERT INTO seminar(organizer_id, title, location, date) VALUES('3', 'OOP', 'Lalitpur', '2022-5-3');
INSERT INTO seminar(organizer_id, title, location, date) VALUES('4', 'Business', 'Pokhara', '2019-6-23');
INSERT INTO seminar(organizer_id, title, location, date) VALUES('5', 'Activity', 'Illam', '2018-12-5');

SELECT * FROM organizer;
SELECT * FROM seminar s JOIN organizer o ON s.organizer_ID = o.OrganizerID;