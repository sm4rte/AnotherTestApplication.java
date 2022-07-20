CREATE table if not exists planet(
    id          bigserial       primary key ,
    name        varchar(30)     not null ,
    age         smallint        not null check (age>0),
    area        int             not null check (area>0),
    lord_id     bigint          references lord(id)         not null

);

comment on table planet is 'Планеты';
comment on column planet.name is 'Имя планеты';
comment on column planet.age is 'Возрасть планеты';
comment on column planet.area is 'Площадь планеты';
comment on column planet.lord_id is 'id лорда планеты';