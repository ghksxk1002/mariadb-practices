select *from user;
desc user;
insert    into user  values(null, 111,111,111, 'male', now());
insert into user values(null, '둘리','1234', '1234','male',now());
delete from user where no=2;
select * from guestbook;

update user
   set name = '이승환', email = 'ghksxk1002@naver.com', password = '1234', gender = 'famale'
 where no = 2;

select * from board;

-- ifnull(null이 아닌 경우, null인 경우)
-- ifnull((select max(group_no) from board)+ 1     , 1) 
-- ifnull((select max(group_no) from board)     , 0) + 1 
insert into board values(null, "여섯번번째 글입니다", "안녕하세요", default, now(), ifnull((select max(group_no) from board b), 0)+1, 0, 0, 1);


	select b.no, b.title, u.name ,b.hit, b.reg_date 
	 from board b, user u
	where b.user_no = u.no
 order by group_no desc, order_no asc
	limit 0,10;

delete from board where no = 4;