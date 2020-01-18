-- Hibernate: create table employee (id integer not null, age integer not null, name varchar(255), salary double not null, primary key (id))

insert into employee values ( 100, 20, 'batman',50000.00);
insert into employee values ( 101, 25, 'spiderman',100000.00);
insert into employee values ( 102, 30, 'superman',150000.00);

-- address (id integer generated by default as identity, address_details varchar(255), employee_id integer, primary key (id))
--insert into address values (1001,'Address 1',100);
--insert into address values (1002,'Address 2',100);