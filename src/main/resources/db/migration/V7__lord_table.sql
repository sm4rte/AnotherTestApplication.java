create table if not exists lord (
    id              bigserial       not null    primary key,
    name            varchar(35)     not null,
    nick            varchar (30)    not null,
    age             smallint        not null check (age>0),
    email           varchar (35)    not null,
    date_of_birth   timestamp       not null,
    check (age<50)
);

comment on table lord is 'Повелители';
comment on column lord.name is 'Имя Лорда';
comment on column lord.nick is 'ник Лорда';
comment on column lord.age is 'Возрасть Лорда';
comment on column lord.email is 'почта Лорда';
comment on column lord.date_of_birth is 'День рождения Лорда';






