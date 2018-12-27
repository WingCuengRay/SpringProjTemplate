drop table if exists Student;
drop table if exists Course;
drop table if exists Registrqtion;

create table Student (
  id VARCHAR(20) PRIMARY KEY,
  name VARCHAR(30),
  department VARCHAR(10)
);

create table Course (
  id VARCHAR(20)  PRIMARY KEY,
  name VARCHAR(30)
);

create table Registration(
  studentID VARCHAR(20) NOT NULL,
  courseID VARCHAR(20) NOT NULL,
  FOREIGN KEY (studentID) REFERENCES Student(id),
  FOREIGN key (courseID) REFERENCES Course(id)
);
