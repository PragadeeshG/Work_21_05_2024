create table if not exists elastic_bean_stalk(
applications varchar(255) not null,
route_fifty varchar(255) null,
load_balancer varchar(255) null,
auto_scaling_group varchar(255) null,
avail_zones varchar(255) null,
elastic_cahce varchar(255) null,
amazon_data_source varchar(255) null,
public_subnet varchar(255) null,
private_subnet varchar(255) null,
status varchar(255) null,
constraint elastic_bean_stalk_pk primary key(applications));