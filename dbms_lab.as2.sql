use hasan;

create table emp1 (
ID numeric(2),
Name varchar(10),
Basic numeric(6,2),
Designation Varchar(10),
Age numeric(2)
);
describe emp1;
alter table emp1 modify Basic int;
alter table emp1 modify Name varchar(15);
create table emp_trainee select * from emp1;
describe emp_trainee;
alter table emp_trainee rename column ID to Emp_id;
insert into emp1(ID, Name, Basic, Designation, Age) values (1, 'aaaa', 6000, 'Manager', 34);
insert into emp1(ID, Name, Basic, Designation, Age) values (2, 'bbbb', 7000, 'Engineer', 37);
insert into emp1(ID, Name, Basic, Designation, Age) values (3, 'cccc', 7300, 'Engineer', 35);
insert into emp1(ID, Name, Basic, Designation, Age) values (4, 'dddd', 7700, 'Trainee', 38);
insert into emp1(ID, Name, Basic, Designation, Age) values (5, 'eeee', 7230, 'Trainee', 36);
insert into emp1(ID, Name, Basic, Designation, Age) values (6, 'ffff', 8000, 'Trainee', 5);
select * from emp1;
select * from emp_trainee;
insert into emp_trainee select * from emp1;
alter table emp1 add Skills varchar(10);
alter table emp1 add DOJ Date;
describe emp1;
update emp1 set Skills = 'Java' where ID = '1';
update emp1 set DOJ = '2022-08-02' where ID = '1';
update emp1 set Skills = 'Spring' where ID = '2';
update emp1 set DOJ = '2022-08-02' where ID = '2';
update emp1 set Skills = 'MySQL' where ID = '3';
update emp1 set DOJ = '2022-08-02' where ID = '3';
update emp1 set Skills = 'Python' where ID = '4';
update emp1 set DOJ = '2022-08-02' where ID = '4';
update emp1 set Skills = 'Junit' where ID = '5';
update emp1 set DOJ = '2022-08-02' where ID = '5';
update emp1 set Skills = 'Java' where ID = '6';
update emp1 set DOJ = '2022-08-02' where ID = '6';
alter table emp_trainee modify Designation varchar(20);
update emp_trainee set Designation = 'Programmer_trainee';
 
alter table emp1 modify ID varchar(5);
select * from emp1;
select * from emp_trainee;

alter table emp1 rename column Age to Age_in_Years;
delete from emp1;
alter table emp_trainee drop column basic, drop column Designation;
alter table emp1 rename column Emp to Emp_Mgr_Engr;
drop table emp_trainee;
