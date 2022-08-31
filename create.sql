create table delivery (id int8 generated by default as identity, created_date timestamp, updated_date timestamp, adress varchar(255), delivery_man_user_id int8, target_user_id int8, primary key (id));
create table delivery_item (id int8 generated by default as identity, created_date timestamp, updated_date timestamp, quantity int4, delivery_id int8, item_id int8, primary key (id));
create table item (id int8 generated by default as identity, created_date timestamp, updated_date timestamp, name varchar(255), price numeric(19, 2), restaurant_id int8, primary key (id));
create table restaurant (id int8 generated by default as identity, created_date timestamp, updated_date timestamp, adress_id varchar(255), name varchar(255), user_id int8, primary key (id));
create table users (id int8 generated by default as identity, created_date timestamp, updated_date timestamp, age int4 not null, email varchar(255), name varchar(255), password varchar(255), sex varchar(255), primary key (id));
alter table if exists delivery add constraint FKll5x43qodwcux14elxk9wmjnh foreign key (delivery_man_user_id) references users;
alter table if exists delivery add constraint FKlikq6myeysd1vk3c0nbkt2dt2 foreign key (target_user_id) references users;
alter table if exists delivery_item add constraint FK56cvume0tkg1ai7j33bsdmlx8 foreign key (delivery_id) references delivery;
alter table if exists delivery_item add constraint FK5roqjsmjv6aiba8yqb1r8cecc foreign key (item_id) references item;
alter table if exists item add constraint FK2ip7t8cv2p1ghfi1e796yet7d foreign key (restaurant_id) references restaurant;
alter table if exists restaurant add constraint FKrt5k9gntifk742w7kva1cyu1v foreign key (user_id) references users;