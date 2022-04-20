INSERT INTO tb_user (name,email,password) VALUES ('bob','bob@gmail.com','$2a$12$K1PzL1caT3Ss4Kh9WC8Uz.B7.lshVfOcWNZfwcVz941NWCSidZtLm');
INSERT INTO tb_user (name,email,password) VALUES ('ana','ana@gmail.com','$2a$12$K1PzL1caT3Ss4Kh9WC8Uz.B7.lshVfOcWNZfwcVz941NWCSidZtLm');

INSERT INTO tb_role (authority) VALUES('VISITOR');
INSERT INTO tb_role (authority) VALUES('MEMBER');

INSERT INTO tb_user_role(user_id,role_id) VALUES(1,1);
INSERT INTO tb_user_role(user_id,role_id) VALUES(2,2);