CREATE TABLE IF NOT EXISTS root_entity (
  id   SERIAL PRIMARY KEY,
  name VARCHAR(100),
  some_date  TIMESTAMP
);
CREATE TABLE IF NOT EXISTS one_to_many_obj (
  id   SERIAL PRIMARY KEY,
  root_entity INT,
  volume  INT,
  expiration_date DATE,
  obj_group INT,
  obj_types INT[],
  FOREIGN KEY (root_entity) REFERENCES root_entity(id)
);
