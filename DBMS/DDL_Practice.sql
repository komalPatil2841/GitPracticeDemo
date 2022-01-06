use mouri_training;
create table Worker (worker_id varchar(20) primary key, first_name varchar(20),last_name varchar(20),salary int, joining_date datetime, department varchar(20));
desc Worker;
insert into Worker values('001', 'Monika', 'Arora', 100000, '2014-02-20 09:00:00', 'HR');
select * from Worker;

insert into Worker values('002', 'Niharika', 'Verma', 80000, '2014-06-11 09:00:00', 'Admin');
insert into Worker values('003', 'Vishal', 'Singhal', 300000, '2014-02-20 09:00:00', 'HR');
insert into Worker values('004', 'Amitabh', 'Singh', 500000, '2014-02-20 09:00:00', 'Admin');
insert into Worker values('005', 'Vivek', 'Bhati', 500000, '2014-06-11 09:00:00', 'Admin');
insert into Worker values('006', 'Vipul', 'Diwan', 200000, '2014-06-11 09:00:00', 'Account');
insert into Worker values('007', 'Satish', 'Kumar', 75000, '2014-01-20 09:00:00', 'Account');
insert into Worker values('008', 'Geetika', 'Chauhan', 90000, '2014-04-11 09:00:00', 'Admin');

select * from Worker;


create table Bonus(WORKER_REF_ID int(10) primary key, BONUS_DATE datetime, BONUS_AMOUNT float(20));
desc Bonus;
insert into Bonus values(1, '2016-02-20 00:00:00', 5000);
alter table Bonus modify WORKER_REF_ID int;
alter table Bonus modify BONUS_AMOUNT double;
insert into Bonus values(2, '2016-06-11 00:00:00', 3000);
insert into Bonus values(3, '2016-02-20 00:00:00', 4000);
#removed constraint 
alter table Bonus DROP primary key;
insert into Bonus values(1, '2016-02-20 00:00:00', 4500);
insert into Bonus values(2, '2016-06-11 00:00:00', 3500);

select * from Bonus;

show tables;
drop table Worker1;

create table Title(WORKER_REF_ID int, WORKER_TITLE varchar(30), AFFECTED_FROM datetime);
desc Title;
insert into Title values(1, 'Manager', '2016-02-20 00:00:00');
insert into Title values(2, 'Executive', '2016-06-11 00:00:00');
insert into Title values(8, 'Executive', '2016-06-11 00:00:00');
insert into Title values(5, 'Manager', '2016-06-11 00:00:00');
insert into Title values(4, 'Asst. Manager', '2016-06-11 00:00:00');
insert into Title values(7, 'Executive', '2016-06-11 00:00:00');
insert into Title values(6, 'Lead', '2016-06-11 00:00:00');
insert into Title values(3, 'Lead', '2016-06-11 00:00:00');
select * from Title;















