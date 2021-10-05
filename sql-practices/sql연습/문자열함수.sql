-- 함수 : 문자열

-- uper
select upper('buSan'), upper('busan'), upper('Douzone');
select upper(first_name) from employees;

-- lower
select lower('buSan'), lower('busan'), lower('Douzone');
select lower(first_name) from employees;

-- substring(뭄자열(칼럼에있는데이터), index, length)
-- DB는 문자열 인덱스가 1부터 시작한다
select substring('Hello world', 3, 2);

-- 예제) 1989년에 입사한 사원들의 이름, 입사일 출력
select first_name, hire_date
  from employees 
 where hire_date = substring(hire_date, 1, 4);
 
-- lpad, rpad : 왼쪽정령 오른쪽 정령
select lpad('1234', 10, '~');
select rpad('1234', 10, '~');

-- 예제) 직원들의 월급을 오른쪽 정령(빈공간은 *)
select lpad(salary, 10, '*') from salaries;

-- trim, ltrim, rtrim
select concat('---',ltrim('   hellow   '),'---'),
	   concat('---',rtrim('   hellow   '),'---'),
       concat('---',trim(both'x'from'xxxhexxxlloxxx'),'---');
       
-- pow(x,y) power(x,y) x의 y승
select pow(2, 10), power(10,2);

-- sign(x)
select sign(20), sign(-100);

-- grestest(x, y, ....), least(x...)
select greatest(10, 40, 60, 12), least(64,10,30,90,80);
select greatest('b','A','C');

       
       