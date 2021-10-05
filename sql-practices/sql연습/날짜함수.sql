-- 함수 : 날짜 함수

-- CURDATE(), CURRENT_DATE
select CURDATE(), current_date();

-- CUTTIME(), CURRENT_TIME
select CURTIME(), current_time();

-- now() -> 쿼리가 시작된 시간, sysdate() -> 이함수가 실행된 시간
select now(), sysdate();
select now(), sleep(2), now();
select sysdate(), sleep(2), sysdate();

-- date_formaet(data, format 문자열)
select date_format(now(), '%Y년 %m월 %d요일 %h : %i : %s') as '오늘의 날짜/시간';

-- period_diff
-- YYMM, YYYYMM
-- 예제) 근무 개월 수를 출력
select first_name, period_diff(date_format(curdate(), '%Y%m'), date_format(hire_date,'%Y%m')) as month
  from employees
order by month desc;

-- date_add(==adddate), date_sub(subdate)
-- 날짜를 date에 type(day, month, year) 형식으로 표현식(exper) 더하거나 뺀다.
-- 예제) 각 사원들의 근무 년수가 5년이 되는 날은 언젱인가
select first_name, hire_date, date_add(hire_date, interval 5 year)
  from employees;

-- cast
select 12345 + 10, cast('12345' as int) + 10;
select date_format(cast('2021-10-01' as date), '%Y월-%m-%d');
select cast(cast(1-2 as unsigned) as signed);

-- mysql type
-- varchar(2000 정도 지정가능) : 문자열, char, text, CLOB(Character Large OBject) --> string 타입
-- signed(unsigned), int(integer), medium int, big int --> 정수형 타입
-- float, double
-- time, date, datetime --> 날짜 타입
-- LOB : CLOB, BLOOB=> 멀티미디어에 사용하는것 ex) 네이버 음악 검색 
  