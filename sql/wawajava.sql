drop table if exists profiles;

create table profiles (
  id        bigserial   not null,
  username  varchar(64) not null unique,
  firstname varchar(64),
  lastname  varchar(64),
  password  varchar(64) not null,
  email     varchar(32),

  primary key(id)
);

insert into profiles(username, password) values
  ('john', '12345');

insert into profiles(username, password) values
  ('anna', 'ania0987');

insert into profiles(username, password) values
  ('johnny', '12345');

insert into profiles(username, password) values
  ('admin', 'root');
