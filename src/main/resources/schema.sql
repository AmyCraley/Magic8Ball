

DROP TABLE IF EXISTS magic8ball;
DROP TABLE IF EXISTS categories;


CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    title VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE magic8ball (
    id SERIAL PRIMARY KEY,
    answer TEXT NOT NULL,
    category_id INT REFERENCES categories(id)
);