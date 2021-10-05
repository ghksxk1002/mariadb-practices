drop table member;
create table member(
	no int(11) not null auto_increment,
	email varchar(200) not null,
	password varchar(32) not null,
	name varchar(100) not null,
	department varchar(100),
	primary key(no)
);

desc member;
-- 테이블에 칼럼 추가
alter table member add junimbunho char(13) not null after email;
desc member;
-- 테이블 칼럼
alter table member drop junimbunho;
desc member;

alter table member add join_data char(13) not null;
alter table member add self_intro text;

desc member;

insert 
	into member
  values(null, 'ghksxk1002@naver.com', password('1234'), '이승현', '개발팀', now(), null);
  
insert 
	into member(no, email, password, name, department, join_data)
  values(null, 'ghksxk1002@naver.com', password('123456'), '이승현3', '개발팀3', now());
  
select * from member;

-- 카럼명 변경
alter table member change deparment department varchar(100) not null;
desc member;

-- delete
delete
	from member
  where no = 4;
  

-- transaction
select @@autocommit;
set autocommit = 1;

-- DML 
