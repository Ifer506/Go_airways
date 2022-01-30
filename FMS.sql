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

select * from searchDetails;
select * from travellers;
select * from ContactDetails;
select * from TravellersDetails;

drop table customer;
drop table travellers;
drop table TravellersDetails;