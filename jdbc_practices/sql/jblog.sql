desc blog;
desc category;
desc post;
desc user;

select * from blog;
select * from category where blog_id = 'ghksxk1002';
select * from post;
select * from user;
delete from category where no =17 and blog_id='ghksxk1002';





-- 회원가입
delete from user where id='jjjj';
select * from user;
insert into user values('waterMelon', '이승현', '1234', now());
select id, password, join_date
  from user
 where id ='도치';

-- 로그인
select * from user;
delete from blog where id='jjjj';


-- 블로그
select * from blog;
insert into blog values('ghksxk1002', ' ', ' ');
insert into blog values('ghksxk1002', '안녕하세요', '/images/spring-logo.jpg');

update blog set title='안녕', logo='/images/202110312346834.png' where id='ghksxk1002';

select title, logo
  from blog
 where id = 'ghksxk1002';
 
 
-- 카테고리
delete from category;
select * from category;
insert into category values(null, '미분류', '카테고리를 지정하지 않은 경우', 'ghksxk1002');
insert into category values(null, 'Spring', '스프링에 대하여', 'ghksxk1002');

   select category_no ,count(*) as cnt
     from post
 group by category_no;
 
 select c.no, c.name, c.desc, ifnull((b.cnt) , '0') as count
   from category c left join (select category_no ,count(*) as cnt
								   from post
							   group by category_no) b 
	 on c.no = b.category_no
  where c.blog_id = 'ghksxk1002';
  
select no from category where name='미분류' and blog_id='ghksxk1002';

delete from category where no=4;

 -- 불로그
 insert into post values(null, '스프링이랑', '아직 공부중',  now(),  '3');

select p.no, count(*) as cnt
  from post as p, category as c 
	where p.category_no = c.no
   and c.name='미분류';
   
-- 포스트
select name from category where blog_id='ghksxk1002';
select * from post;

select no, title, contents, reg_date
  from post
 where category_no=3
   and reg_date = max(reg_date)
order by reg_date desc;
 
select title, contents
  from post as p, category as c
 where p.category_no = c.no
   and c.blog_id = "ghksxk1002"
order by reg_date desc
limit 0, 1;

select p.no, p.title, p.contents, p.reg_date, p.category_no
  from category as c, post as p
 where c.no = p.category_no 
   and blog_id = 'ghksxk1002'
   and name = '미분류'
   order by p.reg_date desc;
   
   
delete from post where category_no= 666;