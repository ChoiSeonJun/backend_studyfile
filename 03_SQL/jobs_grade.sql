create table job_grades
( grade_level varchar2(3) CONSTRAINT job_gra_level_pk PRIMARY KEY,
  lowest_sal number,
  highest_sal number);
insert into job_grades values('A',1000, 2999);
insert into job_grades values('B',3000, 5999);
insert into job_grades values('C',6000, 9999);
insert into job_grades values('D',10000, 14999);
insert into job_grades values('E',15000, 24999);
insert into job_grades values('F',25000, 40000);
commit;