INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('Alex Brown', 'alex@gmail.com', '988888888', '$2a$10$xcdwD9pHDE8zX9JFNumMbey4pNlV.tY6tmjIuYae00rSQB8X1tmMq', '2001-07-25');
INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('Bob Brown', 'bob@gmail.com', '977777777', '$2a$10$xcdwD9pHDE8zX9JFNumMbey4pNlV.tY6tmjIuYae00rSQB8X1tmMq', '1987-12-13');
INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('Maria Green', 'maria@gmail.com', '977777777', '$2a$10$xcdwD9pHDE8zX9JFNumMbey4pNlV.tY6tmjIuYae00rSQB8X1tmMq', '1987-12-13');


INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('BOOTCAMP HTML', 'https://images.pexels.com/photos/18999469/pexels-photo-18999469/free-photo-of-business-training-course.jpeg', 'https://images.pexels.com/photos/18999469/pexels-photo-18999469/free-photo-of-business-training-course.jpeg');

INSERT INTO tb_offer(edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:00.0000Z', TIMESTAMP WITH TIME ZONE '2022-11-19T03:00:00.0000Z', 1);
INSERT INTO tb_offer(edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2022-12-20T03:00:00.0000Z', TIMESTAMP WITH TIME ZONE '2023-12-19T03:00:00.0000Z', 1);