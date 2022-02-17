create database FMS;
use FMS;
create table searchDetails(
from0 varchar(20) ,
to0 varchar(30),
ddate varchar(30),
adate varchar(20),
nationality varchar(10));

create table travellers(
travellers varchar(20));

create table ContactDetails(
firstName varchar(20),
lastName varchar(20),
nationality varchar(20),
contactNo varchar(20),
eMail varchar(50));

create table TravellersDetails(
fullName varchar(40),
nationality varchar(20));

create table updateDetails(
flightNumber varchar(20),
Dep_Time varchar(20),
Arr_Time varchar(20),
Detaination varchar(20) );

create table register_gui(
fName varchar(20),
lName varchar(20),
uName varchar(30),
eMail varchar(50),
pNumber varchar(15),
gender varchar(7),
DateOFBirth varchar(20),
admin varchar(10),
password varchar(30),
cPassword varchar(30));

create table AddUser(
First_Name varchar(20),
Last_Name varchar(20),
User_Name varchar(20),
EMail varchar(40),
Phone_Number varchar(14), 
Password varchar(20),
Confirm_Password varchar(20),
Admin varchar(10));

create table UpdateFlight(
Flight_Number varchar(10),
Departure_Time varchar(20),
Arrival_Time varchar(20),
From_ VARCHAR(20),
Destination varchar(20),
Flight_Cost varchar(10));

create table book(
flightNumber varchar(20)
);

create table registration(
FirstName varchar(20),
LastName varchar(20),
UserName varchar(20),
Email varchar (20),
Number bigint,
Address varchar(20),
PassWord varchar(20),
DateOfBirth varchar(20),
Gender varchar(20)
);

select * from adduser;
select fName,lName from register_gui;
delete from register_gui where uName = 'kjhk'