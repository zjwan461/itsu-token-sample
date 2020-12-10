CREATE TABLE IF NOT EXISTS sys_token (
    id char(32) not null primary key,
    name varchar(255) not null,
    simple_token char(32) not null
);