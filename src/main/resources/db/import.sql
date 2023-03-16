-- general setting that
-- select setval('hibernate_sequence', 1000)

-- person
insert into x_person (p_id, p_dob, p_name)
values (nextval('hibernate_sequence'),'2000-01-02','John Doe');

-- vehicle
insert into x_vehicle (v_id, v_brand, v_model)
values (nextval('hibernate_sequence'), 'VW', 'eGolf');
insert into x_vehicle (v_id, v_brand, v_model)
values (nextval('hibernate_sequence'), 'Toyota', 'Prius');
insert into x_vehicle (v_id, v_brand, v_model)
values (nextval('hibernate_sequence'), 'Kia', 'Ionic 5');

-- rental
insert into x_rental (r_id, r_discount, r_end_date_time, r_start_date_time, r_p_id, r_v_id)
values(1, 0, '2023-03-17 17:16:00', '2023-03-16 10:56:00', 1, 2);
insert into x_rental (r_id, r_discount, r_end_date_time, r_start_date_time, r_p_id, r_v_id)
values(2, 0, '2023-03-17 17:16:00', '2023-03-16 10:56:00', 1, 3);
