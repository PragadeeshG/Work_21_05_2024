create table if not exists data_streams(
stream_id Integer not null,
stream_flow_type varchar(255) null,
reference_id varchar(255) null,
stream_request_type varchar(255) null,
stream_request_id Integer null,
stream_request_type_code Integer null,
op_code Integer null,
operations varchar(255) null,
client_lib varchar(255) null,
stream_fire_hose varchar(255) null,
data_analystics varchar(255) null,
entity_state varchar(255) null,
constraint data_streams_pk primary key(stream_id));