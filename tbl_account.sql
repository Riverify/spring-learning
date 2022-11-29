create table tbl_account
(
    id    int primary key auto_increment,
    name  varchar(63),
    money double
);

insert into tbl_account
values (default, 'Tom', 1000);
insert into tbl_account
values (default, 'Jerry', 500);
