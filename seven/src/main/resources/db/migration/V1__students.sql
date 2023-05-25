CREATE TABLE students(
                           id bigserial PRIMARY KEY,
                           s_name VARCHAR(255),
                           age integer
);

INSERT INTO students (s_name,age) VALUES
                                    ('Joel', 34),
                                    ('Ally', 23),
                                    ('Mark', 20),
                                    ('Eddy', 24),
                                    ('Tom', 24),
                                    ('Mary', 20);
