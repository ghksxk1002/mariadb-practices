-- 서브쿼리(SUBQUERY) SQL 문제입니다.

-- 문제1.
-- 현재 평균 연봉보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select avg(salary)
  from salaries;
  
select count(*)
  from salaries
 where salary >= (select avg(salary) 
						from salaries 
						where to_date = '9999-01-01');
                        
-- 문제2. 
-- 현재, 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 부서 연봉을 조회하세요. 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나야 합니다.
-- select a.emp_no as '사번', concat(a.first_name,' ',a.last_name) as '이름', c.salavg as '부서 연봉'
select *
  from employees a, (select b.emp_no as emp, avg(b.salary) as salavg
					   from dept_emp a, salaries b
					  where a.emp_no = b.emp_no
						and a.to_date = '9999-01-01'
						and b.to_date = '9999-01-01'
				   group by a.dept_no
					 having max(b.salary)) c
where a.emp_no = c.emp
order by  c.salavg desc;


SELECT 
    a.emp_no,
    CONCAT(a.first_name, ' ', a.last_name),
    d.dept_name,
    b.salary
FROM
    employees a,
    salaries b,
    dept_emp c,
    departments d,
    (SELECT 
        c.dept_no, max(b.salary) AS max_salary
    FROM
        employees a, salaries b, dept_emp c
    WHERE
        a.emp_no = b.emp_no
            AND a.emp_no = c.emp_no
            AND b.to_date = '9999-01-01'
            AND c.to_date = '9999-01-01'
    GROUP BY c.dept_no) e
WHERE
    a.emp_no = b.emp_no
        AND a.emp_no = c.emp_no
        AND c.dept_no = e.dept_no
        AND b.salary = e.max_salary
        AND e.dept_no = d.dept_no
        AND b.to_date = '9999-01-01'
        AND c.to_date = '9999-01-01'
ORDER BY b.salary DESC;
  
-- 문제3.
-- 현재, 자신의 부서 평균 급여보다 연봉(salary)이 많은 사원의 사번, 이름과 연봉을 조회하세요 
select a.emp_no as '사번', concat(a.first_name,' ',a.last_name) as '이름', b.salary as '연봉'
  from employees a, salaries b, dept_emp c, 
	   (select c.dept_no, avg(b.salary) as salavg
		  from employees a, salaries b, dept_emp c
		 where a.emp_no = b.emp_no
		   and a.emp_no = c.emp_no
		   and b.to_date = '9999-01-01'
		   and c.to_date = '9999-01-01'
	  group by c.dept_no) d
 where a.emp_no = b.emp_no
   and a.emp_no = c.emp_no
   and c.dept_no = d.dept_no
   and b.to_date = '9999-01-01'
   and c.to_date = '9999-01-01'
   and b.salary >= d.salavg;
      
	
-- 문제4.
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
select a.first_name
  from employees a, dept_manager b, dept_emp c, departments d
 where a.emp_no = b.emp_no
   and 
   and b.to_date = '9999-01-01'
   
-- 문제5.
-- 현재, 평균연봉이 가장 높은 부서의 사원들의 사번, 이름, 직책, 연봉을 조회하고 연봉 순으로 출력하세요.

-- 문제6.
-- 평균 연봉이 가장 높은 부서는? 

-- 문제7.
-- 평균 연봉이 가장 높은 직책?

-- 문제8.
-- 현재 자신의 매니저보다 높은 연봉을 받고 있는 직원은?
-- 부서이름, 사원이름, 연봉, 매니저 이름, 메니저 연봉 순으로 출력합니다.

