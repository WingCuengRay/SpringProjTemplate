
INSERT INTO Student (id, name, department) VALUES ('40045701', 'Yongcong Lei', 'COMP');
INSERT INTO Student (id, name, department) VALUES ('40045731', 'Ming Li', 'COMP');
INSERT INTO Student (id, name, department) VALUES ('40045732', 'San Zhang', 'COMP');


INSERT INTO Course (id, name) VALUES ('COMP6551', 'Algorithm');
INSERT INTO Course (id, name) VALUES ('COMP6521', 'Database');
INSERT INTO Course (id, name) VALUES ('SOEN6441', 'Advanced Programming Practice');

INSERT INTO Registration(studentID, courseID) VALUES ('40045701', 'COMP6551');
INSERT INTO Registration(studentID, courseID) VALUES ('40045701', 'SOEN6441');