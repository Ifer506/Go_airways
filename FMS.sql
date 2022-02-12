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
Detaination varchar(20) 
);

create table register_gui(
fName varchar(20),
lName varchar(20),
uName varchar(30),
eMail varchar(50),
pNumber varchar(15),
password varchar(30),
cPassword varchar(30),
gender varchar(7),
date varchar(20));

create table AddUser(
fName varchar(20),
lName varchar(20),
uName varchar(20),
eMail varchar(40),
pNumber varchar(14)
);

create table UpdateFlight(
fNumber varchar(10),
dTime varchar(20),
aTime varchar(20),
destination varchar(20),
flightCost varchar(10)
);

select * from register_gui;
select * from searchDetails;
select * from travellers;
select * from ContactDetails;
select * from TravellersDetails;
select * from updateDetails;
select * from adduser;
select * from UpdateFlight;

drop table register_gui;
drop table AddUser;
drop table customer;
drop table travellers;
drop table TravellersDetails;