-- Categories
INSERT INTO categories (title) VALUES ('classic');
INSERT INTO categories (title) VALUES ('coding');
INSERT INTO categories (title) VALUES ('artist');

-- Classic answers
INSERT INTO magic8ball (answer, category_id) VALUES ('Without a doubt', 1);
INSERT INTO magic8ball (answer, category_id) VALUES ('Yes definitely', 1);
INSERT INTO magic8ball (answer, category_id) VALUES ('Ask again later', 1);
INSERT INTO magic8ball (answer, category_id) VALUES ('Answer unclear', 1);
INSERT INTO magic8ball (answer, category_id) VALUES ('Very doubtful', 1);



-- Coding answers
INSERT INTO magic8ball (answer, category_id) VALUES ('Missing a curly bracket', 2);
INSERT INTO magic8ball (answer, category_id) VALUES ('Have you tried restarting it?', 2);
INSERT INTO magic8ball (answer, category_id) VALUES ('No semicolon', 2);
INSERT INTO magic8ball (answer, category_id) VALUES ('I am a teapot', 2);
INSERT INTO magic8ball (answer, category_id) VALUES ('Spelling error in syntax', 2);



-- Artist answers
INSERT INTO magic8ball (answer, category_id) VALUES ('Trust the creative process', 3);
INSERT INTO magic8ball (answer, category_id) VALUES ('Go for a walk', 3);
INSERT INTO magic8ball (answer, category_id) VALUES ('Throw it away. Start over.', 3);
INSERT INTO magic8ball (answer, category_id) VALUES ('Just start. Make it excellent later.', 3);
INSERT INTO magic8ball (answer, category_id) VALUES ('Take it outside', 3);