desc blog;
desc category;
desc post;
desc user;

select * from blog;
select * from category;
select * from post;
select * from user;


-- 회원가입
delete from user;
select * from user;
insert into user values('waterMelon', '이승현', '1234', now());
select id, password, join_date
  from user
 where id ='도치';

-- 로그인
select * from user;
delete from blog ;


-- 블로그
select * from blog;
insert into blog values('ghksxk1002', ' ', ' ');
insert into blog values('ghksxk1002', '안녕하세요', '/images/spring-logo.jpg');

update blog set title='안녕', logo='20211031536180.png' where id='ghksxk1002';

select title, logo
  from blog
 where id = 'ghksxk1002';