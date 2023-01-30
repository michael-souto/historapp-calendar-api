create table historical_calendar (id  bigserial not null, comments TEXT, name varchar(255), primary key (id));
create table historical_date (id  bigserial not null, historicDay int4 not null, historicYear int4 not null, historical_calendar_id int8 not null, calendar_month_id int8 not null, primary key (id));
create table historical_month (id  bigserial not null, agriculture varchar(255), averageTemperature varchar(255), comments TEXT, name varchar(255), numberDays int4 not null, orderYear int4 not null, historical_calendar_id int8 not null, primary key (id));
alter table if exists historical_date add constraint FK1_historical_date foreign key (historical_calendar_id) references historical_calendar;
alter table if exists historical_date add constraint FK2_historical_date foreign key (calendar_month_id) references historical_month;
alter table if exists historical_month add constraint FK1_historical_month foreign key (historical_calendar_id) references historical_calendar;