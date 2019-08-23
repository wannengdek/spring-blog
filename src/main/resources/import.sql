INSERT INTO user (id, username, password, name, email) VALUES (10, 'admin', '123', '老卫', 'i@waylau.com');
INSERT INTO user (id, username, password, name, email)  VALUES (11, 'waylau', '123', 'Way Lau', 'waylau@waylau.com');

#INSERT INTO authority (id, name) VALUES (1, 'ROLE_ADMIN');
#INSERT INTO authority (id, name) VALUES (2, 'ROLE_USER');

INSERT INTO user_authority (user_id, authority_id) VALUES (10, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (11, 2);
