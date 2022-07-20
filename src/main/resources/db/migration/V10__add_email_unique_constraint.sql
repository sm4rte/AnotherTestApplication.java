delete from planet;
delete from lord;
alter table lord add constraint email_unique unique(email)