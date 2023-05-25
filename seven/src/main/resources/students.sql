CREATE TABLE students(
                           id bigserial PRIMARY KEY,
                           name VARCHAR(255),
                           age integer
);

INSERT INTO students (name,age) VALUES (
                                    ('Joel', 34),
                                    ('Ally', 23),
                                    ('Mark', 20),
                                    ('Eddy', 24),
                                    ('Tom', 24),
                                    ('Mary', 20)
);