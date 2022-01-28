create database login_and_registration;
use login_and_registration;
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
select * from registration;