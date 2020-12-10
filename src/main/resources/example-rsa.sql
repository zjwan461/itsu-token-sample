CREATE TABLE IF NOT EXISTS sys_token (
    id char(32) not null primary key,
    name varchar(255) not null,
    private_t varchar(900) not null,
	public_t varchar(255) not null
);