create database Angular3 ;
use angular3;
create table employee(emp_id varchar(10), firstname varchar(20), lastname varchar(20), mob varchar(10), design varchar(14), salary float) ;
alter table employee add primary key(emp_id);
insert into employee values('emp101', 'Rohan', 'kumar', '9800012345', 'Developer', 75000);
select * from employee;
select emp_id, firstname, lastname, mob from employee;
insert into employee values('emp102', 'Aryan', 'Kumar', '9910054321', 'Sr Developer', 95000);
insert into employee values('emp103', 'Sudha', 'Gupta', '7800054321', 'DBA', 98000);
insert into employee values('emp104', 'Akash', 'Mohan', '9765034589', 'Jr Developer', 55000);
insert into employee values('emp105', 'Ganga', 'Ram', '7800056744', 'Manager', 65000);
insert into employee values('emp106', 'Deepak', 'Raj', '7856056555', 'Developer', 78000);
select * from employee;
select * from employee where salary > 70000;
select distinct design from employee;
select count(distinct design) from employee;
update employee
set salary = 58000
where emp_id = 'emp104';
delete from employee where emp_id = 'emp106';
update employee
set mob = null
where emp_id = 'emp104';
update employee
set mob = '7800012300'
where emp_id = 'emp104';
alter table employee add column hobby varchar(20);
update employee set hobby = 'reading' where emp_id = 'emp101';
alter table employee drop column hobby;
describe employee;
select * from employee order by salary desc;
select sum(salary), design from employee group by design;
alter table employee add column dob date;
update employee set dob = '1999-02-24' where emp_id='emp101';
update employee set dob = '2001-8-18' where emp_id='emp103';
update employee set dob = '2002-9-18' where emp_id='emp104';
update employee set dob = '1998-12-22' where emp_id='emp102';
update employee set dob = '2003-07-11' where emp_id='emp105';
select * from employee;
select * from employee where dob > '2001-01-01';
create table skills (s_id int primary key, s_name varchar(10));
select * from skills;
select * from employee, skills;
insert into skills values (101,'Java'),(102,'React'),(103,'MySQL'),(104,'MongoDB');